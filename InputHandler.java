import java.util.Scanner;

public class InputHandler {
    Scanner scanner;

    public InputHandler() {
        this.scanner = new Scanner(System.in);
    }

    public String readInput(Player player) {
        // System.out.print("Enter command: ");
        String input = scanner.nextLine();

        if ("/exit".equals(input.toLowerCase())) {
            System.out.println("Exiting the program.");
            System.exit(0);
        }
        else if ("/stats".equals(input.toLowerCase())) {
            displayPlayerStats(player);
            System.out.println("Press ENTER to continue.");
            scanner.nextLine();
        }

        return input.toLowerCase();
    }
    private void displayPlayerStats(Player player) {
        player.displayPlayerStats();
    }
    // public void close(){
    //     scanner.close();
    // }



}