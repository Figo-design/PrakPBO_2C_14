package Jobsheet10.Tugas;

public class Tester {
    public static void main(String[] args) {
        Goblin gb = new Goblin(120, 1);
        Golem gl = new Golem(150, 2);
        Wall w = new Wall(100);
        Tower t = new Tower();

        System.out.println("" + gb.getMonsterInfo());
        System.out.println("" + gl.getMonsterInfo());
        System.out.println("" + w.getWallInfo());
        System.out.println("-------------------------\n");

        for (int i = 0; i < 4; i++) {
            t.doAttack(gb);
            t.doAttack(gl);
            t.doAttack(w);
        }

        System.out.println("" + gb.getMonsterInfo());
        System.out.println("" + gl.getMonsterInfo());
        System.out.println("" + w.getWallInfo());
        System.out.println("-------------------------\n");

        gb.heal();
        gl.heal();

        System.out.println("" + gb.getMonsterInfo());
        System.out.println("" + gl.getMonsterInfo());
    }
}
