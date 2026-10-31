package Jobsheet10.Percobaan4;

public class TestPrinter {
    public static void main(String[] args) {
        Operator dimas = new Operator();
        PrinterInkjet inkjet = new PrinterInkjet();
        PrinterLaser laser = new PrinterLaser();

        dimas.cetakDokumen(inkjet);
        dimas.cetakDokumen(laser);
    }
}
