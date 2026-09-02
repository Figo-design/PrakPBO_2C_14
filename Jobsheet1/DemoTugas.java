public class DemoTugas {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Pemrograman Berbasis Obejk", 145);
        buku1.printInfo();
        buku1.bacaHalaman(103);
        buku1.tandaiHalaman(55);

        Kamus kamus1 = new Kamus("Kamus Bahasa Spanyol", 186, "Spanyol", 500);
        kamus1.printInfo();
        kamus1.cariKata("Perdón");
        kamus1.cariArti("Gracias");

        Novel novel1 = new Novel("Bandung Menjelang Pagi", 300, "Brian Khrisna", "fiksi");
        novel1.printInfo();
        novel1.bacaNovel();
        novel1.bacaSinopsis();

        KipasAngin kipas1 = new KipasAngin("Maspion", 3);
        kipas1.printInfo();
        kipas1.nyalakan();
        kipas1.aturKecepatan(2);

        Senter senter1 = new Senter("Meval", "Baterai");
        senter1.printInfo();
        senter1.nyalakan();
        senter1.matikan();
    }
}
