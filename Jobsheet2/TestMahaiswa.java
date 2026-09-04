package Jobsheet2;

public class TestMahaiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();

        Mahasiswa mhs2 = new  Mahasiswa();
        mhs2.nim = 225;
        mhs2.nama = "Vico";
        mhs2.alamat = "Jl. Pisang Kipas No 23";
        mhs2.kelas = "2C";
        mhs2.tampilBiodata();

        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = 357;
        mhs3.nama = "Atma";
        mhs3.alamat = "Jl. Candi Panggung No 76";
        mhs3.kelas = "2I";
        mhs3.tampilBiodata();
    }
}
