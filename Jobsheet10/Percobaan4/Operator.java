package Jobsheet10.Percobaan4;

public class Operator {
    public void cetakDokumen(Printer printer) {
        if (printer instanceof PrinterInkjet) {
            PrinterInkjet inkjet = (PrinterInkjet) printer;
            String tinta = inkjet.getJenisTinta();
            System.out.println("Mencetak dengan printer inkjet, tinta: " + tinta);
            System.out.println("Ukuran kertas: " + inkjet.getUkuranKertas());
        } else if (printer instanceof PrinterLaser) {
            PrinterLaser laser = (PrinterLaser) printer;
            String tinta = laser.getJenisTinta();
            System.out.println("Mencetak dengan printer laser, tinta: " + tinta);
            System.out.println("Ukuran kertas: " + laser.getUkuranKertas());
        }
    }

    // public void cetakDokumen(Printer printer) {
    //     printer.cetak(); // Dynamic dispatch: versi subclass yang berjalan
    // }
}
