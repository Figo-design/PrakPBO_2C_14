package Jobsheet10.Percobaan3;

public class Motor extends Kendaraan {
    private int biayaHelm;

    public Motor(String platNomor, int tarifPerJam, int biayaHelm) {
        super(platNomor, tarifPerJam);
        this.biayaHelm = biayaHelm;
    }

    public int getTarifPerJam() {
        return tarifPerJam;
    }

    public int getBiayaHelm() {
        return biayaHelm;
    }
}
