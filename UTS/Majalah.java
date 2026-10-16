package UTS;

public class Majalah extends Koleksi {
    private String edisi;

    public Majalah(String kode, String judul, String edisi) {
        super(kode, judul);
        this.edisi = edisi;
    }

    public int hitungDenda() {
        return hariTerlambat * 500;
    }

    public String getJenis() {
        return "Majalah";
    }
}
