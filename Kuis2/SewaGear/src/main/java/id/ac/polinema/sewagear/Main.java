package id.ac.polinema.sewagear;

public class Main {
    public static void main(String[] args) {
        // Menyiapkan aturan potongan per jenis member
        KalkulatorBiaya kalkulator = new KalkulatorBiaya();
        kalkulator.daftarkanPotongan(JenisMember.REGULER, new PotonganReguler());
        kalkulator.daftarkanPotongan(JenisMember.MAHASISWA, new PotonganMahasiswa());
        kalkulator.daftarkanPotongan(JenisMember.KOMUNITAS, new PotonganKomunitas());

        LayananSewa layanan = new LayananSewa(new InMemoryGearRepository(), kalkulator,
                new StrukPrinter(), new PemeriksaBarang());

        // Data barang
        layanan.tambahBarang(new Tenda("TD01", "Tenda Dome", 50000, 4));
        layanan.tambahBarang(new Carrier("CR01", "Carrier Explorer", 35000, 60));
        layanan.tambahBarang(new KomporPortable("KP01", "Kompor Lipat", 20000));
        layanan.tambahBarang(new Headlamp("HL01", "Headlamp LED", 10000));
        layanan.tambahBarang(new Tenda("TD02", "Tenda Keluarga", 75000, 6));

        // Data penyewa
        Penyewa raka = new Penyewa("Raka", "0812-1111-0001", JenisMember.MAHASISWA);
        Penyewa sinta = new Penyewa("Sinta", "0812-1111-0002", JenisMember.KOMUNITAS);
        Penyewa dewi = new Penyewa("Dewi", "0812-1111-0003", JenisMember.REGULER);

        // Skenario
        layanan.tampilkanKatalog();
        layanan.sewa(raka, "TD01", 3);
        layanan.sewa(sinta, "KP01", 2);
        layanan.sewa(dewi, "TD01", 1);
        layanan.sewa(dewi, "XX99", 1);
        layanan.sewa(dewi, "HL01");
        layanan.kembalikan("TD01");
        layanan.kembalikan("KP01");
        layanan.sewa(dewi, "TD02", 2);
        layanan.sewa(raka, "KP01", 5);
        layanan.tampilkanKatalog();
        layanan.laporanPendapatan();
    }
}
