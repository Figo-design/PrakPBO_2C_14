package Jobsheet9.Tugas;

public class Kedelai extends Binatang implements IHerbivora {
    private String suara;
    private String warnaBulu;

    public Kedelai(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    public void displayMakanan() {
        System.out.println("Jenis: Herbivora");
        System.out.println("Makanan: Tumbuhan");
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
