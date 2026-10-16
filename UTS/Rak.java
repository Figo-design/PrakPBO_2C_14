package UTS;

public class Rak {
    private String kode;
    private Koleksi[] isi;
    private int jumlah;

    public Rak(String kode) {
        this.kode = kode;
        this.isi = new Koleksi[3];
    }

    public boolean taruh(Koleksi k) {
        if (isPenuh()) {
            System.out.println("Rak " + kode + " sudah penuh, koleksi " + k.getKode() + " ditolak.");
            return false;
        }

        isi[jumlah] = k;
        jumlah++;
        return true;
    }

    public boolean isPenuh() {
        return jumlah == 3;
    }

    public String getKode() {
        return kode;
    }

    public int getJumlah() {
        return jumlah;
    }

    public Koleksi[] getIsi() {
        Koleksi[] salinan = new Koleksi[isi.length];
        for (int i = 0; i < isi.length; i++) {
            salinan[i] = isi[i];
        }
        return salinan;
    }
}
