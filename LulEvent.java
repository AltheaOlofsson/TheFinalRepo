import java.util.Scanner;

public class LulEvent extends Event {
       
        LulEvent() {
                super();
                this.eventLevel = 2;
}     
        @Override
        public void execute(Player player, Scanner scanner) {
                System.out.println("Lul");
                }
        
        }
