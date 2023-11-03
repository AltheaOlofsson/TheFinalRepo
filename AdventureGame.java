import java.util.Scanner;

public class AdventureGame {

    public static void main(String[] args) throws InterruptedException
    {
        boolean quit = false;
        Scanner userInput = new Scanner(System.in);
        
        clearScreen();
        Title();
        Thread.sleep(4000);
        System.out.println("\nPlease type the number or write one of the choices below.");
        Thread.sleep(500);
        System.out.println("[1]Start");
        Thread.sleep(500);
        System.out.println("[2]Help");
        Thread.sleep(500);
        System.out.println("[3]Quit");
        String menuChoice = userInput.nextLine();
        
        while (!quit) {
            if(menuChoice.equalsIgnoreCase("Help") || menuChoice.equalsIgnoreCase("2"))
            {
                System.out.println("This is the instruction text, have I instructed you?");
            }
            else if((menuChoice.equalsIgnoreCase("Start") || menuChoice.equalsIgnoreCase("1")))
            {
                //System.out.println("The Game started, You won! (I think?)");
                clearScreen();
                Game();
            }
            else
            {
                System.out.println("Incorrect input, could you try again?");
            }
            menuChoice = userInput.nextLine();
            
            if(menuChoice.equalsIgnoreCase("Quit") || menuChoice.equalsIgnoreCase("3"))
            {
                System.out.println("This was the quit option, Goodbye!");
                userInput.close();
                quit = true;
            }
        }
    }
    
    private static void Game() //Main Code Here
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
                    System.out.println("Your out of apples.");
                    i--;
                }
            }
            else
            {
                System.out.println("Incorrect Input! Please try again.");
            }
        }
        userInput.close();
        gameComplete = true;
        System.out.println("You win!");
        }
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
            System.out.println("PERFECTLY ACCEPTABLE ADVENTURE TRIP OF A MUNDANE SOMEBODY\n                      2023 EDITION");
            clearScreen();
        }
        System.out.println("PERFECTLY ACCEPTABLE ADVENTURE TRIP OF A MUNDANE SOMEBODY\n                      2023 EDITION");
    }

        public static void clearScreen() 
    {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}