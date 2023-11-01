public class Player {

String Name;
int HealthPoints;
int Strength;
int Speed;
int Dodge;
int Level;
int Experience;
int Money;
Item[] Inventory;
Equipment[] Equipment;

Player(String Name) {
this.Name = Name;
this.HealthPoints = 0;
this.Strength = 0;
this.Speed = 0;
this.Dodge = 0;
this.Level = 0;
this.Experience = 0;
this.Inventory[] = new Item[5];
this.Equipment[] = new Equipment[3];
}

public void displayPlayerStats() {
    System.out.println("HP: " + HealthPoints);
    // System.out.println("Attack: ");
    System.out.println("Strength: " + Strength);
    System.out.println("Speed: " + Speed);
    System.out.println("Level: " + Level);
}

    public void displayPlayerInventory() {
    System.out.println("Money: " + Money);
    System.out.println("Inventory: " + Item[]); // forloop display all items?
}

public String getName() {
    return Name;
}
public void setName(String name) {
    Name = name;
}

public int getHealthPoints() {
    return HealthPoints;
}
public void setHealthPoints(int healthPoints) {
    HealthPoints = healthPoints;
}

public int getStrength() {
    return Strength;
}
public void setStrength(int strength) {
    Strength = strength;
}

public int getLevel() {
    return Level;
}
public void setLevel(int level) {
    Level = level;
}

public int getExperience() {
    return Experience;
}
public void setExperience(int experience) {
    Experience = experience;
}

public int getMoney() {
    return Money;
}
public void setMoney(int money) {
    Money = money;
}

public void increaseLevel() {
    // Need some kind of experience system
    if (Experience == 10) {
        Level++;
        // statincrease
    }
}

public void swingWeapon() {
    // method for player attack, will compare against enemy dodge
}


// public void rest()
// public void takeDamage()
// public boolean isAlive()


}