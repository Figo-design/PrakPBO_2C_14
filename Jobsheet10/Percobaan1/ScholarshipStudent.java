package Jobsheet10.Percobaan1;

public class ScholarshipStudent extends Student {
    private String sponsor;

    public ScholarshipStudent(String name, String sponsor) {
        this.name = name;
        this.sponsor = sponsor;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public String getStudentInfo() {
        String info = super.getStudentInfo() + "\n";
        info += "Registered as scholarship student sponsored by " + sponsor + "\n";
        return info;
    }
}
