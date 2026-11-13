package id.ac.polinema.sewagear;

public class PotonganMahasiswa implements SkemaPotongan {
    @Override
    public int hitung(int biayaSewa) {
        return biayaSewa * 10 / 100;
    }
}
