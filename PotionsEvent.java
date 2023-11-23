import java.util.Scanner;

public class PotionsEvent extends Event {
       
        PotionsEvent() {
                super();
                this.eventLevel = 5;
}     
        @Override
        public void execute(Player player, InputHandler inputHandler) {
        System.out.println("placeholder");
        gainEXP(player);

    }

}
