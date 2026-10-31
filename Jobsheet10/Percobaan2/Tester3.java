package Jobsheet10.Percobaan2;

public class Tester3 {
    public static void main(String[] args) {
        RegularStudent rStd = new RegularStudent("Rina", 400);
        ScholarshipStudent sStd = new ScholarshipStudent("Bayu", "KIP Kuliah");
        LabRental lab = new LabRental(3, "LAB-JARINGAN");

        Billable b[] = {rStd, lab};   // Array heterogen Billable
        Student s[] = {rStd, sStd};   // Array heterogen Student

        for (Billable item : b) {
            System.out.println("Total tagihan: " + item.getBillAmount());
        }

        // Student s2[] = {rStd, sStd, lab}; // Error! lab bukan Student
    }
}
