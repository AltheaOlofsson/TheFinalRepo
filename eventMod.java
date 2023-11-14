import java.util.ArrayList;
import java.util.Scanner;

public class eventMod {
    Player player = new Player("Jim");
    Scanner s = new Scanner(System.in);


        Events root = new RootEvent(player,1);
        // Events trav = new TravelerEvent(player, s ,8);

        // Events[] Event = {root,trav};



// EventList[].add(new RootEvent(player));





        public ArrayList<Events> createEventList(int lower, int upper) {

        // Events root = new RootEvent(player,1);
        // Events trav = new TravelerEvent(player, s ,8);

        Events[] Event = {root};

        // EventsList.clear();

        ArrayList<Events> EventsList = new ArrayList<Events>(); 
        for (Events e : Event) {
            if (e.getEventLevel() >= lower && e.getEventLevel() <= upper) {
                // System.out.println(e.getEventLevel());
                EventsList.add(e);
                //  System.out.println(EventsList);
            }
        }
        return EventsList;



    }
    
}
