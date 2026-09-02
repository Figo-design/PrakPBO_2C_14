public class Novel extends Buku {
    private String penulis;
    private String genre;

    public Novel(String judul, int jmlHalaman, String penulis, String genre) {
        super(judul, jmlHalaman);
        this.penulis = penulis;
        this.genre = genre;
    }

    public void bacaNovel() {
        System.out.println("Membaca novel berjudul " + judul);
    }

    public void bacaSinopsis() {
        System.out.println("Membaca sinopsis novel " + judul);
    }

    @Override
    public void printInfo() {
        System.out.println("=== Novel ===");
        System.out.println("Judul         : " + judul);
        System.out.println("Jumlah Halaman: " + jmlHalaman);
        System.out.println("Penulis       : " + penulis);
        System.out.println("Genre         : " + genre);
    }
}
