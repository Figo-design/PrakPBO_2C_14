package UTS;

public class PetugasSirkulasi {
    private String nama;

    public PetugasSirkulasi(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void cetakDenda(Koleksi k) {
        Anggota peminjam = k.getPeminjam();
        String namaPeminjam = peminjam == null ? "Tidak ada" : peminjam.getNama();
        System.out.println(
                "[" + k.getJenis() + "] "
                        + k.getKode()
                        + " "
                        + k.getJudul()
                        + " | Peminjam: " + namaPeminjam
                        + " | Terlambat " + k.getHariTerlambat() + " hari"
                        + " | Denda: " + k.hitungDenda());
    }
}
