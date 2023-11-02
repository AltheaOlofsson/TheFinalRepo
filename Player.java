import java.util.Random;

public class Player {

String name;
int currentHp;
int maxHp;
// int strength;
int speed;
// int Dodge;
int level;
int experience;
int apple;
// Item[] Inventory;

Player(String name) {
this.name = name;
this.currentHp = 0;
this.maxHp = 0;
// this.strength = 0;
this.speed = 0;
// this.dodge = 0;
this.level = 0;
this.experience = 0;
this.apple = 3;
// this.Inventory[] = new Item[];
}

public void displayPlayerStats() {
    System.out.println("HP: " + currentHp + "/" + maxHp);
    System.out.println("Attack:");
    // System.out.println("Strength: " + strength);
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

// public int getStrength() {
//     return strength;
// }
// public void setStrength(int strength) {
//     this.strength = strength;
// }

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
        // strength += 1;
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
    int minDamage = 3;
    int maxDamage = 7;

    Random random = new Random();

    int damageDone = random.nextInt(maxDamage-minDamage+1) + minDamage;
    return damageDone;
}
// public void rest()
// public void takeDamage()
// public boolean isAlive()


}