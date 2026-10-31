package Jobsheet10.Tugas;

public class Goblin extends Monster {
    public Goblin(int health, int level) {
        super(health, level);
    }

    public void heal() {
        int percentage;

        if (level == 1) {
            percentage = 15;
        } else if (level == 2) {
            percentage = 25;
        } else {
            percentage = 35;
        }

        health += health * percentage / 100;
    }

    public void damaged() {
        health -= health * 25 / 100;
    }

    public String getMonsterInfo() {
        return "Goblin Data:\n" + super.getMonsterInfo() + "\n";
    }
}
