import java.util.Scanner;

public class GameController {
    Player player;

    Scanner userInput = new Scanner(System.in);
    int totalRooms = 5; // How many rooms or a.k.a event choice will happen.
    int currentRoom = 1;
    String roomChoice;
    EventController ec = new EventController();
    //RandomEventGenerator event = new RandomEventGenerator();

    String midInstructions = "You have the choices of going left";

    public GameController(Player player) {
        this.player = player;
    }

    public void advanceRoom() {
        currentRoom++;
    }

    public void eatApple() {
        if (player.getApple() > 0) {
            clearScreen();
            player.eatApple();
            System.out.println("You consume the apple and feel rejuvenated from it, any previous wounds you had have been fully restored.");
            System.out.println("\nPress ENTER to continue.");
            userInput.nextLine();
            clearScreen();
        }
        else {
            clearScreen();
            System.out.println("You're out of apples!");
        }
    }


    public void selectPath() 
    {
        clearScreen();
        while (player.IsAlive(player.currentHp)) 
        {
            System.out.println("\nWhich path do you want to take?\n[1]Left?\n[2]Right? This path is blocked by a monster but you cant tell what exactly. \n[3]Eat a Holy Golden Apple (" + player.getApple() + "/4)");
            roomChoice = userInput.nextLine().toLowerCase();
            
        switch (roomChoice) {
            case "left":
            case "1":
                clearScreen();
                Event e = ec.generateEvent(player);
                e.execute(player, userInput);
                //event.generateRandomEvent(player);
                advanceRoom();
                break;

            case "right":
            case "2":
                clearScreen();
                Battle battle = new Battle(player);
                battle.battle(player);
                advanceRoom();
                break;

            case "eat apple":
            case "3":
                clearScreen();
                eatApple();
                break;

            case "/stats":
                clearScreen();
                player.displayPlayerStats(userInput);
                break;
                
            case "/help":
                clearScreen();
                System.out.println(midInstructions);
                break;

            case "/exit":
                clearScreen();
                System.out.println("Game Shutting down...");
                System.exit(0);
                break;

            default:
                clearScreen();
                System.out.println("Incorrect Input! Please try again. /stats to check your stats, /help for instructions, /exit to quit.");
                break;
            }
            if (!player.IsAlive(player.getCurrentHp()))
            {
                try
                {
                    gameOver();
                }
                catch (InterruptedException e) {/* IGNORE */}
                return;
            }
        }
    }
    
    public void gameOver() throws InterruptedException {
        AdventureGame.clearScreen();
        System.out.println("You've died!");
        System.out.println("\nThis poor soul has perished, may darkness overtake them and drift away to the afterlife.");
        System.out.println("\nDo you want to retry? Press ENTER to exit to menu, type \"No\" to quit.");
        String playAgain = userInput.nextLine().toLowerCase();

        if (playAgain.equals("no") || playAgain.equals("n")) {
            AdventureGame.clearScreen();
            System.out.println("|GAME OVER|");
            System.out.println("Game Shutting down...");
            System.exit(0);
        }
        AdventureGame.clearScreen();
    }

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
