package Jobsheet2;

public class TestTugas {
    public static void main(String[] args) {
        Peminjaman pinjam1 = new Peminjaman();
        pinjam1.id = "00225";
        pinjam1.namaMember = "Rasyiq";
        pinjam1.namaGame = "FC 26";
        pinjam1.hargaSewa = 100000;
        pinjam1.lamaSewa = 2;
        pinjam1.tampilData();

        Lingkaran ling1 = new Lingkaran();
        ling1.r = 14;
        System.out.println("\nJari-jari lingkaran: " + ling1.r);
        System.out.println("Luas Lingkaran     : " + ling1.hitungLuas());
        System.out.println("Keliling Lingkaran : " + ling1.hitungKeliling() + "\n");

        Barang2 brg = new Barang2();
        brg.kode = "M01F5";
        brg.namaBarang = "HP";
        brg.hargaDasar = 3000000;
        brg.diskon = 5;
        brg.tampilData();
    }
}
