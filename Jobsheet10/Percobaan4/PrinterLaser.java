package Jobsheet10.Percobaan4;

public class PrinterLaser extends Printer {
    private String jenisTinta;

    public PrinterLaser() {
        this.jenisTinta = "Toner Bubuk";
        this.ukuranKertas = "F4";
    }

    public String getJenisTinta() {
        return jenisTinta;
    }

    // public void cetak() {
    //     System.out.println("Mencetak dengan printer laser, tinta: " + jenisTinta);
    //     System.out.println("Ukuran kertas: " + ukuranKertas);
    // }
}
