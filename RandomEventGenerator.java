import java.util.Random;
import java.util.Scanner;

public class RandomEventGenerator {
    private Random random;
    Player player;
    Battle battle = new Battle(player);
    
    public RandomEventGenerator() {
        random = new Random();
    }
    
    public void generateRandomEvent(Player player) {
        Occurence event = new Occurence();
        Scanner userInput = new Scanner(System.in);
        int eventNumber = random.nextInt(4) + 1;
        switch (eventNumber) {
            case 1:
                event.occurance1(player);
                break;
            case 2:
                event.occurance2(player, userInput);
                break;
            case 3:
                event.occurance3(player);
                break;
            case 4:
                event.occurance4(player, userInput);
                break;
            // case 5:
            //     battle.battle(player.getLevel());
            default:
                System.out.println("Something went wrong... Scream and run if you see this.");
        }
    }
}