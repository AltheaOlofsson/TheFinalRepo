import java.util.Scanner;

public class AdventureGame {

    public static void main(String[] args) 
    {
        boolean quit = false;
        int roomChoices;
        Scanner userInput = new Scanner(System.in);
        
        System.out.println(Title());
        String menuChoice = userInput.nextLine();

        if(menuChoice.equalsIgnoreCase("Help") || menuChoice.equalsIgnoreCase("2"))
        {
            System.out.println("This is the instruction text, have I instructed you?");
        }
        else if(menuChoice.equalsIgnoreCase("Quit") || menuChoice.equalsIgnoreCase("3"))
        {
            System.out.println("This was the quit option, Goodbye!");
        }
        else if((menuChoice.equalsIgnoreCase("Start") || menuChoice.equalsIgnoreCase("1")))
        {
            System.out.println("The Game started, You won! (I think?)");
        }
        else
        {
            System.out.println("Incorrect input, could you try again?");
        }
    }

    public static String Title()
    {
        return "PERFECTLY ACCEPTABLE ADVENTURE TRIP OF A MUNDANE SOMEBODY \n                      2023 EDITION\nPlease type the number or write one of the choices below\n[1]Start\n[2]Help\n[3]Quit";
    }
}