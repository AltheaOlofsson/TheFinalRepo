import java.util.Random;
import java.util.Scanner;

public class RandomEventGenerator {
    private Random random;

    public RandomEventGenerator() {
        random = new Random();
    }

    public void generateRandomEvent() {
        Scanner userInput = new Scanner(System.in);
        String eventInput;
        int eventNumber = random.nextInt(3) + 1;
        switch (eventNumber) {
            case 1:
                System.out.println("A monster appears! Kill it? [Y/N]");
                eventInput = userInput.nextLine();
                if(eventInput.equalsIgnoreCase("Y"))
                {
                    System.out.println("You killed it.");
                }
                else
                {
                    System.out.println("You ran away from the monster.");
                }
                break;
            case 2:
                System.out.println("You find a treasure chest! loot it? [Y/N]");
                eventInput = userInput.nextLine();
                if(eventInput.equalsIgnoreCase("Y"))
                {
                    System.out.println("It held a shiny rock.");
                }
                else
                {
                    System.out.println("It could be a trap... Leave it.");
                }
                break;
            case 3:
                System.out.println("You fall into a trap! Dodge it! [Y/N]");
                eventInput = userInput.nextLine();
                if(eventInput.equalsIgnoreCase("Y"))
                {
                    System.out.println("You did it.");
                }
                else
                {
                    System.out.println("You fell and took some damage.");
                }
                break;
            default:
                System.out.println("Something went wrong...");
        }
    }
}