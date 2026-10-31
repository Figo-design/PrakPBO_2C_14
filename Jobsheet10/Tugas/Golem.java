package Jobsheet10.Tugas;

public class Golem extends Monster {
    public Golem(int health, int level) {
        super(health, level);
    }

    public void heal() {
        int percentage;

        if (level == 1) {
            percentage = 20;
        } else if (level == 2) {
            percentage = 30;
        } else {
            percentage = 45;
        }

        health += health * percentage / 100;
    }

    public void damaged() {
        health -= health * 15 / 100;
    }

    public String getMonsterInfo() {
        return "Golem Data:\n" + super.getMonsterInfo() + "\n";
    }
}
