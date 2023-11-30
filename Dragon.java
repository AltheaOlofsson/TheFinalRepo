import java.util.Scanner;
public class Dragon {
    String name;
    Dragon(String name) {
        this.name = name;
        InputHandler input = new InputHandler();

    }

    public void introduce(Player player) throws InterruptedException {
        InputHandler input = new InputHandler();
        System.out.println("A mighty dragon rears up infront of you."); 
        // Thread.sleep(2000);
        System.out.println("With it's huge fangs and golden ornaments it looks absolutely dominant.");
        // Thread.sleep(5000);
        System.out.println("- Who do you think you are to stand before the mighty Dragonlord Silamgar?");
        // Thread.sleep(5000);
        System.out.println("It's hissing voice fills the air like a thousand snakes all at once.");
        // Thread.sleep(5000);
        System.out.println("- I have sneared countless bodies to serve me even after their life have left them!");
        // Thread.sleep(5500);
        System.out.println("- I tricked the fierce Khan Tasigur and made him into a pendant.");
        // Thread.sleep(4500);
        System.out.println("You see that he does have what seems like a withered body hanging around");
        // Thread.sleep(5000); 
        System.out.println("his neck in a golden chain, with links the size of your shoes.");
        // Thread.sleep(4500);
        System.out.println("- I have even tricked death itself, and you think that YOU can kill me?");
        // Thread.sleep(5000);
        System.out.println("What's left of your body will serve me eternally");
        // Thread.sleep(4000);
        Boolean attack = true;
        while (attack){
            
        System.out.println("\nWhat do you want to do? \n[1] Attack the Dragon! \n[2] Heal.");
        String choice = input.readInput(player);
        if(choice.equals("1")){
            attack=false;
            break;
        } else if (choice.equals("2")) {
            player.heal(player);    
        }
    }
    }


    public void killsPlayer() throws InterruptedException {
    Scanner scan = new Scanner(System.in);
        System.out.println("The dragon laughs at your feeble attempt before it rears its neck and shoots out a spray of dark green fluid.");
        // Thread.sleep(5000);
        System.out.println("You cannot dodge. As it hits you your flesh begins to boil, your skin falls to the ground in big patches");
        // Thread.sleep(5500);
        System.out.println("and your body follows soon after. Your screams of agony eco for a long time.");
        // Thread.sleep(5500);
        System.out.println("You have died a horrible death. It was to be expected though.");
        // Thread.sleep(4500);
        System.out.println("I told you in the beginning... you are not the hero.");
        // Thread.sleep(4500);
        // AdventureGame.clearScreen();
        System.out.println("Press Enter to continue.");
        scan.nextLine();        

    }

    public void killsDragon() throws InterruptedException {
            Scanner scan = new Scanner(System.in);
        System.out.println("You brandish your magnificent sword and with a powerfull swing, creating a beautiful arc.");
        // Thread.sleep(5500);
        System.out.println("The air warps and shoots out from where your sword swung.");
        // Thread.sleep(4500);
        System.out.println("The dragon's head slides of it's neck from a cut so clean that it was impossible to see.");
        // Thread.sleep(5500);
        System.out.println("You have slain the mighty Dragonlord Silamgar and freed the area of it's taint");
        // Thread.sleep(4500);
        System.out.println("Who would have known... you were a hero after all.");
        // Thread.sleep(10500);
        // AdventureGame.clearScreen();
        System.out.println("Press Enter to continue.");
        scan.nextLine(); 

    }
}

class MTGDragon extends Dragon {
    public MTGDragon(String name) {
        super(name);
    }
    
    
}

class TolkienDragon extends Dragon {
    public TolkienDragon(String name) {
        super(name);
    }
}

class WowDragon extends Dragon {
    public WowDragon(String name) {
        super(name);
    }
}

class PokeDragon extends Dragon {
    public PokeDragon(String name) {
        super(name);
    }
}

