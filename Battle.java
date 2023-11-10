import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
//import java.util.Collection;
import java.util.Scanner;

public class Battle {
    Player player;

    Monster slime = new Monster("Slime", 20, 2, 2, 1, 2);
    Monster wolf = new Monster("Wolf", 25, 2, 4, 2, 15);
    Monster goblin = new Monster("Goblin", 15, 4, 10, 2, 10);
    Monster orc = new Monster("Orc", 20, 5, 15, 3, 10);
    Monster direWolf = new Monster("Dire wolf", 35, 6, 12, 3, 25);
    Monster elf = new Monster("Elf", 20, 8, 10, 3, 30);
    Monster troll = new Monster("Troll", 55, 2, 15, 4, 8);
    Monster ogre = new Monster("Ogre", 45, 10, 15, 4, 25);
    Monster wurm = new Monster("Wurm", 35, 12, 14, 4, 20);
    Monster vampire = new Monster("Vampire", 35, 8, 10, 5, 35);
    Monster werewolf = new Monster("Werewolf", 50, 10, 20, 5, 55);

    Monster[] monsterEncounters = {wolf,goblin,orc,direWolf,elf,troll,ogre,wurm,vampire,werewolf};

    public ArrayList<Monster> createMonsterList(int lower, int upper) {
        ArrayList<Monster> monsters = new ArrayList<Monster>(); 
        for (Monster m : monsterEncounters) {
            if (m.getLevel() >= lower && m.getLevel() <= upper) {
                monsters.add(m);
            }
        }
        return monsters;
    }

    public Monster getMonster(ArrayList<Monster> monsterList) {
        return monsterList.get(ThreadLocalRandom.current().nextInt(monsterList.size()));
    }

    public Monster getCurrentMonsterHP(ArrayList<Monster> monsterList) {
        return monsterList.get(ThreadLocalRandom.current().nextInt(monsterList.size()));
    }
    public int playerFirst() {
        if (attackNow == true) {
            int monsterDmgTaken = player.swingWeapon();

            System.out.println("You swing your weapon for " + player.swingWeapon());
            return monsterDmgTaken;
        } return player.swingWeapon(); // OBS Temporär implementering
    }
    public Boolean attackNow = false;
    
    public void battle(int currentRoom) {
        
            ArrayList<Monster> monsters = createMonsterList(currentRoom + 1, currentRoom + 1);
            Monster currentMonster = getMonster(monsters);

                while (currentMonster.getHitPoints() > 0 && player.IsAlive() == true) {
                    if (player.getSpeed() >= currentMonster.getSpeed()) {
                        Scanner attackMonster = new Scanner(System.in);
                        System.out.println("Do you want to attack? [Y] [N]");
                        String attackChoice = attackMonster.nextLine();
                        int monsterDmgTaken = playerFirst();
                        currentMonster.decreaseHitPoints(monsterDmgTaken);
                        int currentAttack = currentMonster.attack();
                        System.out.println(currentMonster.getName() + " attacks you for " + currentAttack);
                        player.decreaseCurrentHp(currentAttack);
                        attackNow = false;
                    } else {
                        int currentAttack = currentMonster.attack();
                        System.out.println(currentMonster.getName() + " attacks you for " + currentAttack);
                        player.decreaseCurrentHp(currentAttack);
                        Scanner attackMonster = new Scanner(System.in);
                        System.out.println("Do you want to attack? [Y] [N]");
                        String attackChoice = attackMonster.nextLine();
                        int monsterDmgTaken = playerFirst();
                        currentMonster.decreaseHitPoints(monsterDmgTaken);
                        attackNow = false;
                    }
                    System.out.println(player.currentHp);
                }
            }
    // Player player = new Player("Brian");

    
    

    public Battle(Player player) {
        this.player = player;
    }

    public static void main(String[] args) {
        Player player = new Player("Brian");
        Battle b = new Battle(player);
        Scanner attackMonster = new Scanner(System.in);
        System.out.println("Do you want to attack? [Y] [N]");
        String attackChoice = attackMonster.nextLine();
        if (attackChoice == "y") {
            b.attackNow = true;
        }
        // player.setAttack(10);
        // player.setSpeed(15);
        player.setSpeed(20);
        player.setMaxHp(50);
        player.setCurrentHp(50);
        player.setAttack(12);
        
        b.createMonsterList(0, 2);
        b.battle(4);
    }
}
