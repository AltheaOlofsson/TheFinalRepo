import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
//import java.util.Collection;
import java.util.Scanner;

public class Battle {
    Player player;
    Scanner scanner = new Scanner(System.in);

    Monster slime = new Monster("Slime", 20, 2, 2, 1, 2, 100);
    Monster wolf = new Monster("Wolf", 25, 2, 4, 2, 15, 70);
    Monster goblin = new Monster("Goblin", 15, 4, 10, 2, 10, 100);
    Monster orc = new Monster("Orc", 20, 5, 15, 3, 10, 80);
    Monster direWolf = new Monster("Dire wolf", 35, 6, 12, 3, 25, 90);
    Monster elf = new Monster("Elf", 20, 8, 10, 3, 30, 100);
    Monster troll = new Monster("Troll", 55, 2, 15, 4, 8, 60);
    Monster ogre = new Monster("Ogre", 45, 10, 15, 4, 25, 80);
    Monster wurm = new Monster("Wurm", 35, 12, 14, 4, 20, 70);
    Monster vampire = new Monster("Vampire", 30, 8, 12, 5, 350, 100);
    Monster werewolf = new Monster("Werewolf", 50, 10, 20, 5, 55, 100);

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

    
    public void battle(int currentRoom) {
        
            ArrayList<Monster> monsters = createMonsterList(currentRoom + 1, currentRoom + 1);
            Monster currentMonster = getMonster(monsters);
            System.out.println("You are attacked by a vicious " + currentMonster.getName());
            if (currentMonster.getName().equals("Vampire")) {Monster.lifeSteal = true;} else {Monster.lifeSteal = false;}
            while (currentMonster.getHitPoints() > 0 && player.IsAlive() == true) {
                if (player.getSpeed() >= currentMonster.getSpeed()) {
                    System.out.println("What do you want to do? \n[1] Attack the thing! \n[2] Display stats.");
                    int attackChoice = scanner.nextInt();
                    System.out.println(attackChoice);
                    if (attackChoice == 1) {
                        player.attack(currentMonster);
                        System.out.println(currentMonster.getName() + ": " + currentMonster.getHitPoints());
                    } else if (attackChoice == 2) {
                        player.displayPlayerStats(scanner);
                    } else {System.out.println("Incorrect input.");}
                    currentMonster.attack(player, currentMonster);
                    System.out.println("player:" + player.currentHp);    
                } else {
                    currentMonster.attack(player, currentMonster);
                    System.out.println("player:" + player.currentHp);
                    System.out.println("What do you want to do? \n[1] Attack the thing! \n[2] Display stats.");
                    int attackChoice = scanner.nextInt();
                    System.out.println(attackChoice);
                    if (attackChoice == 1) {
                        player.attack(currentMonster);
                        System.out.println(currentMonster.getName() + ": " + currentMonster.getHitPoints());
                    } else if (attackChoice == 2) {
                        player.displayPlayerStats(scanner);
                    } else {
                        System.out.println("Incorrect input.");
                    }                                                           
                }
                if (player.IsAlive() == false) {
                    //placeHolderGameOver();
                    break;
                }
                if (currentMonster.getHitPoints() <= 0) {
                    Monster.monsterDeath(player, currentMonster);
                    break;
                }
            }
    }
    
    public Battle(Player player) {
        this.player = player;
    }

    public static void main(String[] args) {
        Player player = new Player("Brian");
        Battle b = new Battle(player);
        player.setSpeed(20);
        player.setMaxHp(500);
        player.setCurrentHp(450);
        player.setAttack(15);
        
        b.createMonsterList(0, 2);
        b.battle(4);
    }
}
