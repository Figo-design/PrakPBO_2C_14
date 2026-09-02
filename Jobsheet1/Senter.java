public class Senter {
    private String merk;
    private String energi;

    public Senter(String merk, String energi) {
        this.merk = merk;
        this.energi = energi;
    }

    public void nyalakan() {
        System.out.println("Menyalakan senter " + merk);
    }

    public void matikan() {
        System.out.println("Mematikan senter " + merk);
    }

    public void printInfo() {
        System.out.println("=== Senter ===");
        System.out.println("Merk  : " + merk);
        System.out.println("Energi: " + energi);
    }
}
