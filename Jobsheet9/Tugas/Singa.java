package Jobsheet9.Tugas;

public class Singa extends Binatang implements IKarnivora {
    private String suara;
    private String warnaBulu;

    public Singa(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    public void displayMakanan() {
        System.out.println("Jenis: Karnivora");
        System.out.println("Makanan: Daging");
    }

    public void displayBinatang() {
        System.out.println("Nama: " + nama);
        System.out.println("Jumlah Kaki: " + jmlKaki);
    }

    public void displayData() {
        displayMakanan();
        displayBinatang();
        System.out.println("Suara: " + suara);
        System.out.println("Warna Bulu: " + warnaBulu + "\n");
    }
}
