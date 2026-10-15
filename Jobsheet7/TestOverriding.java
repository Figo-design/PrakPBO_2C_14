package Jobsheet7;

public class TestOverriding {

    public static void main(String[] args) {
        Manusia dosen = new Dosen();
        Manusia mahasiswa = new Mahasiswa();

        dosen.bernafas();
        dosen.makan();
        mahasiswa.bernafas();
        mahasiswa.makan();

        new Dosen().lembur();
        new Mahasiswa().tidur();
    }
}
