package Jobsheet6.Tugas;

public class TiketInternasional extends TiketPesawat {
    protected String nomorPaspor;
    protected int asuransi;

    public TiketInternasional() {
        super();
    }

    public TiketInternasional(TiketPesawat tiketPesawat, String nomorPaspor, int asuransi) {
        super(tiketPesawat, tiketPesawat.maskapai, tiketPesawat.beratBagasi);
        this.nomorPaspor = nomorPaspor;
        this.asuransi = asuransi;
    }

    public void tampilInternasional() {
        super.tampilPesawat();
        System.out.println("Nomor Paspor     = " + nomorPaspor);
        System.out.println("Asuransi         = " + asuransi);
        System.out.println("Total Bayar      = " + (getHargaDasar() + hitungBiayaBagasi() + asuransi));
    }
}