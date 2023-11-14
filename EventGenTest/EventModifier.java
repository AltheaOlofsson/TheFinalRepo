package EventGenTest;
import java.util.*;


public class EventModifier {
    Player p = new Player("jimmy");
    Scanner s = new Scanner(System.in);



Events root = new RootEvent(p,1);
Events trav = new TravelerEvent(p, s ,2);

Events[] eventEncounters = {root,trav};

public ArrayList<Events> createEventList(int lower, int upper) {
        ArrayList<Events> events = new ArrayList<>(); 
        for (Events e : eventEncounters) {
            if (e.getLevel() >= lower && e.getLevel() <= upper) {
                events.add(e);
            }
        }
        return events;
    }





    
}
