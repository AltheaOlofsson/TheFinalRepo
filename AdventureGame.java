import java.util.Scanner;

public class AdventureGame {

    public static void main(String[] args) throws InterruptedException
    {
        boolean quit = false;
        Scanner userInput = new Scanner(System.in);
        
        System.out.println(Title());
        String menuChoice = userInput.nextLine();
        
        while (!quit) {
            if(menuChoice.equalsIgnoreCase("Help") || menuChoice.equalsIgnoreCase("2"))
            {
                System.out.println("This is the instruction text, have I instructed you?");
            }
            else if((menuChoice.equalsIgnoreCase("Start") || menuChoice.equalsIgnoreCase("1")))
            {
                //System.out.println("The Game started, You won! (I think?)");
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
                Event.generateRandomEvent();
            }
            else if (roomChoice.equalsIgnoreCase("Right") || roomChoice.equalsIgnoreCase("2"))
            {
                System.out.println("Combat");
            }
            else if (roomChoice.equalsIgnoreCase("Eat Apple") || roomChoice.equalsIgnoreCase("3"))
            {
                if (apple > 0)
                {
                    apple--;
                    System.out.println("You ate an apple, you now have " + apple + "/3");
                }
                else
                {
                    System.out.println("Your out of apples.");
                }
            }
            else
            {
                System.out.println("Incorrect Input! Please try again.");
            }
        }
        System.out.println("You win!");
        userInput.close();
    }


    public static String Title()
    {
        return "PERFECTLY ACCEPTABLE ADVENTURE TRIP OF A MUNDANE SOMEBODY \n                      2023 EDITION\nPlease type the number or write one of the choices below\n[1]Start\n[2]Help\n[3]Quit";
    }
}