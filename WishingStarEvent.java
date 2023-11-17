import java.util.Scanner;

public class WishingStarEvent extends Event {
    
WishingStarEvent(){
    super();
    this.eventLevel = 3;
}

@Override
public void execute(Player player, Scanner scanner){

    System.out.println("When you are about to tuck in for the night you witness a meteor shower and have the opportunity to wish upon a falling star");
    System.out.println("Do you make a wish? (y/n)");
    String choice = scanner.nextLine();
        if(choice.equalsIgnoreCase("y")) {
            System.out.println("You decide to wish for:\n\nGreat health (1)\nFenomenal strenght (2)\nExceptional speed (3)\n");
            String wish = scanner.nextLine();
                if(wish.equals("1")) {
                   player.addMaxHp(20);
                   System.out.println("You has good health my friend");
                } else if (wish.equals("2")) {
                  player.addAttack(10);
                   System.out.println("You can feel the power surging inside!");
                } else if (wish.equals("3")) {
                  player.addSpeed(20);
                   System.out.println();
                }

        } else {
            System.out.println("You decide to just admire the beautiful natural occurance of possible impending doom " +
            "and suddenly can't seem to get the 'impending doom'-part out of your mind.\nYou have trouble falling asleep.\nHP: - 5");
            player.decreaseCurrentHp(5);
            System.out.println("You wake up at dawn of the next day and feel like shit. Despite that you know you have to " + 
            "continue your journey.");
}           }





}
