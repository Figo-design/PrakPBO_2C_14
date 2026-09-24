package Jobsheet4.TugasMandiri;

public class SlotBuku {
    private int nomor;
    private Buku buku;

    public SlotBuku(int nomor) {
        this.nomor = nomor;
    }

    public void isi(Buku buku) {
        this.buku = buku;
    }

    public String info() {
        if (buku == null) {
            return "Slot " + nomor + ": kosong";
        }
        return "Slot " + nomor + ": " + buku.getJudul();
    }
}