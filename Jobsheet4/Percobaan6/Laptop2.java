package Jobsheet4.Percobaan6;

public class Laptop2 {
    private String merk;

    public Laptop2(String merk) {
        this.merk = merk;
    }

    public void cetakDokumen(Printer printer, String namaFile) {
        System.out.println(merk + " mengirim dokumen ke printer...");
        printer.cetak(namaFile);
    }
}
