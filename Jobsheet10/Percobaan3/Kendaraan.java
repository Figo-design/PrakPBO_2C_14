package Jobsheet10.Percobaan3;

public class Kendaraan {
    protected String platNomor;
    protected int tarifPerJam;

    public Kendaraan() {
    }

    public Kendaraan(String platNomor, int tarifPerJam) {
        this.platNomor = platNomor;
        this.tarifPerJam = tarifPerJam;
    }

    public int getTarifPerJam() {
        return tarifPerJam;
    }
}
