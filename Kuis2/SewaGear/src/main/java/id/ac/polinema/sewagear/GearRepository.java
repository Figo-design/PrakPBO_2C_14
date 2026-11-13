package id.ac.polinema.sewagear;

import java.util.Collection;

/** Tempat penyimpanan data barang. LayananSewa hanya mengenal interface ini. */
public interface GearRepository {
    void simpan(Perlengkapan barang);
    Perlengkapan cari(String kode);
    Collection<Perlengkapan> semua();
}
