import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
//import java.util.Collection;

public class Battle {

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

    boolean playerIsAlive(Player p) {
        if (p.currentHp != 0) return true;
        else return false;
    }

    int roomNumber = 5;
    public void battle(int currentRoom) {
        for (int i=2; i <= roomNumber + 2; i++) {
            ArrayList<Monster> monsters = createMonsterList(i, i);
            Monster currentMonster = getMonster(monsters);

            while (player.currentHp != 0) {
                while (currentMonster.getHitPoints() != 0) {
                    if (player.getSpeed() >= currentMonster.getSpeed()) {
                        System.out.println("You swing your weapon for " + player.swingWeapon());
                    } else {
                        System.out.println(currentMonster.getName() + " attacks you for " + currentMonster.attack());
                    }
                }
            }
        }
    }
    // Player player = new Player("Brian");

    Player player;
    

    public Battle(Player player) {
        this.player = player;
    }

    public static void main(String[] args) {
        Player player = new Player("Brian");
        // player.setAttack(10);
        // player.setSpeed(15);
        player.setSpeed(20);
        Battle b = new Battle(player);
        b.createMonsterList(0, 2);
        b.battle(4);
    }
}
