package Jobsheet6.Tugas;

public class TiketDomestik extends TiketPesawat {
    protected int pajakBandara;

    public TiketDomestik() {
        super();
    }

    public TiketDomestik(TiketPesawat tiketPesawat, int pajakBandara) {
        super(tiketPesawat, tiketPesawat.maskapai, tiketPesawat.beratBagasi);
        this.pajakBandara = pajakBandara;
    }

    public void tampilDomestik() {
        super.tampilPesawat();
        System.out.println("Pajak Bandara    = " + pajakBandara);
        System.out.println("Total Bayar      = " + (getHargaDasar() + hitungBiayaBagasi() + pajakBandara));
    }
}