import java.util.Scanner;

import org.w3c.dom.UserDataHandler;

public class AdventureGame {
    boolean gameOver = false;

    public static void main(String[] args) throws InterruptedException {
        // AdventureGame game = new AdventureGame();
        MenuController menu = new MenuController();

        clearScreen();
        title();
        
        while (true)
        {
            mainMenu();
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
