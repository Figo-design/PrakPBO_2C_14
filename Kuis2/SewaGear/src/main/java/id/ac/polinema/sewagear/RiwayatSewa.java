package id.ac.polinema.sewagear;

import java.util.ArrayList;
import java.util.List;

/** Satu tugas: menyimpan daftar transaksi yang sudah terjadi. */
public class RiwayatSewa {
    private List<Transaksi> daftar = new ArrayList<>();

    public void tambah(Transaksi t) {
        daftar.add(t);
    }

    public List<Transaksi> semua() {
        return daftar;
    }

    public int jumlah() {
        return daftar.size();
    }
}
