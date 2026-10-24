package Jobsheet9.Percobaan3;

public class PascaSarjana extends Mahasiswa implements ICumlaude, IBerprestasi {
    public PascaSarjana(String nama) {
        super(nama);
    }

    public void lulus() {
        System.out.println("Aku sudah menyelesaikan TESIS");
    }

    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,71");
    }

    public void menjuaraiKompetisi() {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }

    public void membuatPublikasiIlmiah() {
        System.out.println("Saya menerbitkan artikel di jurnal INTERNASIONAL");
    }
}
