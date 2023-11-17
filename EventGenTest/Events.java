package EventGenTest;

import java.util.*;

public class Events {
    int eventLevel;
    Player player;
    Scanner scanner;

    public Events() { }

    public int getEventLevel() {
        return eventLevel;
    }

    public void execute(Player player, Scanner scanner) {
        // Override this method.
    }   
}
