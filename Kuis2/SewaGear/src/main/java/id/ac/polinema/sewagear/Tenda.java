package id.ac.polinema.sewagear;

public class Tenda extends Perlengkapan implements Dicuci, Diasuransikan {
    private int kapasitas;

    public Tenda(String kode, String nama, int tarifHarian, int kapasitas) {
        super(kode, nama, tarifHarian);
        this.kapasitas = kapasitas;
    }

    public int getKapasitas() { return kapasitas; }

    @Override
    protected int biayaTambahan(int hari) {
        return kapasitas > 4 ? 10000 : 0;
    }

    @Override
    public String getKategori() {
        return "Tenda";
    }

    @Override
    public int biayaCuci() {
        return 15000;
    }

    @Override
    public int premiAsuransi(int hari) {
        return 2000 * hari;
    }

    public String cekFrame() {
        return "cek frame & pasak tenda (" + kapasitas + " orang)";
    }
}
