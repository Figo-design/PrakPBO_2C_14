package Kuis1;

public class AreaParkir {
    private String nama;
    private SlotParkir[] arraySlot;

    public AreaParkir(String nama, int jumlah) {
        this.nama = nama;
        this.arraySlot = new SlotParkir[jumlah];
        for (int i = 0; i < arraySlot.length; i++) {
            arraySlot[i] = new SlotParkir(i + 1);
        }
    }

    public void parkir(Kendaraan k, int nomor) {
        if (k == null) {
            System.out.println("Kendaraan tidak tersedia");
            return;
        }
        if (nomor < 1 || nomor > arraySlot.length) {
            System.out.println("Nomor slot tidak valid");
            return;
        }
        if (!arraySlot[nomor - 1].isKosong()) {
            System.out.println("Slot " + nomor + " sudah terisi");
            return;
        }
        arraySlot[nomor - 1].setKendaraan(k);
    }

    public void keluar(int nomor) {
        if (nomor < 1 || nomor > arraySlot.length) {
            System.out.println("Nomor slot tidak valid");
            return;
        }
        arraySlot[nomor - 1].setKendaraan(null);
    }

    public int jumlahSlotKosong() {
        int jumlahKosong = 0;
        for (SlotParkir slot : arraySlot) {
            if (slot.isKosong()) {
                jumlahKosong++;
            }
        }
        return jumlahKosong;
    }

    public String info() {
        String info = "";
        info += "Area: " + this.nama + "\n";
        for (SlotParkir slot : arraySlot) {
            info += slot.info();
        }
        return info;
    }
}
