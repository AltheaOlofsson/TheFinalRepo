import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.Random;
//import java.util.Collection;
import java.util.Scanner;

public class Battle {
    Player player;
    Scanner scanner = new Scanner(System.in);

    Dragon bossDragon = new Dragon("Dragonlord Silamgar");
    Dragon bossDragon2 = new TolkienDragon("Smugg");
    Dragon bossDragon3 = new WowDragon("DeafWing");
    Dragon bossDragon4 = new PokeDragon("Charizarl");

    Dragon[] monsterEncounters = {bossDragon, bossDragon2, bossDragon3, bossDragon4};

    public Dragon getRandomBoss() {
        Dragon randomBoss = monsterEncounters[new Random().nextInt(monsterEncounters.length)];
        return randomBoss;
    }

    public void battle(Player player) {   
            Enemy currentMonster = new Enemy((player.getLevel()-1), (player.getLevel()+1));
            System.out.println("You are attacked by a vicious " + currentMonster.getName());
            while (player.IsAlive()) {            
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
                    if(player.IsAlive() == true) {
                        choosesAttackOrStats(currentMonster, player);
                    }
                    if (!currentMonster.isAlive()) {
                        currentMonster.monsterDeath(player);
                        break;
                    }                                                                          
                }
            }
    }
    
    public Battle(Player player) {
        this.player = player;
    }

    void choosesAttackOrStats(Enemy currentMonster, Player player) {
        String attackChoice= "";
        while (attackChoice != "1" || attackChoice != "2") {
            System.out.println("What do you want to do? \n[1] Attack the thing! \n[2] Display stats.");
            attackChoice = scanner.nextLine();
            if (attackChoice.equals("1")) {
                player.attack(currentMonster);
                System.out.println(currentMonster.getName() + ":  HP: " + currentMonster.getHitPoints());
                break;
            } else if (attackChoice.equals("2")) {
                player.displayPlayerStats(scanner);
                break;
            } else {
                System.out.println("Incorrect input.");
            }
        }
    }

    public void dragonFight(Dragon bossDragon, Player player) {
        Dragon currentBoss = (Dragon) getRandomBoss();
        try {currentBoss.introduce();}
        catch (InterruptedException e) {/*Ignore this*/}
        
        if (dragonKillsPlayer() == true) {
            try {currentBoss.killsPlayer();}
            catch (InterruptedException e) {/*Ignore this*/}
        } else {
            try {currentBoss.killsDragon();}
            catch (InterruptedException e) {/*Ignore this*/}
        }
    }

    public boolean dragonKillsPlayer() {
        if (player.hasExcalibre == 1) {
            return false;
        } else {
            return true;
        }
    }


    
    public static void main(String[] args) {
        Player player = new Player("Brian");
        Battle b = new Battle(player);
        player.setSpeed(1);
        player.setMaxHp(200);
        player.setCurrentHp(200);
        player.setAttack(15);
        player.setLevel(8);
        
        // b.createMonsterList(0, 2);
        // b.dragonFight(bossDragon, player);
        b.battle(player);
    }
}
