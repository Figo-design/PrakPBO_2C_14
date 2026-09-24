package Jobsheet4.Percobaan6;

public class MainPercobaan6 {
    public static void main(String[] args) {
        Laptop2 laptop = new Laptop2("Thinkpad");
        Printer printer = new Printer("Epson L3110");
        laptop.cetakDokumen(printer, "Laporan.pdf");
    }
}
