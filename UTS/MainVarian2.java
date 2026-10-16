package UTS;

public class MainVarian2 {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan("Perpustakaan Polinema Dewi", 2);
        perpustakaan.setKepala(new Pustakawan("P-01", "Bu Dewi"));

        Anggota rafi = new Anggota("A-01", "Rafi");
        Anggota nadia = new Anggota("A-02", "Nadia");

        Buku buku1 = new Buku("B-01", "Pemrograman Java", "Abdul Kadir");
        buku1.setPeminjam(rafi);
        buku1.setHariTerlambat(4);

        Buku buku2 = new Buku("B-02", "Struktur Data", "Rinadi");
        buku2.setPeminjam(nadia);
        buku2.setHariTerlambat(25);

        Majalah majalah = new Majalah("M-01", "Info Komputer", "Mei 2026");
        majalah.setPeminjam(rafi);
        majalah.setHariTerlambat(6);

        perpustakaan.simpanKoleksi(buku1);
        perpustakaan.simpanKoleksi(buku2);
        perpustakaan.simpanKoleksi(majalah, 2);

        PetugasSirkulasi petugas = new PetugasSirkulasi("Petugas UTS");
        petugas.cetakDenda(buku1);
        petugas.cetakDenda(buku2);
        petugas.cetakDenda(majalah);

        Koleksi k = new Majalah("M-09", "Tempo", "Juni 2026");
        System.out.println(k.hitungDenda());
    }
}
