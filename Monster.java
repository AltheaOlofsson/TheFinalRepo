import java.util.concurrent.ThreadLocalRandom;

public class Monster {
    private String name;
    private int hitPoints;
    private int minAttack;
    private int maxAttack;
    private int level;
    private int speed;
    
    Monster(String name, int hitPoints, int minAttack, int maxAttack, int level, int speed) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.minAttack = minAttack;
        this.maxAttack = maxAttack;
        this.level = level;
        this.speed = speed;
    }

    public int getHitPoints() {
        return hitPoints;
    }
    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
    public int getLevel() {
        return level;
    }
    public void decreaseHitPoints(int hitPoints) {
        this.hitPoints -= hitPoints;
    }
    public int attack() {
        int attackDmg = ThreadLocalRandom.current().nextInt(minAttack, maxAttack + 1);
        return attackDmg;
    }

    public void monsterDeath() {
       // if (Monster.decreaseHitPoints() <= 0) {

        }
}
/* public static void main(String[] args) {
    Monsters ghoul = new Monsters("Ghoul", 2, 4, 8, 1, 3);
    int damageDone = ghoul.attack();
    System.out.println(damageDone); 
} */


