package Kuis1;

public class MainSoalA4 {
    public static void main(String[] args) {
        AreaParkir area = new AreaParkir("Basement", 5);
        Kendaraan k1 = new Kendaraan("N 1234 AB", "Motor");
        Kendaraan k2 = new Kendaraan("L 5678 CD", "Mobil");
        Kendaraan k3 = new Kendaraan("W 9999 EF", "Mobil");

        area.parkir(k1, 2);
        area.parkir(k2, 2);
        area.parkir(k3, 7);
        area.parkir(k2, 4);

        System.out.println(area.info());
        System.out.println("Jumlah slot kosong: " + area.jumlahSlotKosong());

        area.keluar(2);
        System.out.println("Jumlah slot kosong: " + area.jumlahSlotKosong());
    }
}
