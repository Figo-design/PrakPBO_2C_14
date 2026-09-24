package Jobsheet4.TugasMandiri;

public class Peminjam {
    private String nama;
    private Buku bukuDipinjam;

    public Peminjam(String nama) {
        this.nama = nama;
    }

    public void setBukuDipinjam(Buku buku) {
        this.bukuDipinjam = buku;
    }

    public void tampilkanPinjaman() {
        System.out.println(nama + " meminjam buku " + bukuDipinjam.getJudul());
    }

    public void cekKetersediaan(Perpustakaan perpustakaan) {
        if (perpustakaan.tersedia(bukuDipinjam)) {
            System.out.println("Buku tersedia di perpustakaan.");
        } else {
            System.out.println("Buku tidak tersedia di perpustakaan.");
        }
    }
}