import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
//import java.util.Collection;
import java.util.Scanner;

public class Battle {
    Player player;
    Scanner scanner = new Scanner(System.in);
    InputHandler input = new InputHandler();
    public boolean hasExcalibre;

    Monster slime = new Monster("Slime", 20, 2, 2, 1, 2, 100);
    Monster wolf = new Monster("Wolf", 25, 2, 4, 2, 15, 50);
    Monster goblin = new Monster("Goblin", 15, 4, 10, 2, 10, 70);
    Monster orc = new Monster("Orc", 20, 5, 15, 3, 10, 50);
    Monster direWolf = new Monster("Dire wolf", 35, 6, 12, 3, 25, 50);
    Monster elf = new Monster("Elf", 20, 8, 10, 3, 30, 70);
    Monster troll = new Monster("Troll", 55, 2, 15, 4, 8, 40);
    Monster ogre = new Monster("Ogre", 45, 10, 15, 4, 25, 50);
    Monster wurm = new Monster("Wurm", 35, 12, 14, 4, 20, 40);
    Monster vampire = new Vampire("Vampire", 30, 8, 12, 5, 350, 70);
    Monster werewolf = new Monster("Werewolf", 50, 10, 20, 5, 55, 70);
    Monster bandit = new Monster("Bandit", 50, 15,20, 6, 35, 35);
    Monster spider = new Monster("Stygian Spider", 65,20,30,7,40,45);
    Monster wyvern = new Monster("Wyvern", 60, 25, 30, 7, 70, 50);
    Monster hydra = new Monster("Hydra", 65, 15, 40, 8, 45, 70);
    Monster imp = new Monster("Fire Imp", 70, 25, 35, 8, 55, 50);
    Monster mage = new Monster("Ice Mage", 70, 15, 30, 9, 40, 45);
    Monster demon = new Monster("Demon", 75, 20, 35, 9, 70, 60);
    static Dragons bossDragon = new Dragons("Dragonlord Silumgar");
    // Monster bossDragon2 = new TolkienDragon("Smugg", 80000, 30, 800, 20, 300, 300);
    // Monster bossDragon3 = new WowDragon("DeafWing", 60000, 200, 400, 20, 200, 300);
    // Monster bossDragon4 = new PokeDragon("Charizarl", 8000, 80, 150, 20, 5000, 300);

    Monster[] monsterEncounters = {wolf,goblin,orc,direWolf,elf,troll,ogre,wurm,vampire,werewolf,bandit,spider,wyvern,hydra,imp,mage,demon};

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

    // public Monster getCurrentBoss() {
    //     ArrayList<Monster> bosses = createMonsterList(20, 20);
    //     Monster randomBoss = getMonster(bosses);
    //     return randomBoss;
    // }

    public void battle(Player player) {
            ArrayList<Monster> monsters = createMonsterList((player.getLevel()-1), (player.getLevel()+1));
            Monster currentMonster = getMonster(monsters);
            System.out.println("You are attacked by a vicious " + currentMonster.getName());
            while (player.isAlive()) {            
                if (player.getSpeed() >= currentMonster.getSpeed()) {
                    choosesAttackOrStats(currentMonster,player);
                    if (currentMonster.isAlive() == true) {
                        currentMonster.attack(player);
                    } else {
                        currentMonster.monsterDeath(player);
                        break;
                    }
                } else {
                    currentMonster.attack(player);
                    if(player.isAlive() == true) {
                        choosesAttackOrStats(currentMonster, player);
                    }
                    if (!currentMonster.isAlive()) {
                        currentMonster.monsterDeath(player);
                        break;
                    }                                                                          
                }
            }
    }
    
    // What is this? Do we need this? Am I dumb?
    public Battle(Player player) {  
        this.player = player;
    }

    void choosesAttackOrStats(Monster currentMonster, Player player) {
        String attackChoice= "";
        while (attackChoice != "1" || attackChoice != "2") {
            System.out.println("What do you want to do? \n[1] Attack the thing! \n[2] Heal.");
            attackChoice = input.readInput(player);
            if (attackChoice.equals("1")) {
                player.attack(currentMonster);
                System.out.println(currentMonster.getName() + " Current HP: " + currentMonster.getHitPoints());
                break;
            } else if (attackChoice.equals("2")) {
                player.heal(player);
                break;
            } else {
            }
        }
    }

    public void dragonFight(Dragons bossDragon, Player player) {
        Dragons currentBoss = bossDragon; //getCurrentBoss();
        try {currentBoss.introduce();}
        catch (InterruptedException e) {/*Ignore this*/}
        
        if (dragonKillsPlayer() == true) {
            try {MTGDragon.killsPlayer();}
            catch (InterruptedException e) {/*Ignore this*/}
        } else {
            try {MTGDragon.killsDragon();}
            catch (InterruptedException e) {/*Ignore this*/}
        }
    }

    public boolean dragonKillsPlayer() {
        if (hasExcalibre == true) {
            return false;
        } else {
            return true;
        }
    }


    
    public static void main(String[] args) {
        // Main for testing. Remove before release.
        
        Player player = new Player("Brian");
        Battle b = new Battle(player);
        player.setSpeed(1);
        player.setMaxHp(1);
        player.setCurrentHp(1);
        player.setAttack(15);
        
        // b.createMonsterList(0, 2);
        b.dragonFight(bossDragon, player);
        // b.battle(4);
    }
}
