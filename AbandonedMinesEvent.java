import java.util.Scanner;

public class AbandonedMinesEvent extends Event {
    
    AbandonedMinesEvent() {
    super();
    this.eventLevel = 4;
}

@Override
public void execute(Player player, Scanner scanner) {

    System.out.println("While foraging through the forest a glint of sunlight reflecting from an unusual object catches your attention. " + 
    "\nIntrigued, you decide to investigate and discover an old, weathered compass half-buried in the ground. " + 
    "\nWith a newfound sense of direction, you follow the needle and end up at the edge of a swamp." +
    "\nYou begin to trudge through the challenging terrain, mud grabbing at every step. " + 
    "\nThe swamp has an eerie stillness over it and the heavy fog is limiting your vision." + 
    "\nAt the heart of the swamp a silhouette emerges from the mist, reavealing the entrance to an abandoned mine. " + 
    "\nGlancing at the compass, you notice it spinning uncontrollably. " + 
    "\nThe mystery has piqued your interest, you put away the compass and venture into the depths of the mine." + 
    "\n\nPress ENTER to continue");
    scanner.nextLine();

    System.out.println("You slowly pace yourself down the narrow tunnel with your every footstep reverberating off the worn stone walls." + 
    "\nDim light from the entrance soon reveals a room filled with old mining equipment and abandoned tools. As you step into the room" + 
    "\nyou can feel the ground start shaking, collapsing stones and rocks seals of the entrance behind you!");

    System.out.println("\nYou take a minute to catch your breath and assess the situation." + 
    "\n\nPress ENTER to continue");
    scanner.nextLine();

    System.out.println("You light a torch and take a look around. You notice a dusty mining cart and a lever on the wall in the corner of the room.");

    boolean isLeverPulled = false;

    while (!isLeverPulled) {

        System.out.println("\nWhat do you want to do?" + 
        "\n1. Examine the mining cart." + 
        "\n2. Pull the lever." + 
        "\n3. Search for another way out.");

        int choice = scanner.nextInt();

        switch (choice) {

            case 1:
                System.out.println("\nYou examine the mining cart and find a pair of heavy duty gloves and a sharp mining pick." + 
                "\nHP: + 10" + 
                "\nAttack: + 3");
                player.addCurrenHp(10);
                player.addMaxHp(10);
                player.addAttack(3);
                break;

            case 2:
                System.out.println("\nYou pull the lever but it's stuck. You're not one to be outsmarted by a lever so you summon the strength of an ox!" +
                "\n'HHNNNNNNNGG-' and the lever suddenly gives, you faceplant the ground and lose 3 HP. Ouch.");
                player.decreaseCurrentHp(3);
                System.out.println("\nThe collapsed entrance starts to shift as a result and a narrow passage opens. You proceed cautiously down the passage.");
                isLeverPulled = true;
                break;
            
            case 3:
                System.out.println("\nYou search for another exit but find nothing. " + 
                "It seems the mining cart or lever might be significant..");
                break;

                default:
                    System.out.println("Invalid choice, please try again");
        }
    }
    
    scanner.nextLine();
    System.out.println("\nPress ENTER to continue");
    scanner.nextLine();

    System.out.println("You follow the newly opened passage and reach a chamber partially flooded with stagnant water." + 
    "\nThere's a decaying wooden bridge spanning before you.");

    boolean bridgeCrossed = false;

    while (!bridgeCrossed)  {

        System.out.println("\nWhat do you want to do?" + 
        "\n1. Cross the bridge." + 
        "\n2. Look for another route around the water." + 
        "\n3. Assess the water for any potential hazards.");

        int choice = scanner.nextInt();

        switch(choice) {

            case 1:
                System.out.println("\nYou cautiously step onto the bridge and begin to waddle across." + 
                "\nHalfway over the bridge you hear something snap and in a heartbeat you decide to make a leap of faith."); 
                    // Randomize outcome: Leap successfull or fall abit short and struggle to pull yourself to safety and losing hp
                bridgeCrossed = true;
                break;
            
            case 2:
                System.out.println("\nYou search for another route and uncover a steel door." + 
                "\nYou examine the steel door but find no way to open it. No keyhole, no door handle, nothing..");
                break;

            case 3:
                System.out.println("\nYou carefully examine the water and notice a hidden current." + 
                "\nCrossing the bridge might be risky due to unseen dangers.");
                break;
        }
    }

    scanner.nextLine();
    System.out.println("\nPress ENTER to continue");
    scanner.nextLine();

    System.out.println("BOSS?! LOOT?!");

}
}




