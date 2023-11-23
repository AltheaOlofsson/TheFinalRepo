public class Dragons extends Monster{

    public Dragons(String name, int hitPoints, int minAttack, int maxAttack, int level, int speed, int expGiven) {
        super(name, hitPoints, minAttack, maxAttack, level, speed, expGiven);
    }
    
    public void introduce() throws InterruptedException {}
}

class MTGDragon extends Dragons {
    public MTGDragon(String name, int hitPoints, int minAttack, int maxAttack, int level, int speed, int expGiven) {
        super(name, hitPoints, minAttack, maxAttack, level, speed, expGiven);
    }
    
    public void introduce() throws InterruptedException {
        System.out.println("A mighty dragon rears up infront of you. \nWith it's huge fangs and golden ornaments it looks absolutely dominant.");
        Thread.sleep(2000);
        System.out.println("- Who do you think you are to stand before the mighty Dragonlord Silamgar? \nIt's hissing voice fills the air like a thousand snakes all at once. \n- I have sneared countless bodies to serve me even after their life have left them!");
        Thread.sleep(3000);
        System.out.println("- I tricked the fierce Khan Tasigur and made him into a pendant. \nYou see that he does have what seems like a withered body hanging around \nhis neck in a golden chain, with links the size of your shoes.");
        Thread.sleep(3000);
        System.out.println("- I have even tricked death itself, and you think that YOU can kill me? \nWhat's left of your body will serve me eternally");
    }
    public static void killsPlayer() throws InterruptedException {
        System.out.println("The dragon rears its neck and shoots out a spray of dark green fluid.\nAs it hits you your flesh begins to boil, your skin falls of you in big patches \n and your body follows soon after. Your screams of agony eco for a long time.");
        Thread.sleep(4000);
        System.out.println("You have died a horrible death. It was to be expected though.");
        Thread.sleep(1600);
        System.out.println("I told you in the beginning... you are not the hero.");
        AdventureGame.clearScreen();
    }
    public static void killsDragon() throws InterruptedException {
        System.out.println("You brandish your magnificent sword and with a powerfull swing, creating a beautiful arc. \nThe air warps and shoots out from where your sword swung. \nThe dragon's head slides of it's neck from a cut so clean that it was impossible to see.");
        Thread.sleep(4000);
        System.out.println("You have slain the mighty Dragonlord Silamgar and freed the area of it's taint");
        Thread.sleep(1600);
        System.out.println("Who would have known... you were a hero after all.");
        AdventureGame.clearScreen();

    }
}

class TolkienDragon extends Dragons {
    public TolkienDragon(String name, int hitPoints, int minAttack, int maxAttack, int level, int speed, int expGiven) {
        super(name, hitPoints, minAttack, maxAttack, level, speed, expGiven);
    }
}

class WowDragon extends Dragons {
    public WowDragon(String name, int hitPoints, int minAttack, int maxAttack, int level, int speed, int expGiven) {
        super(name, hitPoints, minAttack, maxAttack, level, speed, expGiven);
    }
}

class PokeDragon extends Dragons {
    public PokeDragon(String name, int hitPoints, int minAttack, int maxAttack, int level, int speed, int expGiven) {
        super(name, hitPoints, minAttack, maxAttack, level, speed, expGiven);
    }
}

