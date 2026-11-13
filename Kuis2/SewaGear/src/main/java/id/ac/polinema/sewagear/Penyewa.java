package id.ac.polinema.sewagear;

public class Penyewa {
    private String nama;
    private String noHp;
    private JenisMember jenisMember;

    public Penyewa(String nama, String noHp, JenisMember jenisMember) {
        this.nama = nama;
        this.noHp = noHp;
        this.jenisMember = jenisMember;
    }

    public String getNama() { return nama; }
    public String getNoHp() { return noHp; }
    public JenisMember getJenisMember() { return jenisMember; }
}
