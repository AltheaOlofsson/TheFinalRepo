public enum Monster {
    
    GOBLIN ("Goblin", 20, 4, 8, 2, 15, 70, false),
    WOLF("Wolf", 25, 5, 7, 2, 20, 60, false),
    GNOLL("Gnoll", 20, 2, 8, 2, 20, 70, false),
    ELF("Elf", 30, 8, 12, 3, 30, 80, false),
    ORC("Orc", 40, 6, 8, 3, 25, 70, false),
    DIRE_WOLF("Dire wolf", 35, 8, 10, 3, 40, 60, false),
    GIANT_SPIDER("Giant spider", 35, 4, 14, 4, 35, 90, false),
    BEAR("Bear", 55, 8, 12, 4, 30, 80, false),
    OGRE("Ogre", 55, 14, 16, 6, 30, 70, false),
    TROLL("Troll", 65, 5, 19, 6, 25, 70, false),
    WURM("Wurm", 60, 10, 15, 6, 45, 60, false),
    VAMPIRE("Vampire", 70, 20, 25, 7, 250, 90, true),
    WEREWOLF("Werewolf", 80, 20, 30, 7, 50, 90, false),
    DEMON("Demon", 90, 25, 35, 8, 80, 90, false),
    CHIMERA("Chimera", 100, 25, 35, 9, 90, 90, false);

    String name;
    int hp;
    int minAttack;
    int maxAttack;
    int level;
    int speed;
    int expGiven;
    boolean lifesteal;

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMinAttack() {
        return minAttack;
    }

    public int getMaxAttack() {
        return maxAttack;
    }

    public int getLevel() {
        return level;
    }

    public int getSpeed() {
        return speed;
    }

    public int getExpGiven() {
        return expGiven;
    }

    public boolean isLifesteal() {
        return lifesteal;
    }


    Monster(String name, int hp, int minAttack, int maxAttack, int level, int speed, int expGiven, boolean lifesteal) {
        this.name = name;
        this.hp = hp;
        this.minAttack = minAttack;
        this.maxAttack = maxAttack;
        this.level = level;
        this.speed = speed;
        this.expGiven = expGiven;
        this.lifesteal = lifesteal;
    }

}
