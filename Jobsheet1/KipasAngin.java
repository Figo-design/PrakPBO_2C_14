public class KipasAngin {
    private String merk;
    private int jmlKecepatan;

    public KipasAngin(String merk, int jmlKecepatan) {
        this.merk = merk;
        this.jmlKecepatan = jmlKecepatan;
    }

    public void nyalakan() {
        System.out.println("Menyalakan Kipas angin " + merk);
    }

    public void aturKecepatan(int kecepatan) {
        if (kecepatan <= jmlKecepatan) {
            System.out.println("Kecepatan kipas angin diatur ke level " + kecepatan);
        } else {
            System.out.println("Tidak valid");
        }
    }

    public void printInfo() {
        System.out.println("=== Kipas Angin ===");
        System.out.println("Merk            : " + merk);
        System.out.println("Jumlah Kecepatan: " + jmlKecepatan);
    }
}
