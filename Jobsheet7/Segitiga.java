package Jobsheet7;

public class Segitiga {

    private int sudut;

    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        return sudut;
    }

    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        return Math.sqrt((double) sisiA * sisiA + (double) sisiB * sisiB);
    }

    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        System.out.println("Sudut ketiga: " + segitiga.totalSudut(60));
        System.out.println("Sudut ketiga: " + segitiga.totalSudut(60, 70));
        System.out.println("Keliling: " + segitiga.keliling(3, 4, 5));
        System.out.println("Panjang sisi miring: " + segitiga.keliling(3, 4));
    }
}
