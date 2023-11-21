import java.util.*;

public class Event {

    int eventLevel;
    Player player;
    Scanner scanner;

    public Battle battle = new Battle(player);
    
    static Random randomgen = new Random();

    public Event() { }

    public int getEventLevel() {
        return eventLevel;
    }

    public void execute(Player player, Scanner scanner) {
        // Override this method.
    }   

    public void gainEXP(Player player){
        System.out.println("You gained experience. \n Experience: + 50");
        player.addExperience(50);
    }

    protected void pressEnterToContinue() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPress ENTER to continue");
        scanner.nextLine();
    }

}