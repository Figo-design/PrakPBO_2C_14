package Jobsheet4.TugasMandiri;

public class MainTugasMandiri {
    public static void main(String[] args) {
        Buku bukuWeb = new Buku("978-1-25", "Pemrograman Web");
        Buku bukuPbo = new Buku("567-2-32", "Pemrograman Berbasis Objek");
        Buku[] koleksi = {bukuWeb, bukuPbo};

        Perpustakaan perpustakaan = new Perpustakaan("Perpustakaan JTI", koleksi);
        perpustakaan.tampilkanKoleksi();

        Rak rak = new Rak("R-01", 2);
        rak.simpan(bukuWeb, 1);
        rak.tampilkanIsi();

        Peminjam peminjam = new Peminjam("Said");
        peminjam.setBukuDipinjam(bukuWeb);
        peminjam.cekKetersediaan(perpustakaan);
        peminjam.tampilkanPinjaman();
    }
}