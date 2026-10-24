package Jobsheet9.Tugas;

public class Program4 {
    public static void main(String[] args) {
        Kedelai kedelai = new Kedelai("Kedelai", 4, "Hehehe", "Abu-Abu");
        Gorilla gorilla = new Gorilla("Gulali", 4, "Haaum Haaum", "Hitam Manis");
        Singa singa = new Singa("CingaCing", 4, "Roaar Roaaar", "Coklat");

        kedelai.displayData();
        gorilla.displayData();
        singa.displayData();
    }
}
