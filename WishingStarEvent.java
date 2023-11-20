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
            player.addExperience(50);
        } else if (choice.equalsIgnoreCase("n")) {
            System.out.println("Are you sure? Opportunities like this don't come often!\nMake a wish?");
                choice = scanner.nextLine();
                    if(choice.equalsIgnoreCase("y")) {
                        Wish(player, scanner);
                        player.addExperience(50);
                    } else {
                        noWish(player);
                        player.addExperience(50);
                    }
        } else {
            noWish(player);
            player.addExperience(50);
        }          
}

private void Wish(Player player, Scanner scanner) {

    System.out.println("You decide to wish for:\n\nGreat health (1)\nMonstrous strenght (2)\nExceptional speed (3)\n");
    String wish = scanner.nextLine();
        if(wish.equals("1")) {
            player.addMaxHp(20);
            System.out.println("You feel revitalized!\nHP: + 15");
            System.out.println("You sleep like a baby and wake up the next day feeling rejuvenated and ready to set out.");
        } else if (wish.equals("2")) {
            player.addAttack(10);
            System.out.println("You can feel the power surging inside!\nAttack: + 5");
            System.out.println("You eventually fall asleep. You wake up well rested and ready to set out.");
        } else if (wish.equals("3")) {
            player.addSpeed(20);
                System.out.println("You feel light on your feet!\nSpeed: + 10");
                System.out.println("At the break of dawn you waste no time and set out immediately."); 
        }
}        

private void noWish(Player player) {
            
    System.out.println("You decide to just admire the beautiful natural occurance of possible impending doom " +
    "and suddenly can't seem to get the 'impending doom'-part out of your mind.\nYou have trouble falling asleep.\nHP: - 5");
        player.decreaseCurrentHp(5);
    System.out.println("You wake up at dawn of the next day and feel like shit. Despite that you know you have to " + 
    "continue your journey.");


}

}
