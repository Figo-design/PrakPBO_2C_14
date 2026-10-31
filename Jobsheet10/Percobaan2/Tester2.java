package Jobsheet10.Percobaan2;

public class Tester2 {
    public static void main(String[] args) {
        RegularStudent rStd = new RegularStudent("Rina", 400);
        Student s;
        s = rStd; // Upcasting referensi

        System.out.println("" + s.getStudentInfo());
        System.out.println("--------------------");
        System.out.println("" + rStd.getStudentInfo());
    }
}
