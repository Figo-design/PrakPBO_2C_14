package Jobsheet10.Percobaan3;

public class Parkir {
    public int hitungBiaya(Kendaraan k, int lamaJam) {
    int biaya = k.getTarifPerJam() * lamaJam;

    if (k instanceof Mobil m) {
        biaya += m.getBiayaValet();
    } else if (k instanceof Motor mt) {
        biaya += mt.getBiayaHelm();
    } else if (k instanceof Bus bs) {
        biaya += bs.getBiayaKebersihan();
    }
    return biaya;
}
}