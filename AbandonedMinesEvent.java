import java.util.Scanner;

public class AbandonedMinesEvent extends Event {
    
    AbandonedMinesEvent() {
    super();
    this.eventLevel = 4;
}

@Override
public void execute(Player player, Scanner scanner) {

    System.out.println("While foraging through the forest a glint of sunlight reflecting from an unusual object catches your attention. " + 
    "Intrigued, you decide to investigate and\ndiscover an old, weathered compass half-buried in the ground. " + 
    "With a newfound sense of direction, you follow the needle and end up at an unexpected swamp.\n" +
    "You begin to trudge through the challenging terrain, mud grabbing at every step. " + 
    "The swamp has an eerie stillness over it and the heavy fog is limiting your vision.\n" + 
    "At the heart of the swamp a silhouette emerges from the mist, reavealing the entrance to an abandoned mine. " +
    "Glancing at the compass, you notice\nit spinning uncontrollably. " + 
    "The mystery has piqued your interest, you discard the compass and venture into the depths of the mine.");

}

}
