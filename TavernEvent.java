import java.util.Scanner;
import java.util.Random;

public class TavernEvent extends Event {

    TavernEvent(){
        super();
        this.eventLevel = 1;
    }
    
    @Override
    public void execute(Player player,Scanner scanner) {

        Random random = new Random();

        System.out.println("You come to an Inn by the road. You decide to take a rest.");
        System.out.println("The inn served a delicious hearty stew, you asked for seconds. Twice.");
        System.out.println("Current HP: + 10");
        player.addCurrenHp(10);
        System.out.println("Before you set out again you decide to play one round of dice with the men at the table next to you.");
        
        int prize = random.nextInt(3);
        if(prize == 0){
            System.out.println("Luck are on your side today. You win a new pair of gloves. They are of fine make and will protect you well.");
            player.addMaxHp(10);
        } else if (prize == 1){
            System.out.println("Lady Luck is smiling at you today. You win a new whetting stone. It will come in handy.");
            player.addAttack(3);
        } else if (prize == 2) {
            System.out.println("You are blessed with good luck today. You walk away with the ruby amulet. It was the most valuable prize, power glowing in the gem.");
            player.addMaxHp(10);
            player.addAttack(3);
        }

        System.out.println("When you set out again you realised you ate way too much. You are sure you gained some weight because you feel slower than before.");
        player.decreaseSpeed(1);
        System.out.println("Speed: - 1");
        }
}
