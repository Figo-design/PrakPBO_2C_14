package id.ac.polinema.sewagear;

public class Headlamp extends Perlengkapan {
    private static final int BIAYA_BATERAI = 3000;

    public Headlamp(String kode, String nama, int tarifHarian) {
        super(kode, nama, tarifHarian);
    }

    /** Baterai baru sekali per sewa, berapa pun lamanya. */
    @Override
    protected int biayaTambahan(int hari) {
        return BIAYA_BATERAI;
    }

    @Override
    public String getKategori() {
        return "Penerangan";
    }
}
