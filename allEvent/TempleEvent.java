import java.util.*;

public class TempleEvent extends Event {
    
    TempleEvent() {
        super(); 
        this.eventLevel = 1;
    }


    @Override
    public void execute(Player player, InputHandler inputHandler) {

        System.out.println("You find yourself in a dimly lit, ancient temple filled with mysterious artifacts.\n" + 
        "You notice a glimmering object on an altar. What do you want to do?\n\n" + 
        "1. Approach the altar and inspect the object.\n" + 
        "2. Continue exploring the temple without touching anything.");

        String choice = input.readInput(player);

        if (choice == "1") {
            System.out.println("\nYou cautiously approach the altar and inspect the glimmering object.\n" + 
            "It's a cursed gemstone! The moment you touch it, a mysterious guardian spirit appears.\n" + 
            "The spirit reveals that the gemstone holds ancient power and offers you a choice:\n\n" +
            "1. Embrace the power and accept the consequences.\n" + 
            "2. Try to negotiate with the spirit or find another solution.");

            String secondChoice = input.readInput(player);

            if (secondChoice == "1") {
                System.out.println("\nYou decide to embrace the power of the gemstone, accepting the consequences.\n" + 
                "The guardian spirit warns you that the power comes at a great cost.\n" + 
                "As the power surges through you, your body can't handle it, and you collapse.\n" + 
                "Game Over. You deadge.");

                } else if (secondChoice == "2") {
                System.out.println("\nYou attempt to negotiate with the spirit or find another solution.\n" + 
                "The spirit, however, insists that the power of the gemstone cannot be tamed.\n" + 
                "As you hesitate, the spirit becomes agitated and unleashes a powerful force.\n" + 
                "Game Over. You deadge.");

                } else {
                System.out.println("\nInvalid choice. The guardian spirit becomes hostile, and you perish.\n" + 
                "Game Over. You deadge.");
            }

        } else if (choice == "2") {
            System.out.println("\nYou decide to continue exploring the temple without touching anything.\n" + 
            "As you walk through the corridor, you hear a faint whispering sound.\n" + 
            "What do you want to do?\n\n" + 
            "1. Investigate the source of the whispering.\n" + 
            "2. Ignore the whispering and proceed cautiously.");

            String secondChoice = input.readInput(player);

            if (secondChoice == "1") {
                System.out.println("\nYou follow the sound of the whispering and encounter a mysterious figure.\n" + 
                "The figure reveals itself as a helpful spirit, warning you of dangers.\n" + 
                "Grateful for your caution, the spirit guides you safely out of the temple.\n" + 
                "Congratulations! You survived!");

            } else if (secondChoice == "2") {
                System.out.println("\nYou decide to ignore the whispering and proceed cautiously.");

                int randomEvent = randomgen.nextInt(2);

                if (randomEvent == 0) {
                    System.out.println("\nThe mysterious entity influences the events in your favor!\n" + 
                    "You navigate the temple safely and find a hidden exit.\n" + 
                    "Congratulations! You survived!");
                } else if (randomEvent == 1) {
                    System.out.println("\nThe mysterious entity influences the events against you!\n" + 
                    "A trap is triggered, and you fall into a pit.\n" + 
                    "Game Over. You deadge.");
                } else {
                    System.out.println("\nInvalid choice. The temple's ancient magic reacts, leading to your demise.\n" + 
                    "Game over. You deadge.");
                }

            } else {
                System.out.println("\nInvalid choice. The temple's ancient magic reacts, leading to your demise.\n" + 
                "Game Over. You have deadge.");
                }

        } else {
            System.out.println("\nInvalid choice. The temple's ancient magic reacts, leading to your demise.\n" + 
            "Game Over. You deadge.");
            }
    }

}






