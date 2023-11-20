import java.util.concurrent.ThreadLocalRandom;

public class Monster {
    protected String name;
    protected int hitPoints;
    protected int minAttack;
    protected int maxAttack;
    protected int level;
    protected int speed;
    protected int expGiven;
    
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
    public void attack(Player player) {
        int attackDmg = ThreadLocalRandom.current().nextInt(minAttack, maxAttack + 1);
        player.decreaseCurrentHp(attackDmg);
        System.out.println("The " + name + " attacks you for " + attackDmg);
        System.out.println(player.getName() + " " + player.currentHp + "/" + player.getMaxHp());
    }

    public void monsterDeath(Player player) {
       System.out.println("You killed: " + name + " and got " + expGiven + " experience."); 
       player.addExperience(expGiven); 
    } //när monstret dör ger det spelaren exp

    public boolean isAlive() {
        if (hitPoints > 0) {
            return true;
        } else {
            return false;
        }
    }
}



