import java.util.*;
import java.util.stream.Collectors;


    public class EventController {

        Random randomgen = new Random();

        public Event[] eventEncounters = {new RootEvent(), new TravelerEvent(), new WishingStarEvent(), new FairyEvent(), new LulEvent(), new AbandonedMinesEvent(), new TavernEvent(), new RandomChestEvent(), new puzzleBoxEvent(),new PotionEvent(),new ArenaEvent()};

        ArrayList<Event> eventList = new ArrayList<>(Arrays.asList(eventEncounters)); 

        public Event generateEvent(Player player) {
            List<Event> filteredEventList = eventList.stream()
            .filter(e -> (e.eventLevel <= player.getLevel()))
            .collect(Collectors.toList());

            Event selectedEvent = filteredEventList.get(randomgen.nextInt(filteredEventList.size()));
            eventList.remove(selectedEvent);

            return selectedEvent;
        }
        
        Event Level5 = new HardlyCodedEvent();

        public Event Level5(Player player){
            Event Level5 = new HardlyCodedEvent();
            return Level5;

        }
    
    
    
    
    
        
    }


    // Level 1: WishingStarEvent, TavernEvent
    // Level 2: TravelerEvent, RandomChestEvent, puzzleBoxEvent
    // Level 3: RootEvent, FairyEvent, ()
    // Level 4: AbandonedMinesEvent, (), ()
    // Level 5: (PotionsEvent), ()
    // Level 6: (ArenaEvent)
    // Level 7: ()
    // Level 8: 
    // Level 9: 
    // Level 12: LulEvent