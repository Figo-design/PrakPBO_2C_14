package Jobsheet10.Percobaan2;

public class LabRental implements Billable {
    private int hours;
    private String roomType;

    public LabRental(int hours, String roomType) {
        this.hours = hours;
        this.roomType = roomType;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getBillAmount() {
        return hours * getRatePerHour();
    }

    public int getRatePerHour() {
        int rate = 0;
        switch (roomType) {
            case "LAB-KOMPUTER":
                rate = 75;
                break;
            case "LAB-JARINGAN":
                rate = 100;
                break;
        }
        return rate;
    }

    public String getRentalInfo() {
        return "Hours = " + hours + "\n" +
                "Room Type = " + roomType + " (" + getRatePerHour() + " per hour)\n";
    }
}
