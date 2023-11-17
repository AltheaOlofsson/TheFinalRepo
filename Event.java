import java.util.*;

public class Event {
    int eventLevel;
    Player player;
    Scanner scanner;
    Random randomgen;

    public Event() { }

    public int getEventLevel() {
        return eventLevel;
    }

    public void execute(Player player, Scanner scanner) {
        // Override this method.
    }   
}