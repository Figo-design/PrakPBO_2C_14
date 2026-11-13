package id.ac.polinema.sewagear;

/**
 * Induk semua barang yang bisa disewa.
 * Abstract: tidak ada "perlengkapan" yang wujudnya umum, yang ada Tenda, Carrier, dsb.
 */
public abstract class Perlengkapan {
    protected String kode;
    protected String nama;
    protected int tarifHarian;
    private boolean tersedia = true;

    public Perlengkapan(String kode, String nama, int tarifHarian) {
        this.kode = kode;
        this.nama = nama;
        this.tarifHarian = tarifHarian;
    }

    public String getKode() { return kode; }
    public String getNama() { return nama; }
    public int getTarifHarian() { return tarifHarian; }
    public boolean isTersedia() { return tersedia; }
    public void setTersedia(boolean tersedia) { this.tersedia = tersedia; }

    /** Biaya sewa = tarif harian x lama hari + biaya tambahan khas tiap barang. */
    public int hitungSewa(int hari) {
        return tarifHarian * hari + biayaTambahan(hari);
    }

    /** Biaya tambahan khas tiap jenis barang (boleh 0). */
    protected abstract int biayaTambahan(int hari);

    /** Nama kategori barang, misalnya "Tenda". */
    public abstract String getKategori();

    public String info() {
        return kode + " - " + nama + " [" + getKategori() + "] Rp" + tarifHarian + "/hari";
    }
}
