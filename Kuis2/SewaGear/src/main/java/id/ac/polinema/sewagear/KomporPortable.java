package id.ac.polinema.sewagear;

public class KomporPortable extends Perlengkapan implements Diasuransikan {
    private static final int HARGA_GAS_PER_HARI = 5000;

    public KomporPortable(String kode, String nama, int tarifHarian) {
        super(kode, nama, tarifHarian);
    }

    /** Maksimal tiga tabung gas yang ditagihkan per sewa, apapun lama sewa. */
    @Override
    protected int biayaTambahan(int hari) {
        int jumlahTabung = hari > 3 ? 3 : hari;
        return jumlahTabung * HARGA_GAS_PER_HARI;
    }

    @Override
    public String getKategori() {
        return "Alat Masak";
    }

    @Override
    public int premiAsuransi(int hari) {
        return 1000 * hari;
    }

    public String cekRegulator() {
        return "cek regulator & selang gas";
    }
}
