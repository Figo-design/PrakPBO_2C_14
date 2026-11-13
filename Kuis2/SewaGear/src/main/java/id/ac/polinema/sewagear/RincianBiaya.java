package id.ac.polinema.sewagear;

/** Hasil perhitungan biaya satu kali sewa. */
public class RincianBiaya {
    private int sewa;
    private int cuci;
    private int asuransi;
    private int potongan;

    public RincianBiaya(int sewa, int cuci, int asuransi, int potongan) {
        this.sewa = sewa;
        this.cuci = cuci;
        this.asuransi = asuransi;
        this.potongan = potongan;
    }

    public int getSewa() { return sewa; }
    public int getCuci() { return cuci; }
    public int getAsuransi() { return asuransi; }
    public int getPotongan() { return potongan; }

    public int getTotal() {
        return sewa + cuci + asuransi - potongan;
    }
}
