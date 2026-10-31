package Jobsheet10.Percobaan4;

public class Printer {
    protected String ukuranKertas;

    public Printer() {
        this.ukuranKertas = "A4"; // Default ukuran kertas standar
    }

    public String getUkuranKertas() {
        return ukuranKertas;
    }

    // public void cetak() {
    //     System.out.println("Mencetak dengan printer umum");
    //     System.out.println("Ukuran kertas: " + ukuranKertas);
    // }
}
