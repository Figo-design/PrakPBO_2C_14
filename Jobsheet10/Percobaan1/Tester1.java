package Jobsheet10.Percobaan1;

public class Tester1 {
    public static void main(String[] args) {
        RegularStudent rStd = new RegularStudent("Rina", 400);
        ScholarshipStudent sStd = new ScholarshipStudent("Bayu", "KIP Kuliah");
        LabRental lab = new LabRental(3, "LAB-JARINGAN");

        Student s;
        Billable b;

        s = rStd;   // Sah! RegularStudent is-a Student
        s = sStd;   // Sah! ScholarshipStudent is-a Student
        b = rStd;   // Sah! RegularStudent implements Billable
        b = lab;    // Sah! LabRental implements Billable

        // Hilangkan komentar untuk menguji error kompilasi:
        // s = lab;   // Error! LabRental bukan turunan Student
        // b = sStd;  // Error! ScholarshipStudent tidak implements Billable
    }
}
