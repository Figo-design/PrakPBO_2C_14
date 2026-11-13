package id.ac.polinema.sewagear;

public class Transaksi {
    private int nomor;
    private Penyewa penyewa;
    private Perlengkapan barang;
    private int hari;
    private RincianBiaya rincian;

    public Transaksi(int nomor, Penyewa penyewa, Perlengkapan barang, int hari, RincianBiaya rincian) {
        this.nomor = nomor;
        this.penyewa = penyewa;
        this.barang = barang;
        this.hari = hari;
        this.rincian = rincian;
    }

    public int getNomor() { return nomor; }
    public Penyewa getPenyewa() { return penyewa; }
    public Perlengkapan getBarang() { return barang; }
    public int getHari() { return hari; }
    public RincianBiaya getRincian() { return rincian; }
}
