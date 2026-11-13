package id.ac.polinema.sewagear;

/** Satu tugas: mencetak struk satu transaksi. */
public class StrukPrinter {
    public void cetak(Transaksi t) {
        RincianBiaya r = t.getRincian();
        System.out.println("=== STRUK SEWA #" + t.getNomor() + " ===");
        System.out.println("Penyewa  : " + t.getPenyewa().getNama()
                + " (" + t.getPenyewa().getJenisMember() + ")");
        System.out.println("Barang   : " + t.getBarang().info());
        System.out.println("Lama     : " + t.getHari() + " hari");
        System.out.println("Sewa     : " + r.getSewa());
        System.out.println("Cuci     : " + r.getCuci());
        System.out.println("Asuransi : " + r.getAsuransi());
        System.out.println("Potongan : -" + r.getPotongan());
        System.out.println("TOTAL    : " + r.getTotal());
    }
}
