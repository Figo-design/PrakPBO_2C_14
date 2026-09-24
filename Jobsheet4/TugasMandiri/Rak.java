package Jobsheet4.TugasMandiri;

public class Rak {
    private String kode;
    private SlotBuku[] slot;

    public Rak(String kode, int jumlahSlot) {
        this.kode = kode;
        this.slot = new SlotBuku[jumlahSlot];
        for (int i = 0; i < slot.length; i++) {
            slot[i] = new SlotBuku(i + 1);
        }
    }

    public void simpan(Buku buku, int nomorSlot) {
        slot[nomorSlot - 1].isi(buku);
    }

    public void tampilkanIsi() {
        System.out.println("Rak " + kode + ":");
        for (SlotBuku slotBuku : slot) {
            System.out.println("- " + slotBuku.info());
        }
    }
}