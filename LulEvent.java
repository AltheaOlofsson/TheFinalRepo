import java.util.Scanner;

public class LulEvent extends Event {
       
        LulEvent() {
                super();
                this.eventLevel = 12;
}     
        @Override
        public void execute(Player player, Scanner scanner) {
                System.out.println("Lul");
                }
        
        }
