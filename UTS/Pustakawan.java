package UTS;

public class Pustakawan {
    private final String nip;
    private final String nama;

    public Pustakawan(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }
}
