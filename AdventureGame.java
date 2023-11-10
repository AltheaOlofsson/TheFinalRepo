import java.util.Scanner;

public class AdventureGame {

    public static void main(String[] args) throws InterruptedException
    {
        boolean quit = false;
        Scanner userInput = new Scanner(System.in);
        String name;
        
        clearScreen();
        Title();
        String menuChoice = userInput.nextLine();
        
        while (!quit) {
            if(menuChoice.equalsIgnoreCase("Help") || menuChoice.equalsIgnoreCase("2"))
            {
                System.out.println("This is the instruction text, have I instructed you?");
            }
            else if((menuChoice.equalsIgnoreCase("Start") || menuChoice.equalsIgnoreCase("1")))
            {
                clearScreen();
                Story();
                name = inputName(userInput);
                Player player = new Player(name);
                clearScreen();
                midStory(name);
                Game(name);
            }
            else
            {
                System.out.println("Incorrect input, could you try again?");
            }
            menuChoice = userInput.nextLine();
            
            if(menuChoice.equalsIgnoreCase("Quit") || menuChoice.equalsIgnoreCase("3"))
            {
                System.out.println("Game Shutting down...");
                userInput.close();
                quit = true;
            }
        }
    }

    public static String inputName(Scanner userInput)
    {
        boolean nameEmpty = true;
        String name = "";
        while(nameEmpty)
        {
            System.out.println("\n\n What is your name? ");
            name = userInput.nextLine();
            if (name.length() != 0) 
            {
                nameEmpty = false;
            }
            else
            {
                System.out.println("Oops! Please type in a name.");
            }
        }
        return name;
    }
    
    private static void Game(String name) //Main Code Here
    {
        Scanner userInput = new Scanner(System.in);
        boolean gameOver = false;
        int rooms = 5; //How many rooms or a.k.a event choice will happen.
        int apple = 3;
        String roomChoice;
        RandomEventGenerator Event = new RandomEventGenerator();
        

        for (int i = 1; i <= rooms; i++)
        {
            System.out.println("\nWhich path do you want to take?\n[1]Left?\n[2]Right?\n[3]Eat Apple? " + apple + "/3");
            roomChoice = userInput.nextLine();
            if (roomChoice.equalsIgnoreCase("Left") || roomChoice.equalsIgnoreCase("1")) 
            {
                clearScreen();
                Event.generateRandomEvent();
            }
            else if (roomChoice.equalsIgnoreCase("Right") || roomChoice.equalsIgnoreCase("2"))
            {
                clearScreen();
                System.out.println("Combat");
            }
            else if (roomChoice.equalsIgnoreCase("Eat Apple") || roomChoice.equalsIgnoreCase("3"))
            {
                if (apple > 0)
                {
                    clearScreen();
                    apple--;
                    System.out.println("You ate an apple.");
                    i--;
                }
                else
                {
                    clearScreen();
                    System.out.println("You're out of apples.");
                    i--;
                }
            }
            else
            {
                clearScreen();
                System.out.println("Incorrect Input! Please try again.");
                i--;
            }
        }
        userInput.close();
        System.out.println("You win!");
    }

    public static void Story() throws InterruptedException
    {
        System.out.println(">|GAME START<|");
        Thread.sleep(1500);
        clearScreen();
        Thread.sleep(1000);
        System.out.println("This is an era of Monsters, Beasts and Badmen. These lands are ridden with fear and strife.");
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
        System.out.println("\nYou decided however that your current occupation wasn't worth your time anymore.");
        Thread.sleep(3000);
        System.out.println("You then made the decision that adventuring was a bigger endavour worthy of your commitment");
        Thread.sleep(3000);
        System.out.println("You ready up, equip whatever you have in your possession.");
        Thread.sleep(3000);
        System.out.println("And you also grab your grandfathers rare \"Holy Golden Apples\", said to have the ability to heal any wound.");
        Thread.sleep(3000);
        System.out.println("You leave and never look behind back at your old life...");
        Thread.sleep(3000);
    }

    public static void Title() throws InterruptedException
    {
        System.out.print("PERFECTLY ");
        Thread.sleep(800);
        System.out.print("ACCEPTABLE ");
        Thread.sleep(800);
        System.out.print("ADVENTURE ");
        Thread.sleep(800);
        System.out.print("OF ");
        Thread.sleep(800);
        System.out.print("A ");
        Thread.sleep(1000);
        System.out.print("MUNDANE ");
        Thread.sleep(800);
        System.out.print("SOMEBODY");
        Thread.sleep(800);
        System.out.print("\n                      2023 EDITION");
        clearScreen();

        for(int i = 0; i < 10; i++)
        {
            Thread.sleep(50);
            System.out.println("PERFECTLY ACCEPTABLE ADVENTURE OF A MUNDANE SOMEBODY\n                      2023 EDITION");
            clearScreen();
        }
        System.out.println("PERFECTLY ACCEPTABLE ADVENTURE OF A MUNDANE SOMEBODY\n                      2023 EDITION");
        Thread.sleep(1200);
        System.out.println("\nPlease type the number or write one of the choices below.");
        Thread.sleep(200);
        System.out.println("[1]Start");
        Thread.sleep(200);
        System.out.println("[2]Help");
        Thread.sleep(200);
        System.out.println("[3]Quit");
    }
    
    public static void midStory(String name) throws InterruptedException {
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

    public static void clearScreen() 
    {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}