import java.util.Scanner;
import java.util.Random;

public class HardlyCodedEvent extends Event {
       Player player;
       Scanner scanner;
       private Random random;
        HardlyCodedEvent() {
                super();
                this.eventLevel = 20;
        }     
        @Override
        public void execute(Player player, Scanner scanner) throws InterruptedException{
                System.out.println("You walk along the path and come across an old man with a cart laden with sacks and boxes. \nThe carts axle is broken and the man looks feeble and distraught.");
                Thread.sleep(500);
                System.out.println("He sees you and his face brightens.");
                Thread.sleep(1000);
                System.out.println("-Hoy there young adventurer! Would you mind helping an old man? \nI have a new axle for the cart but my feeble arms and back \nprevents me from lifting the cart to install it.");
                Thread.sleep(3000);
                System.out.println("I'll reward you with whatever my hand first touches when I reach inside my cart.");
                System.out.println("What do you want to do?? \n[1] Help the poor man. \n[2] Rob him blind. \n[3] Leave him on the road. You have important buisness to atend.");
                Scanner chooseToHelp = 


                int random = new Random();
        }
        
}
