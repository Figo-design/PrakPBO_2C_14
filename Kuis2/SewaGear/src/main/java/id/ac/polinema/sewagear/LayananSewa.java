package id.ac.polinema.sewagear;

/** Mengoordinasikan alur sewa dan pengembalian barang. */
public class LayananSewa {
    private GearRepository repository;
    private KalkulatorBiaya kalkulator;
    private StrukPrinter printer;
    private PemeriksaBarang pemeriksa;
    private RiwayatSewa riwayat = new RiwayatSewa();

    public LayananSewa(GearRepository repository, KalkulatorBiaya kalkulator,
                       StrukPrinter printer, PemeriksaBarang pemeriksa) {
        this.repository = repository;
        this.kalkulator = kalkulator;
        this.printer = printer;
        this.pemeriksa = pemeriksa;
    }

    public void tambahBarang(Perlengkapan barang) {
        repository.simpan(barang);
    }

    public void tampilkanKatalog() {
        System.out.println("=== KATALOG SEWAGEAR ===");
        for (Perlengkapan p : repository.semua()) {
            String status = p.isTersedia() ? "tersedia" : "disewa";
            System.out.println(p.info() + " - " + status);
        }
    }

    /** Sewa 1 hari (default). */
    public void sewa(Penyewa penyewa, String kode) {
        sewa(penyewa, kode, 1);
    }

    public void sewa(Penyewa penyewa, String kode, int hari) {
        Perlengkapan barang = repository.cari(kode);
        if (barang == null) {
            System.out.println("Gagal: barang " + kode + " tidak ditemukan");
            return;
        }
        if (!barang.isTersedia()) {
            System.out.println("Gagal: " + kode + " sedang disewa");
            return;
        }
        RincianBiaya rincian = kalkulator.hitung(penyewa, barang, hari);
        Transaksi t = new Transaksi(riwayat.jumlah() + 1, penyewa, barang, hari, rincian);
        riwayat.tambah(t);
        barang.setTersedia(false);
        printer.cetak(t);
    }

    public void kembalikan(String kode) {
        Perlengkapan barang = repository.cari(kode);
        if (barang == null || barang.isTersedia()) {
            System.out.println("Gagal: " + kode + " tidak sedang disewa");
            return;
        }
        pemeriksa.periksa(barang);
        barang.setTersedia(true);
        System.out.println(kode + " sudah kembali dan tersedia");
    }

    public void laporanPendapatan() {
        int total = 0;
        for (Transaksi t : riwayat.semua()) {
            total += t.getRincian().getTotal();
        }
        System.out.println("=== LAPORAN ===");
        System.out.println("Jumlah transaksi : " + riwayat.jumlah());
        System.out.println("Total pendapatan : " + total);
    }

    public RiwayatSewa getRiwayat() {
        return riwayat;
    }
}
