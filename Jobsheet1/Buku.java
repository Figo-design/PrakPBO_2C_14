public class Buku {
    String judul;
    int jmlHalaman;

    public Buku(String judul, int jmlHalaman) {
        this.judul = judul;
        this.jmlHalaman = jmlHalaman;
    }

    public void bacaHalaman(int halaman) {
        if (halaman <= jmlHalaman) {
            System.out.println("Membaca buku " + judul + " halaman " + halaman);
        } else {
            System.out.println("Nomor halaman melebihi jumlah halaman buku");
        }
    }

    public void tandaiHalaman(int halaman) {
        if (halaman <= jmlHalaman) {
            System.out.println("Pembatas buku diselipkan pada halaman " + halaman);
        } else {
            System.out.println("Nomor halaman melebihi jumlah halaman buku");
        }
    }

    public void printInfo() {
        System.out.println("=== Buku ===");
        System.out.println("Judul         : " + judul);
        System.out.println("Jumlah Halaman: " + jmlHalaman);
    }
}
