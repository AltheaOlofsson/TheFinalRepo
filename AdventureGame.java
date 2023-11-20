import java.util.Scanner;

import org.w3c.dom.UserDataHandler;

public class AdventureGame {
    boolean gameOver = false;

    public static void main(String[] args) throws InterruptedException {
        // AdventureGame game = new AdventureGame();
        MenuController menu = new MenuController();
        Scanner userInput = new Scanner(System.in);
        String name;

        clearScreen();
        title();
        mainMenu();
        
        while (true)
        {
            menu.selectOption();
        }
    }

    public static String inputName(Scanner userInput) {
        boolean nameEmpty = true;
        String name = "";
        while (nameEmpty)
        {
            System.out.println("\n\nWhat is your name? ");
            name = userInput.nextLine();
            if (name.length() != 0)
            {
                nameEmpty = false;
            }
            else
            {
                System.out.println("Incorrect input, empty! Please type in a name.");
            }
        }
        return name;
    }

    public static void title() throws InterruptedException 
    {
        System.out.print("PERFECTLY ");
        Thread.sleep(200);
        System.out.print("ACCEPTABLE ");
        Thread.sleep(200);
        System.out.print("ADVENTURE ");
        Thread.sleep(200);
        System.out.print("OF ");
        Thread.sleep(200);
        System.out.print("A ");
        Thread.sleep(250);
        System.out.print("MUNDANE ");
        Thread.sleep(200);
        System.out.print("SOMEBODY");
        Thread.sleep(200);
        System.out.print("\n                      2023 EDITION");
        clearScreen();

        for (int i = 0; i < 20; i++)
        {
            Thread.sleep(50);
            System.out.println("PERFECTLY ACCEPTABLE ADVENTURE OF A MUNDANE SOMEBODY\n                      2023 EDITION");
            clearScreen();
        }
    }

    public static void midStory(String name) throws InterruptedException 
    {
        System.out.println("After hearing a commotion of a giant beast among nearby ruined catacombs, you ask the men if you could hear more about this. One of them tells you:");
        Thread.sleep(3000);
        System.out.print("\n -That damned bleeding monstrosity is holding us at standstill!");
        Thread.sleep(3000);
        System.out.print(" I've needed to deliver this shipment for the past 2 weeks!");
        Thread.sleep(3000);
        System.out.println("\n Matter of fact, everyone in this village here has some deliveries to be made but can't, in fear of the beast.");
        Thread.sleep(3000);
        System.out.println("\nYou then tell the man that you think you could handle the monster.");
        Thread.sleep(3000);
        System.out.print("\n -You?");
        Thread.sleep(1500);
        System.out.print(" You want to take care of it?");
        Thread.sleep(2500);
        System.out.print(" You look like nuthin' but a milksop!");
        Thread.sleep(3000);
        System.out.print(" A run-of-the-mill farmer!");
        Thread.sleep(3000);
        System.out.println("\n What could you possibly offer rather than what hero or knight could?");
        Thread.sleep(3000);
        System.out.println("\nYou blankly stare at the man and simply tell them: \"I'll do it for free.\"");
        Thread.sleep(3000);
        System.out.println("The man raises one eyebrow, visibly confused by your words but simply shrugs and says: ");
        Thread.sleep(3000);
        System.out.print("\n -well if it is a deathwish you want then so be it.");
        Thread.sleep(3000);
        System.out.print(" At least we won't have to pay for your failures.");
        Thread.sleep(3000);
        System.out.print("\n Alright if you want to take this one then I'll at the very least guide you to the path.");
        Thread.sleep(3000);
        System.out.print("\n\nThe man shows you to the path and lets you off,");
        Thread.sleep(3000);
        System.out.print(" you venture forth the path leading towards the catacombs.");
        Thread.sleep(3000);
        System.out.print("\nYou've tread for some time now and suddenly hear something.");
        Thread.sleep(1500);
        System.out.print(".");
        Thread.sleep(1500);
        System.out.print(".");
        Thread.sleep(2000);
        System.out.print(" Tis a slime that appears! Draw your weapon and ready yourself for battle!\n");
        Thread.sleep(3000);
    }

    public static void endStory() throws InterruptedException 
    {
        System.out.print("As you keep pacing towards the ruined catacombs... ");
        Thread.sleep(3000);
        System.out.print("you start to feel immense dread as you get closer and closer.");
        Thread.sleep(3000);
        System.out.print("\nThe despair you're feeling grows intensely, your legs shakes in fear.");
        System.out.println("As you approach the last room of the catacombs, the remains of an ancient altar.");
        System.out.print("\nYou hear the foreboding bellows from the monster.");
        System.out.print("The horror of it is immense, you stand hopeless.");
        System.out.println("You make a feeble attempt to regain control of yourself.");
        System.out.print("\nDrawing your weapon and readying yourself for the beasts incoming attack.");
        Thread.sleep(1500);
        System.out.print(".");
        Thread.sleep(1500);
        System.out.print(".");
        Thread.sleep(3000);
        System.out.println("You perished.");
        

        System.out.println("\nWhat did you expect? You weren't the hero, ");
        System.out.println("\n|GAME OVER|");
    }

    public static void trueEndStory() 
    {
        System.out.println("You win");
    }

    public static void clearScreen() 
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void resetPlayer(Player player)
    {
        player.setApple(3);
        player.setExperience(0);
        player.setLevel(1);
        player.setMaxHp(20);
        player.setCurrentHp(20);
        player.setAttack(10);
        player.setSpeed(15);
    }

    public static void mainMenu() throws InterruptedException {
        System.out.println("PERFECTLY ACCEPTABLE ADVENTURE OF A MUNDANE SOMEBODY\n                      2023 EDITION");
        Thread.sleep(600);
        System.out.println("\nPlease type the number or write one of the choices below.");
        Thread.sleep(200);
        System.out.println("[1]Start");
        Thread.sleep(200);
        System.out.println("[2]Help");
        Thread.sleep(200);
        System.out.println("[3]Quit");
    }
}
