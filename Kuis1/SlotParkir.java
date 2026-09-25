package Kuis1;

public class SlotParkir {
    private int nomor;
    private Kendaraan kendaraan;

    public SlotParkir(int nomor) {
        this.nomor = nomor;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public boolean isKosong() {
        return kendaraan == null;
    }

    public String info() {
        String info = "";
        info += "Slot: " + this.nomor + "\n";
        if (isKosong()) {
            info += "Status: Kosong\n";
        } else {
            info += kendaraan.info();
        }
        return info;
    }
}
