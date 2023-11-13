import java.util.*;

public class Events {
     public int eventLevel;
    // public int getEventLevel() {
    //     return eventLevel;
    // }


    // public static void main(String[] args) {
    Player player = new Player("Jim");
    Scanner s = new Scanner(System.in);
        
    
    
   

// Map<Integer,Events> eventMap = new HashMap();

// eventMap.put(1, new RootEvent(player));





        Events root = new RootEvent(player);
        Events trav = new TravelerEvent(player, s);

        Events[] Event = {root,trav};

        public ArrayList<Events> createEventList(int lower, int upper) {
        ArrayList<Events> EventsList = new ArrayList<Events>(); 
        for (Events e : Event) {
            if (e.getEventLevel() >= lower && e.getEventLevel() <= upper) {
                EventsList.add(e);
            }
        }
        return EventsList;
    }


   
}
