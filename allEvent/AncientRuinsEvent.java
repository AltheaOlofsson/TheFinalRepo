package allEvent;


import java.util.Scanner;
import java.util.Random;
public class AncientRuinsEvent extends Event {

AncientRuinsEvent() {
    super();
    this.eventLevel = 3;
}

@Override
public void execute(Player player, InputHandler inputHandler) {

    Random randomgen = new Random();
    System.out.println("You enter the ruins and find a mysterious altar.");
        System.out.println("Do you want to approach the altar? (y/n)");
        String altarChoice = input.readInput(player);
            if (altarChoice.equalsIgnoreCase("y")) {
                int outcome = randomgen.nextInt(3);
                if (outcome == 0) {
                    System.out.println("Approaching the altar, you feel a surge of power!");
                    System.out.println("It's time to kick ass and chew bubblegum and you're all out of gum.\nYou gain a level!");
                        player.levelUp();
                } else if (outcome == 1) {
                    System.out.println("The ancient spirits are angered!");
                    System.out.println("You take an arrow to the knee, lose some HP and your speed is reduced!");
                        player.decreaseSpeed(10);
                        player.decreaseCurrentHp(5);
                } else {
                    System.out.println("The altar seems dormant, but you hear a faint voice echo: 'Do a barrel roll!'");
                    System.out.println("Do a barrel roll?");
                    String userChoice = input.readInput(player);
                        if(userChoice.equalsIgnoreCase("y")) {
                            System.out.println("Understanding and paying homage to a classic gaming advice you perform an amazing barrel roll, successfully dodging a poisonous arrow fired at you from behind!");
                            System.out.println("You gain some (50) experience points!");
                        } else {
                            System.out.println("You have no context to the expression and stand too long lost in thought and get hit in the back by a poisonus arrow!");
                            System.out.println("The posion spreads fast and you can feel all your senses numbing. While laying there you suddenly question if you remembered to lock your door before you embarked on this adventure..");
                            System.out.println("You died.");
                                player.setCurrentHp(0);
                        }
                } 
            } else {
                System.out.println("You decide not to approach the altar and continue exploring");
            }
}


}
    
    

