import java.util.Scanner;
import java.util.Random;

public class eventSwitch {
    public void generateRandomEvent() {
        Scanner userInput = new Scanner(System.in);
        Random random = new Random();
        String eventInput;
        Player player;
        int eventNumber = random.nextInt(4) + 1;
        switch (eventNumber) {
            case 1:
                EventLevel1 event1 = new EventLevel1(player);
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
            default:
                System.out.println("Something went wrong...");
        }
    }
}


}
