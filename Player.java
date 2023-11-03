import java.util.concurrent.ThreadLocalRandom;

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
}

public void displayPlayerStats() {
    System.out.println("HP: " + currentHp + "/" + maxHp);
    System.out.println("Attack: " + attack);
    System.out.println("Speed: " + speed);
    System.out.println("Level: " + level);
    System.out.println("Current EXP: " + getExperience());
    System.out.println("Amount of apples: " + getApple());
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

public int getMaxHp() {
    return maxHp;
}
public void setMaxHp(int maxHp) {
    this.maxHp = maxHp;
}

public int getAttack() {
    return attack;
}
public void setAttack(int attack) {
    this.attack = attack;
}
public void addAttack() {
    this.attack += 
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

public void levelUp() {
    if (experience == 10) {
        level++;
        maxHp += 5;
        attack += 10;
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

public void eatApple() {
    currentHp = maxHp;
    apple--;
}

public int swingWeapon() {

    double maxDamage = (attack*1.5);

    double calculateDamage = ThreadLocalRandom.current().nextDouble(attack, maxDamage);
    long roundedResult = Math.round(calculateDamage);
    int outgoingDmg = (int) roundedResult;
    return outgoingDmg;
}


public static void main(String[] args) {
    
    Player player = new Player("JHimy");

    
    System.out.println(player.swingWeapon());
}
// public void rest()
public void takeDamage() {

}

// public boolean isAlive()


}