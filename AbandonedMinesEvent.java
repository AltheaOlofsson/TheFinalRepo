import java.util.Scanner;

public class AbandonedMinesEvent extends Event {
    
    AbandonedMinesEvent() {
    super();
    this.eventLevel = 4;
}

@Override
public void execute(Player player, Scanner scanner) {

    System.out.println("While foraging through the forest a glint of sunlight reflecting from an unusual object catches your attention. " + 
    "\nIntrigued, you decide to investigate anddiscover an old, weathered compass half-buried in the ground. " + 
    "\nWith a newfound sense of direction, you follow the needle and end up at an unexpected swamp." +
    "\nYou begin to trudge through the challenging terrain, mud grabbing at every step. " + 
    "\nThe swamp has an eerie stillness over it and the heavy fog is limiting your vision." + 
    "\nAt the heart of the swamp a silhouette emerges from the mist, reavealing the entrance to an abandoned mine. " + 
    "\nGlancing at the compass, you notice it spinning uncontrollably. " + 
    "\nThe mystery has piqued your interest, you discard the compass and venture into the depths of the mine.");

    

}

}
