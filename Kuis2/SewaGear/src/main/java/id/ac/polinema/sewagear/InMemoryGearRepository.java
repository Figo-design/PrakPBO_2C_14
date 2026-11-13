package id.ac.polinema.sewagear;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class InMemoryGearRepository implements GearRepository {
    private Map<String, Perlengkapan> data = new LinkedHashMap<>();

    @Override
    public void simpan(Perlengkapan barang) {
        data.put(barang.getKode(), barang);
    }

    @Override
    public Perlengkapan cari(String kode) {
        return data.get(kode);
    }

    @Override
    public Collection<Perlengkapan> semua() {
        return data.values();
    }
}
