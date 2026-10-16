package UTS;

public class Perpustakaan {
    private String nama;
    private Rak[] daftarRak;
    private Pustakawan kepala;

    public Perpustakaan(String nama, int jumlahRak) {
        this.nama = nama;
        daftarRak = new Rak[jumlahRak];
        for (int i = 0; i < daftarRak.length; i++) {
            daftarRak[i] = new Rak("R-" + (i + 1));
        }
    }

    public void setKepala(Pustakawan kepala) {
        this.kepala = kepala;
    }

    public void simpanKoleksi(Koleksi koleksi) {
        for (Rak rak : daftarRak) {
            if (!rak.isPenuh()) {
                rak.taruh(koleksi);
                return;
            }
        }
        System.out.println("Semua rak penuh.");
    }

    public void simpanKoleksi(Koleksi koleksi, int nomorRak) {
        if (nomorRak < 1 || nomorRak > daftarRak.length) {
            System.out.println("Nomor rak tidak valid.");
            return;
        }
        daftarRak[nomorRak - 1].taruh(koleksi);
    }

    public void tampilInfo() {
        System.out.println("Perpustakaan: " + nama);
        System.out.println("Kepala: " + kepala.getNama());
        for (Rak rak : daftarRak) {
            System.out.println(rak.getKode() + " (" + rak.getJumlah() + "/3):");
            for (Koleksi koleksi : rak.getIsi()) {
                if (koleksi != null) {
                    System.out.println(
                            "- [" + koleksi.getJenis() + "] "
                                    + koleksi.getKode()
                                    + " " + koleksi.getJudul());
                }
            }
        }
    }
}
