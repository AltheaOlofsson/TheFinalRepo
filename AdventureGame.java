import java.util.Scanner;

import org.w3c.dom.UserDataHandler;

public class AdventureGame {

    public static void main(String[] args) throws InterruptedException {
        boolean quit = false;
        Scanner userInput = new Scanner(System.in);
        String name;
        String instructions =
        "In this game you will go through a series of encounters where the goal of the game is to reach the end." 
        +"\nEach room will prompt you with a path of either left or right and present an event." 
        +"\nThese events could either be in the form combat against monsters or an event that will further prompt you to make a decision." 
        +"\nThese events can either reward or punish the player." 
        +"\n\nThe player character and monsters has a set of stats, these are:" 
        +"\n- Level : What level the player is and determines their overall prowess." 
        +"\n- HP : How much health the player/monster has." 
        +"\n- Attack : How much damage they deal." 
        +"\n- Speed : How dexterous either one is, the one that has more than the other fights first." 
        +"\n- Experience : This is received whenever a task is completed or after defeating a monster. Accumulate enough and you rise in level." 
        +"\nYou as the player also has a set of apples that whenever eaten will fully rejuvenate you." 
        +"\nUseful if you've taken a large amount of damage." 
        +"\n\n Whenever in-game you can also type the following commands:" 
        +"\n- /help : Will give you instructions how to play the game." 
        +"\n- /stats : Displays the current stats of the player." 
        +"\n- /quit : Quits the game." 
        +"\n\nGood luck \"mundane somebody\"!" 
        +"\n\nPress ENTER to return to menu.";

        clearScreen();
        title();
        mainMenu();
        // String menuChoice = userInput.nextLine();

        while (!quit)
        {           String menuChoice = userInput.nextLine();

            if (menuChoice.equalsIgnoreCase("Help") || menuChoice.equalsIgnoreCase("2"))
            {
                clearScreen();
                System.out.println(instructions);
                userInput.nextLine();
                clearScreen();
                mainMenu();
            }
            else if ((menuChoice.equalsIgnoreCase("Start") || menuChoice.equalsIgnoreCase("1")))
            {
                clearScreen();
                // beginStory();
                name = inputName(userInput);
                Player player = new Player(name);

                clearScreen();
                // midStory(name);
                Game(player);
                quit = true;
            }
            else
            {
                System.out.println("Incorrect input, could you try again?");
            }

            if (menuChoice.equalsIgnoreCase("Quit") || menuChoice.equalsIgnoreCase("3"))
            {
                System.out.println("Game Shutting down...");
                userInput.close();
                quit = true;
            }
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

    private static void Game(Player player) throws InterruptedException // Main Code Here
    {
        Scanner userInput = new Scanner(System.in);
        boolean gameOver = false;
        int rooms = 5; // How many rooms or a.k.a event choice will happen.
        player.setApple(3);
        // player.setMaxHp(500);
        // player.setCurrentHp(500);
        String roomChoice;
        EventController ec = new EventController();
        // RandomEventGenerator Event = new RandomEventGenerator();
        Battle battle = new Battle(player);

        
        String midInstructions =
        "You ";

        while (!gameOver)
        {
            // resetPlayer(player);
            
            for (int i = 1; i <= rooms; i++)
            {
                System.out.println("\nWhich path do you want to take?\n[1]Left?\n[2]Right? This path is blocked by a monster but you cant tell what exactly. \n[3]Eat a Holy Golden Apple ("+ player.getApple() + "/4)");
                roomChoice = userInput.nextLine();
                if (roomChoice.equalsIgnoreCase("Left") || roomChoice.equalsIgnoreCase("1"))
                {
                    clearScreen();
                    Event e = ec.generateEvent(player);
                    e.execute(player, userInput);
                    // Event.generateRandomEvent(player);
                }
                else if (roomChoice.equalsIgnoreCase("Right") || roomChoice.equalsIgnoreCase("2"))
                {
                    clearScreen();
                    battle.battle(player);
                }
                else if (roomChoice.equalsIgnoreCase("Eat apple") || roomChoice.equalsIgnoreCase("3"))
                {
                    if (player.getApple() > 0)
                    {
                        clearScreen();
                        player.eatApple();
                        System.out.println("You eat one of your holy golden apples. You feel rejuvenated, every wound you beared restored.");
                        System.out.println("\nPress ENTER to continue.");
                        userInput.nextLine();
                        i--;
                        clearScreen();
                    }
                }
                else if (roomChoice.equalsIgnoreCase("/stats"))
                {
                    player.displayPlayerStats(userInput);
                }
                else if (roomChoice.equalsIgnoreCase("/help"))
                {
                    clearScreen();
                    System.out.println(midInstructions);
                }
                else if (roomChoice.equalsIgnoreCase("/exit"))
                {
                    clearScreen();
                    System.out.println("Game Shutting down...");
                    gameOver = true;
                    break;
                }
                else
                {
                    clearScreen();
                    System.out.println("Incorrect Input! Please try again. /stats to check your stats, /help for instructions, /exit to quit.");
                    i--;
                }

                if (player.IsAlive(player.getCurrentHp()) != true)
                {
                    clearScreen();
                    System.out.println("You've died!");
                    Thread.sleep(3000);
                    System.out.println("\nThis poor soul has perished, may darkness overtake them and drift away to the afterlife.");
                    System.out.println("\nDo you want to retry? Press ENTER to retry, type \"No\" to quit.");
                    String playAgain = userInput.nextLine().toLowerCase();

                    if (playAgain.equals("no") || playAgain.equals("n"))
                    {
                        clearScreen();
                        System.out.println("|GAME OVER|");
                        System.out.println("Game Shutting down...");
                        gameOver = true;
                        break;
                    }
                    clearScreen();
                    break;
                }
            }
        }
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

    public static void mainMenu() throws InterruptedException 
    {
        System.out.println(
                "PERFECTLY ACCEPTABLE ADVENTURE OF A MUNDANE SOMEBODY\n                      2023 EDITION");
        Thread.sleep(600);
        System.out.println("\nPlease type the number or write one of the choices below.");
        Thread.sleep(200);
        System.out.println("[1]Start");
        Thread.sleep(200);
        System.out.println("[2]Help");
        Thread.sleep(200);
        System.out.println("[3]Quit");
    }

    public static void beginStory() throws InterruptedException 
    {
        System.out.println(">|GAME START<|");
        Thread.sleep(1500);
        clearScreen();
        Thread.sleep(1000);
        System.out.println(
                "This is an era of Monsters, Beasts and Badmen. These lands are ridden with fear and strife.");
        Thread.sleep(3000);
        System.out.println("In these times a great warrior is needed, a saviour of true heroism.");
        Thread.sleep(3000);
        System.out.print("This \"warrior\"... ");
        Thread.sleep(3000);
        System.out.print("is not you.");
        Thread.sleep(1000);
        System.out.print("\nInstead you are; ");
        Thread.sleep(1200);
        System.out.print("average joe, ");
        Thread.sleep(1200);
        System.out.print("mundane, ");
        Thread.sleep(1200);
        System.out.print("milquetoast.");
        Thread.sleep(3000);
        System.out.println(
                "\nYou decided however that your current occupation wasn't worth your time anymore.");
        Thread.sleep(3000);
        System.out.println(
                "You then made the decision that adventuring was a bigger endavour worthy of your commitment");
        Thread.sleep(3000);
        System.out.println("You ready up, equip whatever you have in your possession.");
        Thread.sleep(3000);
        System.out.println(
                "And you also grab your grandfathers rare \"Holy Golden Apples\", said to have the ability to heal any wound.");
        Thread.sleep(3000);
        System.out.println("You leave and never look behind back at your old life...");
        Thread.sleep(3000);
    }

    public static void midStory(String name) throws InterruptedException 
    {
        System.out.println(
                "After hearing a commotion of a giant beast among nearby ruined catacombs, you ask the men if you could hear more about this. One of them tells you:");
        Thread.sleep(3000);
        System.out.print("\n -That damned bleeding monstrosity is holding us at standstill!");
        Thread.sleep(3000);
        System.out.print(" I've needed to deliver this shipment for the past 2 weeks!");
        Thread.sleep(3000);
        System.out.println(
                "\n Matter of fact, everyone in this village here has some deliveries to be made but can't, in fear of the beast.");
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
        System.out
                .println("\n What could you possibly offer rather than what hero or knight could?");
        Thread.sleep(3000);
        System.out.println(
                "\nYou blankly stare at the man and simply tell them: \"I'll do it for free.\"");
        Thread.sleep(3000);
        System.out.println(
                "The man raises one eyebrow, visibly confused by your words but simply shrugs and says: ");
        Thread.sleep(3000);
        System.out.print("\n -well if it is a deathwish you want then so be it.");
        Thread.sleep(3000);
        System.out.print(" At least we won't have to pay for your failures.");
        Thread.sleep(3000);
        System.out.print(
                "\n Alright if you want to take this one then I'll at the very least guide you to the path.");
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
        System.out.print(
                " Tis a slime that appears! Draw your weapon and ready yourself for battle!\n");
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
        System.out.println("");
        System.out.println("\nYou are not the hero, what did you expect?");
    }

    public static void trueEndStory() 
    {

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
}
