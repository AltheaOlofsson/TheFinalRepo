import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Player {

String name;
int currentHp;
int maxHp;
int attack;
int speed;
// int Dodge;
int level;
int experience;
int apple;
int fairy;

Player(String name) {
this.name = name;
this.currentHp = 20;
this.maxHp = 20;
this.attack = 10;
this.speed = 15;
// this.dodge = 0;
this.level = 2;
this.experience = 0;
this.apple = 3;
this.fairy = 0;
}

public void displayPlayerStats(Scanner s) {
    System.out.println("HP: " + currentHp + "/" + maxHp);
    System.out.println("Attack: " + attack);
    System.out.println("Speed: " + speed);
    System.out.println("Level: " + level);
    System.out.println("Current EXP: " + getExperience());
    System.out.println("Amount of Golden Apples: " + getApple() + "/4");
        if(currentHp < maxHp && getApple() > 0) {
            Scanner sc = new Scanner (System.in);
            System.out.println("Eat Golden Apple to restore HP? (y/n)");
            String userChoice = sc.nextLine();
            if(userChoice.equalsIgnoreCase("y")) {
                eatApple();
                System.out.println("You consumed a Golden Apple and restored your HP to max! HP: " + getCurrentHp() +"/" + getMaxHp());
            } else {
                System.out.println("You save your Golden Apples for a rainy day");
            }
        } else if (getApple() == 0) {
            System.out.println("You are out of Golden Apples!");
        } else {
            return;
        }
}

public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}

public int getCurrentHp() {
    return currentHp;
}
public void setCurrentHp(int currentHp) {
    this.currentHp = currentHp;
}
public void addCurrenHp(int currentHp) {
    this.currentHp += currentHp;
    if (this.currentHp > maxHp){
        this.currentHp = maxHp;
        System.out.println("You are at full health.");
    }
}
public void decreaseCurrentHp(int currentHp) {
    this.currentHp -= currentHp;
}

public int getMaxHp() {
    return maxHp;
}
public void setMaxHp(int maxHp) {
    this.maxHp = maxHp;
}
public void addMaxHp(int maxHp) {
    this.maxHp += maxHp;
}

public int getAttack() {
    return attack;
}
public void setAttack(int attack) {
    this.attack = attack;
}
public void addAttack(int attack) {
    this.attack += attack; 
}

public int getSpeed() {
    return speed;
}
public void setSpeed(int speed) {
    this.speed = speed;
}
public void addSpeed(int speed) {
    this.speed += speed;
}
public void decreseSpeed(int speed) {
    this.speed -= speed;
}
    
public int getLevel() {
    return level;
}
public void setLevel(int level) {
    this.level = level;
}
public void levelUp() {
    level++;
    maxHp += 5;
    attack += 1;
    speed += 1;
    setCurrentHp(maxHp);
    System.out.println("Congratulations! You leveled up to level " + getLevel() + "!");
    reduceExperience(100);
}

public int getExperience() {
    return experience;
}
public void setExperience(int experience) {
    this.experience = experience;
}
public void addExperience(int experience) {
    this.experience += experience;
    if(experience >= 100){
        levelUp();
    }  
}
public void reduceExperience(int experience){
    this.experience -= experience;
}

public int getApple() {
    return apple;
}
public void setApple(int apple) {
    this.apple = apple;
}
public void addApple(int apple) {
    this.apple += apple;
    if(this.apple > 4){
        this.apple = 4;
        System.out.println("You can only carry four apples. Your bag is full.");
    }
}
public void decreseApple(int apple){
    this.apple -= apple;
}
public void eatApple() {
    currentHp = maxHp;
    apple--;
}

public boolean IsAlive() {
    if (currentHp > 0) return true;
    else return false;
}

// public void swingWeapon() {

//     double maxDamage = (attack*1.5);

//     double calculateDamage = ThreadLocalRandom.current().nextDouble(attack, maxDamage);
//     long roundedResult = Math.round(calculateDamage);
//     int outgoingDmg = (int) roundedResult;

//     System.out.println("You swing your weapon for " + outgoingDmg + " damage!");
// }

public void attack(Monster currentMonster) {

    double maxDamage = (attack*1.5);

    double calculateDamage = ThreadLocalRandom.current().nextDouble(attack, maxDamage);
    long roundedResult = Math.round(calculateDamage);
    int outgoingDmg = (int) roundedResult;

    currentMonster.decreaseHitPoints(outgoingDmg);

    System.out.println("You swing your weapon for " + outgoingDmg + " damage!");
}


public static void main(String[] args) throws InterruptedException {
    
    Player player = new Player("Jimmy");
    Scanner s = new Scanner (System.in);
    EventController ec = new EventController();

    player.setLevel(3);

    // player.setApple(1);
    // // player.displayPlayerStats(s);
    // player.setCurrentHp(10);
    // // event.occurance2(player,s);
    // // player.swingWeapon();
    // // player.setExperience(50);
    // // player.addExperience(100);
    // // player.displayPlayerStats(s);
    // // player.addExperience(100);
    // player.displayPlayerStats(s);
    for (int i = 1; i <= player.getLevel(); i++) {
    Event e = ec.generateEvent(player);
    e.execute(player, s);
    for (Event foo : ec.eventList) {
        System.out.println(foo);
    }
    }
}

// public void rest()
// public boolean isAlive()


}