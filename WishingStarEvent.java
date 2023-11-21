import java.util.Scanner;

public class WishingStarEvent extends Event {
    
WishingStarEvent(){
    super();
    this.eventLevel = 1;
}

@Override
public void execute(Player player, Scanner scanner){

    System.out.println("When you are about to tuck in for the night you witness a meteor shower and have the opportunity to wish upon a falling star");
    System.out.println("Do you make a wish? (y/n)");
    String choice = scanner.nextLine();
        if(choice.equalsIgnoreCase("y")) {
            Wish(player, scanner);
        } else if (choice.equalsIgnoreCase("n")) {
            System.out.println("Are you sure? Opportunities like this don't come often!\nMake a wish?");
                choice = scanner.nextLine();
                    if(choice.equalsIgnoreCase("y")) {
                        Wish(player, scanner);
                    } else {
                        noWish(player);
                    }
        } else {
            noWish(player);
            }          
}

private void Wish(Player player, Scanner scanner) {

    System.out.println("\nYou clasp you hands and turn your gaze towards the stars and decide to wish for:" + 
    "\n\n1. Vigorous health\n2. Incredible power\n3. Exceptional speed");
    String wish = scanner.nextLine();
        if(wish.equals("1")) {
            player.addMaxHp(20);
            System.out.println("\nA wave of vitality washes over your body, enhancing your resilience!\nMax HP: + 15\n");
            // System.out.println("You sleep like a baby and wake up the next day feeling rejuvenated and ready to set out.");
        } else if (wish.equals("2")) {
            player.addAttack(10);
            System.out.println("\nYou can feel the power surging inside!\nAttack: + 5\n");
            // System.out.println("You eventually fall asleep. You wake up well rested and ready to set out.");
        } else if (wish.equals("3")) {
            player.addSpeed(20);
                System.out.println("\nYou experience a burst of energy, feeling light on your feet!\nSpeed: + 10\n");
                // System.out.println("At the break of dawn you waste no time and set out immediately."); 
        }

    gainEXP(player);
}        

private void noWish(Player player) {
            
    System.out.println("You decide to just admire the beautiful natural occurance of possible impending doom " +
    "and suddenly can't seem to get the 'impending doom'-part out of your mind.\nYou have trouble falling asleep.\nHP: - 5\n");
        player.decreaseCurrentHp(5);
    System.out.println("You wake up at dawn of the next day and feel like shit. Despite that you know you have to " + 
    "continue your journey.");

    gainEXP(player);


}

}
