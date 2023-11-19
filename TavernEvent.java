import java.util.Scanner;

public class TavernEvent extends Event {

    TavernEvent(){
        super();
        this.eventLevel = 2;
    }
    
    @Override
    public void execute(Player player,Scanner scanner) {
        System.out.println("You come to an Inn by the road. You decide to take a rest.");
        System.out.println("The inn served a delicious hearty stew, you asked for seconds. Twice.");
        System.out.println("Current HP: + 10");
        player.addCurrenHp(10);
        System.out.println("When you set out again you realised you ate way too much. Your movements feel sluggish.");
        player.decreaseSpeed(1);
        System.out.println("Speed: - 1");
        }
}
