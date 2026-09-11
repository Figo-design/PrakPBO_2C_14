package Jobsheet3;

import java.util.Scanner;

public class TestLogistik {
    public static void main(String[] args) {
        Scanner figo = new Scanner(System.in);
        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");

        System.out.print("\nMasukkan berat barang yang akan dimuat (kg): ");
        int beratMasuk = figo.nextInt();
        kontainerAlfa.tambahMuatan(beratMasuk);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        System.out.print("\nMasukkan berat barang yang akan dimuat berikutnya (kg): ");
        int beratMasukBerikutnya = figo.nextInt();
        kontainerAlfa.tambahMuatan(beratMasukBerikutnya);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        System.out.print("\nMasukkan berat barang yang akan dibongkar (kg): ");
        int beratTurun = figo.nextInt();
        kontainerAlfa.turunkanMuatan(beratTurun);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        System.out.print("\nMasukkan berat barang yang akan dibongkar berikutnya (kg): ");
        int beratTurunBerikutnya = figo.nextInt();
        kontainerAlfa.turunkanMuatan(beratTurunBerikutnya);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        figo.close();
    }
}
