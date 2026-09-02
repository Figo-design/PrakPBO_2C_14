public class Kamus extends Buku{ 
    private String bahasa;
    private int jmlEntri;

    public Kamus(String judul, int jmlHalaman, String bahasa, int jmlEntri) {
        super(judul, jmlHalaman);
        this.bahasa = bahasa;
        this.jmlEntri = jmlEntri;
    }

    public void cariKata(String kata) {
        System.out.println("Mencari kata " + kata + " pada kamus");
    }

    public void cariArti(String arti) {
        System.out.println("Mencari arti kata " + arti + " pada kamus");
    }

    @Override
    public void printInfo() {
        System.out.println("=== Kamus ===");
        System.out.println("Judul         : " + judul);
        System.out.println("Jumlah Halaman: " + jmlHalaman);
        System.out.println("Bahasa        : " + bahasa);
        System.out.println("Jumlah Entri  : " + jmlEntri);
    }
}