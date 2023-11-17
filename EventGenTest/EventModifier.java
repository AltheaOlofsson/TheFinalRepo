package EventGenTest;
import java.util.*;


public class EventModifier {
    static Random randomgen = new Random();

    static ArrayList<Events> createEventList(int lower, int upper) {
        Events[] eventEncounters = {new RootEvent(), new TravelerEvent()};
        
        ArrayList<Events> events = new ArrayList<>(); 
        for (Events e : eventEncounters) {
            if (e.getEventLevel() >= lower && e.getEventLevel() <= upper) {
                events.add(e);
            }
        }
        return events;
    }

    static public Events generateEvent(Player player) {

        List<Events> eventList = EventModifier.createEventList(1, player.getLevel());
        return eventList.get(randomgen.nextInt(eventList.size()));
    }





    
}
