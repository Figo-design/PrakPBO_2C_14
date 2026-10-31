package Jobsheet10.Percobaan4;

public class PrinterInkjet extends Printer {
    private String jenisTinta;

    public PrinterInkjet() {
        this.jenisTinta = "Tinta Cair";
        this.ukuranKertas = "A4";
    }

    public String getJenisTinta() {
        return jenisTinta;
    }

    // public void cetak() {
    //     System.out.println("Mencetak dengan printer inkjet, tinta: " + jenisTinta);
    //     System.out.println("Ukuran kertas: " + ukuranKertas);
    // }
}
