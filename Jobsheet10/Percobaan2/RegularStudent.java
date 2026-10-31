package Jobsheet10.Percobaan2;

public class RegularStudent extends Student implements Billable {
    private int ukt;

    public RegularStudent(String name, int ukt) {
        this.name = name;
        this.ukt = ukt;
    }

    public int getUkt() {
        return ukt;
    }

    public void setUkt(int ukt) {
        this.ukt = ukt;
    }

    public int getBillAmount() {
        return (int) (ukt + 0.10 * ukt); // UKT + 10% biaya praktikum
    }

    public String getStudentInfo() {
        String info = super.getStudentInfo() + "\n";
        info += "Registered as regular student with UKT " + ukt + "\n";
        return info;
    }
}
