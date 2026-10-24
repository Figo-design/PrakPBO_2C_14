package Jobsheet9.Percobaan2;

public class Sarjana extends Mahasiswa implements ICumlaude {
    public Sarjana(String nama) {
        super(nama);
    }

    public void lulus() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }

    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,51");
    }
}
