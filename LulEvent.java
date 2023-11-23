import java.util.Scanner;

public class LulEvent extends Event {
       
        LulEvent() {
                super();
                this.eventLevel = 12;
}     
        @Override
        public void execute(Player player, InputHandler inputHandler) throws InterruptedException {
                System.out.println("Lul");
                }
        
        }
