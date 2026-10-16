package UTS;

public class Buku extends Koleksi {
    private String penulis;

    public Buku(String kode, String judul, String penulis) {
        super(kode, judul);
        this.penulis = penulis;
    }

    public String getPenulis() {
        return penulis;
    }

    public int hitungDenda() {
        return hariTerlambat >= 20 ? 20000 : hariTerlambat * 1000;
    }

    public String getJenis() {
        return "Buku";
    }
}
