package id.ac.polinema.sewagear;

public class Carrier extends Perlengkapan implements Dicuci {
    private int volumeLiter;

    public Carrier(String kode, String nama, int tarifHarian, int volumeLiter) {
        super(kode, nama, tarifHarian);
        this.volumeLiter = volumeLiter;
    }

    public int getVolumeLiter() { return volumeLiter; }

    @Override
    protected int biayaTambahan(int hari) {
        return 0;
    }

    @Override
    public String getKategori() {
        return "Carrier";
    }

    @Override
    public int biayaCuci() {
        return 10000;
    }

    public String cekResleting() {
        return "cek resleting & tali bahu carrier " + volumeLiter + "L";
    }
}
