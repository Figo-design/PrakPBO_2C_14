package Jobsheet6.Tugas;

public class TiketPesawat extends Tiket {
    protected String maskapai;
    protected int beratBagasi;

    public TiketPesawat() {
        super();
    }

    public TiketPesawat(Tiket tiket, String maskapai, int beratBagasi) {
        super(tiket.kodeTiket, tiket.namaPenumpang, tiket.asal, tiket.tujuan, tiket.getHargaDasar());
        this.maskapai = maskapai;
        this.beratBagasi = beratBagasi;
    }

    public int hitungBiayaBagasi() {
        return Math.max(0, beratBagasi - 20) * 50000;
    }

    public void tampilPesawat() {
        super.tampilTiket();
        System.out.println("Maskapai         = " + maskapai);
        System.out.println("Berat Bagasi     = " + beratBagasi + " kg");
        System.out.println("Biaya Bagasi     = " + hitungBiayaBagasi());
    }
}