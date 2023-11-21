import java.util.Random;
import java.util.Scanner;

public class RandomChestEvent extends Event {

    RandomChestEvent(){
        super();
        this.eventLevel = 2;
    }

 @Override
    public void execute(Player player, Scanner scanner) {

        System.out.println("While stopping by in a small town one day you wander through the market on a busy street when a peculiarly dressed man catches your eye. " +
         "Your feet seem to live their own life and before you know it you find yourself in front of his stand, curiousity piqued. " + 
         "\nWelcome Traveler, care to play a game of mysteries? He says, gesturing the woven mat in front of him with an enigmatic smile. " + 
         "\nYou eye the three chests on the mat with interest, finding yourself asking what you have to do. " + 
         "\nIn one of these chests there is a valuable tresure. You get to choose only one to open and you gain whatever is inside. " + 
         "But beware, only one is a lucky choice, the others only contains missfortune. " + 
         "You cannot resist and against your better judgement you agree to the game. ");

        int chest = randomgen.nextInt(4);

        switch(chest){

            case 0: {
                System.out.println("You go with gutfeeling and pick the sturdy chest to the left. You lift the lid and find a golden amulet with a glowing orb of lapis lazuli in the center. Surely this must be the treasure.");
                player.addMaxHp(10);
                player.addAttack(5);
                System.out.println("You take the amulet from the chest and put it around your neck. You feel stronger already.");
            }
            case 2: {
                System.out.println("After careful consideration you choose to open the wooden chest in the center. This felt like a test of your greed and you would not fail.");
                
            }

        }



    }
    
}
