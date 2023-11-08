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
                System.out.println("Incorrect name input! Please type it again. ");
            }
        }
        return name;
    }
    
    private static void Game(String name) //Main Code Here
    {
        Scanner userInput = new Scanner(System.in);
        boolean gameComplete = false;
        int rooms = 5; //How many rooms or a.k.a event choice will happen.
        int apple = 3;
        String roomChoice;
        RandomEventGenerator Event = new RandomEventGenerator();
        
        while(!gameComplete)
        {
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
        gameComplete = true;
        System.out.println("You win!");
        }
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
        System.out.println("\nAnd you decided that your current occupation wasn't worth your time anymore.");
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

        public static void clearScreen() 
    {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}