package EventGenTest;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Player p = new Player("Name");
        Scanner s = new Scanner(System.in);

        Events e = EventModifier.generateEvent(p);
    }
}
