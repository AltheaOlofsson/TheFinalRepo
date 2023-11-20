import java.util.concurrent.ThreadLocalRandom;

public class Vampire extends Monster {
    public Vampire(String name, int hitPoints, int minAttack, int maxAttack, int level, int speed, int expGiven) {
        super(name, hitPoints, minAttack, maxAttack, level, speed, expGiven);
    }

    @Override
    public void attack(Player player) {
        int attackDmg = ThreadLocalRandom.current().nextInt(minAttack, maxAttack + 1);
        player.decreaseCurrentHp(attackDmg);
        System.out.println("The " + name + " attacks you for " + attackDmg);
        hitPoints += (attackDmg/2);
        System.out.println("It heals from your blood.");

        System.out.println(player.getName() + " " + player.currentHp + "/" + player.getMaxHp());
    }
}
