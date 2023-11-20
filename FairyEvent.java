import java.util.Scanner;

public class FairyEvent extends Event {

FairyEvent(){
    super();
    this.eventLevel = 3;
}
    
public void execute(Player player, Scanner scanner){
        System.out.println("You hear a singing voice coming from deep within the forest. Do you check it out? (Y/N)");
    String check = scanner.nextLine();
    if (check.equalsIgnoreCase("y")){
        System.out.println("You follow the beautiful voice until the dark trees give way to a silver pool.");
        System.out.println("Above the glittering water you see a beautiful lady dancing in the air. You get the feeling that you should not be here. \nLeave? (Y/N) ");
        String leave = scanner.nextLine();
            if(leave.equalsIgnoreCase("y")){
                System.out.println("You decide to try to sneak back the way you came but find that your legs won't obey your wishes. Try again?(Y/N)");
                String try2 = scanner.nextLine();
                if(try2.equalsIgnoreCase("y")){
                    System.out.println("Your feet are firmly planted on the ground like they have taken root. What will you do? \n (1) Lift your left leg with your hands. \n (2) Lift your right leg with your hands. \n (3) Lay down and try to crawl away.");
                    String choice = scanner.nextLine();
                    if(choice.equalsIgnoreCase("1")){
                        System.out.println("Your struggle is drawing the attention of the beautiful lady and before you can take even one step she appears in front of you.");
                        gainEXP(player);
                    }
                    else if (choice.equalsIgnoreCase("2")){
                        System.out.println("placeholder small buff");
                        gainEXP(player);
                    }
                    else if (choice.equalsIgnoreCase("3")){
                        System.out.println("the fairy blesses you with a second chance of life.");
                        gainEXP(player);
                    }
                
                }
            } else {
                System.out.println("You are enthranced by the ethereal beauty before you and fail to notice your strenght slowly draining.");
                player.decreaseCurrentHp(5);
                player.decreaseMaxHp(5);
                player.decreaseAttack(2);
                player.decreaseSpeed(1);
                System.out.println("You probably should leave. Will you walk away? (Y/N)");
                String uselessChoice = scanner.nextLine();
                System.out.println("You find it hard to move, the beautiful voice seem to draw you in and you are tempted to stay. What do you do? \n(1) Stay and watch a few more minutes. \n(2) It is time to leave.");
                String hardChoice = scanner.nextLine();
                if(hardChoice.equalsIgnoreCase("1")){
                    System.out.println("You keep watching the beautiful fairy singing and dancing long into the night. When you finally come to your senses the forest is dark and still.");
                    player.decreaseCurrentHp(15);
                    player.decreaseMaxHp(5);
                    player.decreaseAttack(5);
                    player.decreaseSpeed(4);
                    System.out.println("The experience leave you feeling severely weakened. A fairy's fair form is not for a mortals fragile mind to behold.");
                    gainEXP(player);
                } else if (hardChoice.equalsIgnoreCase("2")){
                    System.out.println("You fight free and back away, slowly making your way back through the trees. The experience leave you feeling weaker than before.");
                    gainEXP(player);                
                }

            }
    } else {
        System.out.println("You continue down the road, the beautiful singing hauting you for a long time.");
        System.out.println("Your resolve was strengthend, you gain experience.");
        player.addExperience(80);

    }




}

}
