package Jobsheet4.Percobaan3;

public class MainPercobaan3 {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants");
        Pegawai asisten = new Pegawai("4567", "Patrick Star");
        KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis, asisten);
        System.out.println(keretaApi.info());

        Pegawai masinis2 = new Pegawai("9876", "Uchiha Sasuke");
        KeretaApi keretaApi2 = new KeretaApi("Argo Bromo", "Sleeper", masinis2);
        System.out.println(keretaApi2.info());
    }
}
