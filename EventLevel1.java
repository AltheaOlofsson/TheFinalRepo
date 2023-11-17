import java.util.Random;
import java.util.Scanner;

public class EventLevel1 {

     public EventLevel1 (Player p) {
        Scanner userInput = new Scanner(System.in);
        String eventNumber;
        Random random = new Random();
        Player player;
     
        switch (eventNumber) {
            case 1:
                Events root = new RootEvent(player);
                break;
            case 2:
                Events tavern = new TavernEvent(player);
                break;
            case 3:
               
                break;
            case 4:
              
                break;
            default:
                System.out.println("Something went wrong...");
        }
    }
}




}
