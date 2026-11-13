package id.ac.polinema.sewagear;

import java.util.HashMap;
import java.util.Map;

/** Satu tugas: menghitung rincian biaya sewa. */
public class KalkulatorBiaya {
    private Map<JenisMember, SkemaPotongan> daftarPotongan = new HashMap<>();

    public void daftarkanPotongan(JenisMember jenis, SkemaPotongan skema) {
        daftarPotongan.put(jenis, skema);
    }

    public RincianBiaya hitung(Penyewa penyewa, Perlengkapan barang, int hari) {
        int sewa = barang.hitungSewa(hari);

        int cuci = 0;
        if (barang instanceof Dicuci d) {
            cuci = d.biayaCuci();
        }

        int asuransi = 0;
        if (barang instanceof Diasuransikan a) {
            asuransi = a.premiAsuransi(hari);
        }

        int potongan = 0;
        SkemaPotongan skema = daftarPotongan.get(penyewa.getJenisMember());
        if (skema != null) {
            potongan = skema.hitung(sewa);
        }

        return new RincianBiaya(sewa, cuci, asuransi, potongan);
    }
}
