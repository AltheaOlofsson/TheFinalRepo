import java.util.Scanner;

public class InputHandler {
    Scanner scanner;

    public InputHandler() {
        this.scanner = new Scanner(System.in);
    }

    public String readInput(Player player) {
        GameController gc = new GameController(player);

        String input = scanner.nextLine();

        if ("/exit".equals(input.toLowerCase())) {
            System.out.println("Exiting the program.");
            System.exit(0);

        } else if ("/stats".equals(input.toLowerCase())) {
            displayPlayerStats(player);
            System.out.println("Press ENTER to close.");
            scanner.nextLine();

        } else if ("/help".equals(input.toLowerCase())) {
            gc.clearScreen();
            System.out.println("\n" + gc.midInstructions + "\n");
            System.out.println("Press ENTER to close.");
            scanner.nextLine();
        }
        

        return input.toLowerCase();
    }

    private void displayPlayerStats(Player player) {
        player.displayPlayerStats();
    }

}