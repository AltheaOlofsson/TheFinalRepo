import java.util.Scanner;

public class MenuController {
    // Scanner userInput = new Scanner(System.in);
    InputHandler input = new InputHandler();
    String instructions =
            "In this game you will go through a series of encounters where the goal of the game is to reach the end."
            + "\nEach room will prompt you with a path of either left or right and present an event."
            + "\nThese events could either be in the form combat against monsters or an event that will further prompt you to make a decision."
            + "\nThese events can either reward or punish the player."
            
            + "\n\nThe player character and monsters has a set of stats, these are:"
            + "\n- Level : What level the player is and determines their overall prowess."
            + "\n- HP : How much health the player/monster has." + "\n- Attack : How much damage they deal."
            + "\n- Speed : How dexterous either one is, the one that has more than the other fights first."
            + "\n- Experience : This is received whenever a task is completed or after defeating a monster. Accumulate enough and you rise in level."
            + "\nYou as the player also has a set of apples that whenever eaten will fully rejuvenate you."
            + "\nUseful if you've taken a large amount of damage."
            
            + "\n\n Whenever in-game you can also type the following commands:"
            + "\n- /help : Will give you instructions how to play the game."
            + "\n- /stats : Displays the current stats of the player." + "\n- /quit : Quits the game."
            
            + "\n\nGood luck \"mundane somebody\"!" + "\n\nPress ENTER to return to menu.";

    public Player selectOption() {
        String menuChoice = input.readInput(null);
        String name;
        Player player = null;

        switch (menuChoice) {
            case "start":
            case "1":
                clearScreen();
                // try 
                // {
                //     beginStory();
                // }
                // catch (InterruptedException e) {/* IGNORE */}
                name = inputName(input);
                player = new Player(name);
                GameController game = new GameController(player);
                game.selectPath();
                return player;

            case "help":
            case "2":
                clearScreen();
                System.out.println(instructions);
                input.readInput(player);
                clearScreen();
                break;

            case "quit":
            case "3":
                System.out.println("Game Shutting down...");
                // input.close();
                System.exit(0);
                break;

            default:
                System.out.println("Incorrect input! Please try again.");
                break;
        }
        return player;
    }
    
    boolean quit = false;
    
    public String inputName(InputHandler input2) {
        boolean nameEmpty = true;
        String name = "";
        while (nameEmpty) {
            System.out.println("\n\n What is your name? ");
            name = input2.readInput(null);
            if (name.length() != 0) {
                nameEmpty = false;
            }
            else {
                System.out.println("Incorrect input, empty! Please type in a name.");
            }
        }
        return name;
    }

    public void beginStory() throws InterruptedException {
        System.out.println(">|GAME START<|");
        Thread.sleep(1500);
        clearScreen();
        Thread.sleep(1000);
        System.out.println("This is an era of Monsters, Beasts and Badmen. These lands are ridden with fear and strife.");
        Thread.sleep(2000);
        System.out.println("In these times a great warrior is needed, a saviour of true heroism.");
        Thread.sleep(2000);
        System.out.print("This \"warrior\"... ");
        Thread.sleep(2000);
        System.out.print("is not you.");
        Thread.sleep(500);
        System.out.print("\nInstead you are; ");
        Thread.sleep(600);
        System.out.print("average joe, ");
        Thread.sleep(600);
        System.out.print("mundane, ");
        Thread.sleep(600);
        System.out.print("milquetoast.");
        Thread.sleep(1500);
        System.out.println("\nYou decided however that your current occupation wasn't worth your time anymore.");
        Thread.sleep(2000);
        System.out.println("You then made the decision that adventuring was a bigger endavour worthy of your commitment");
        Thread.sleep(2000);
        System.out.println("You ready up, equip whatever you have in your possession.");
        Thread.sleep(2000);
        System.out.println("And you also grab your grandfathers rare \"Holy Golden Apples\", said to have the ability to heal any wound.");
        Thread.sleep(2000);
        System.out.println("You leave and never look behind back at your old life...");
        Thread.sleep(2000);
    }

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
