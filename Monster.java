import java.util.concurrent.ThreadLocalRandom;

public class Monster {
    private String name;
    private int hitPoints;
    private int minAttack;
    private int maxAttack;
    private int level;
    private int speed;
    private int expGiven;
    static Boolean lifeSteal = false;
    
    Monster(String name, int hitPoints, int minAttack, int maxAttack, int level, int speed, int expGiven) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.minAttack = minAttack;
        this.maxAttack = maxAttack;
        this.level = level;
        this.speed = speed;
        this.expGiven = expGiven;
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
    public void attack(Player player, Monster currentMonster) {
        int attackDmg = ThreadLocalRandom.current().nextInt(minAttack, maxAttack + 1);
        player.decreaseCurrentHp(attackDmg);
        System.out.println("The " + currentMonster.getName() + " attacks you for " + attackDmg);
        if (lifeSteal == true) {
            currentMonster.hitPoints += (attackDmg/2);
            System.out.println("It heals from your blood.");
        }
    }

    public static void monsterDeath(Player player, Monster currentMonster) {
        player.addExperience(currentMonster.expGiven);
        System.out.println("You killed: " + currentMonster.getName() + " and got " + currentMonster.expGiven + " experience.");
    }
}
/* public static void main(String[] args) {
    Monsters ghoul = new Monsters("Ghoul", 2, 4, 8, 1, 3);
    int damageDone = ghoul.attack();
    System.out.println(damageDone); 
} */


