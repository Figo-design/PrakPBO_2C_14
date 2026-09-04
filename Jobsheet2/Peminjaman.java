package Jobsheet2;

public class Peminjaman {
    String id;
    String namaMember;
    String namaGame;
    double hargaSewa;
    int lamaSewa;
    
    public double hitungTotalBayar() {
        return lamaSewa * hargaSewa;
    }

    public void tampilData() {
        System.out.println("ID          : " + id);
        System.out.println("Nama Member : " + namaMember);
        System.out.println("Nama Game   : " + namaGame);
        System.out.println("Harga Sewa  : Rp " + hargaSewa + " /hari");
        System.out.println("Lama Sewa   : " + lamaSewa + " hari");
        System.out.println("Total Bayar : Rp " + hitungTotalBayar());
    }
}
