import java.util.Random;
import java.util.Scanner;

public class RandomChestEvent extends Event {

    RandomChestEvent(){
        super();
        this.eventLevel = 2;
    }

 @Override
    public void execute(Player player, Scanner scanner) {

        Random random = new Random();

        System.out.println("While stopping by in a small town one day you wander through the market on a busy street when a peculiarly dressed man catches your eye. " +
         "Your feet seem to live their own life and before long you find yourself in front of his stand, curiousity piqued." + 
         "Welcome Traveler, ");


    }
    
}
