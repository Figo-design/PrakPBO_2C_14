package Jobsheet4.TugasMandiri;

public class Perpustakaan {
    private String nama;
    private Buku[] koleksi;

    public Perpustakaan(String nama, Buku[] koleksi) {
        this.nama = nama;
        this.koleksi = koleksi;
    }

    public void tampilkanKoleksi() {
        System.out.println("Perpustakaan: " + nama);
        for (Buku buku : koleksi) {
            System.out.println("- " + buku.getIsbn() + ": " + buku.getJudul());
        }
    }

    public boolean tersedia(Buku bukuYangDicari) {
        for (Buku buku : koleksi) {
            if (buku == bukuYangDicari) {
                return true;
            }
        }
        return false;
    }
}