import java.util.Scanner;

public class ArenaEvent extends Event {
     ArenaEvent() {
                super();
                this.eventLevel = 12;
}     
        @Override
        public void execute(Player player, Scanner scanner) {
                System.out.println("Arena Event");
                gainEXP(player);
                }
        
}
