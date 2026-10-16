package UTS;

public abstract class Koleksi {
    protected String kode;
    protected String judul;
    protected int hariTerlambat;
    private Anggota peminjam;

    protected Koleksi(String kode, String judul) {
        this.kode = kode;
        this.judul = judul;
    }

    public String getKode() {
        return kode;
    }

    public String getJudul() {
        return judul;
    }

    public void setPeminjam(Anggota peminjam) {
        this.peminjam = peminjam;
    }

    public Anggota getPeminjam() {
        return peminjam;
    }

    public void setHariTerlambat(int hariTerlambat) {
        if (hariTerlambat < 0) {
            System.out.println("Hari terlambat tidak boleh negatif");
        }
        this.hariTerlambat = hariTerlambat;
    }

    public int getHariTerlambat() {
        return hariTerlambat;
    }

    public int hitungDenda() {
        return hariTerlambat * 1000;
    }

    public String getJenis() {
        return "Koleksi";
    }
}
