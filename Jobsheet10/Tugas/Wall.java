package Jobsheet10.Tugas;

public class Wall implements Damageable {
    private int durability;

    public Wall(int durability) {
        this.durability = durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public int getDurability() {
        return durability;
    }

    public void damaged() {
        durability -= 8;
    }

    public String getWallInfo() {
        return "Wall Durability = " + durability;
    }
}
