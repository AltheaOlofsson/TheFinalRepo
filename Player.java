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
this.level = 0;
this.experience = 0;
this.apple = 3;
this.fairy = 0;
}

public void displayPlayerStats() {
    System.out.println("HP: " + currentHp + "/" + maxHp);
    System.out.println("Attack: " + attack);
    System.out.println("Speed: " + speed);
    System.out.println("Level: " + level);
    System.out.println("Current EXP: " + getExperience());
    System.out.println("Amount of Golden Apples: " + getApple() + "/4");
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

public int getExperience() {
    return experience;
}
public void setExperience(int experience) {
    this.experience = experience;
}

public boolean IsAlive() {
    if (currentHp > 0) return true;
    else return false;
}

public void levelUp() {
    if (experience == 10) {
        level++;
        maxHp += 5;
        attack += 1;
        speed += 1;
        setExperience(0);
    }
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

public int swingWeapon() {

    double maxDamage = (attack*1.5);

    double calculateDamage = ThreadLocalRandom.current().nextDouble(attack, maxDamage);
    long roundedResult = Math.round(calculateDamage);
    int outgoingDmg = (int) roundedResult;

    System.out.println("You swing your weapon for " + outgoingDmg);

    return outgoingDmg;
}

public void attack(Monster currentMonster) {

    double maxDamage = (attack*1.5);

    double calculateDamage = ThreadLocalRandom.current().nextDouble(attack, maxDamage);
    long roundedResult = Math.round(calculateDamage);
    int outgoingDmg = (int) roundedResult;

    currentMonster.decreaseHitPoints(outgoingDmg);

    System.out.println("You swing your weapon for " + outgoingDmg);
}


public static void main(String[] args) throws InterruptedException {
    
    Player player = new Player("Jimmy");
    Scanner s = new Scanner (System.in);
    Occurence event = new Occurence();

    // player.setApple(0);
    event.occurance2(player,s);
    // System.out.println(player.swingWeapon());

    
}

// public void rest()
// public boolean isAlive()


}