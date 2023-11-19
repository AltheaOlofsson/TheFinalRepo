import java.util.*;
import java.util.stream.Collectors;


    public class EventController {
        static Random randomgen = new Random();

        public Event[] eventEncounters = {new RootEvent(), new TravelerEvent(), new WishingStarEvent(), new FairyEvent(), new LulEvent(), new AbandonedMinesEvent()};

        ArrayList<Event> eventList = new ArrayList<>(Arrays.asList(eventEncounters)); 

        public Event generateEvent(Player player) {
            List<Event> filteredEventList = eventList.stream()
            .filter(e -> (e.eventLevel <= player.getLevel()))
            .collect(Collectors.toList());
            
            Event selectedEvent = filteredEventList.get(randomgen.nextInt(filteredEventList.size()));
            eventList.remove(selectedEvent);
            return selectedEvent;
        }
    
    
    
    
    
        
    }
    

