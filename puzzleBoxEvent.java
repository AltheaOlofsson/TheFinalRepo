import java.util.*;

public class puzzleBoxEvent extends Event {
    
    public puzzleBoxEvent() {
        super();
        this.eventLevel = 2;
    }
    
    @Override
    public void execute(Player player, Scanner scanner) {
        
    System.out.println("While exploring the outskirts of a smaller town of god knows where, the local merchant notices your curiousity as you inspect his wares" + 
    "\nWith a discerning smile, he approaches and says 'Ah, I see you have an eye for the peculiar. It's this puzzle box i presume?'" + 
    "\nHe presents it to you, adding 'I've had this in my posession for as long as I can remember. It's secrets elude me.." + 
    "\nPerhaps a fresh perpective is what it needs. Take it, and if your crack it's mystery, consider it your reward.");
  
    }
}
