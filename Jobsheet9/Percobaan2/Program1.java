package Jobsheet9.Percobaan2;

public class Program1 {
    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();

        // Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");

        // pakRektor.beriSertifikatCumlaude(mhsBiasa);
        pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
        pakRektor.beriSertifikatCumlaude(masterCumlaude);

        // sarjanaCumlaude.kuliahDiKampus();
    }
}
