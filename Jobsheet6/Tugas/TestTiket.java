package Jobsheet6.Tugas;

public class TestTiket {
    public static void main(String[] args) {
        TiketKereta tiketKereta = new TiketKereta();
        tiketKereta.kodeTiket = "KA-001";
        tiketKereta.namaPenumpang = "Andi";
        tiketKereta.asal = "Malang";
        tiketKereta.tujuan = "Jakarta";
        tiketKereta.setHargaDasar(350000);
        tiketKereta.nomorGerbong = 3;
        tiketKereta.nomorKursi = "12A";

        Tiket tiketDomestikDasar = new Tiket("GA-102", "Sinta", "Surabaya", "Denpasar", 900000);
        TiketPesawat tiketDomestikPesawat = new TiketPesawat(tiketDomestikDasar, "Garuda Indonesia", 25);
        TiketDomestik tiketDomestik = new TiketDomestik(tiketDomestikPesawat, 75000);

        Tiket tiketInternasionalDasar = new Tiket("SQ-205", "Budi", "Jakarta", "Singapura", 2500000);
        TiketPesawat tiketInternasionalPesawat = new TiketPesawat(tiketInternasionalDasar, "Singapore Airlines", 20);
        TiketInternasional tiketInternasional = new TiketInternasional(tiketInternasionalPesawat, "C1234567", 150000);

        System.out.println("============ Tiket Kereta ============");
        tiketKereta.tampilKereta();
        System.out.println("====== Tiket Pesawat Domestik ======");
        tiketDomestik.tampilDomestik();
        System.out.println("=== Tiket Pesawat Internasional ===");
        tiketInternasional.tampilInternasional();
    }
}