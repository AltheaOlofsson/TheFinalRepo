import java.util.Scanner;

public class GameController {
    Player player;

    Scanner userInput = new Scanner(System.in);
    int totalRooms = 8; // How many rooms or a.k.a event choice will happen.
    int currentRoom = 1;
    String roomChoice;
    EventController ec = new EventController();
    //RandomEventGenerator event = new RandomEventGenerator();

    String midInstructions = "You have the choices of going left or right, you also have the option to consume an apple in these sections."
    +"\nThese choices dictate whichever encounter you as the player chooses."
    +"\nFor instance; the right path is combat focused and will always lead to a monster of similar level to the player."
    +"\nWhilst the left path will lead to events/encounters that could benefit or harm you."
    
    +"\n\nYou have the following options and their meaning:"
    +"\n- [1]Left (Go the left path for encounters.)"
    +"\n- [2]Right (Go the right path for combat.)"
    +"\n- [3]Eat Apple (Regenerate your health, it will consume one of your apples.)"
    
    +"\n\nYou also have the follow unlisted commands"
    +"\n- /help (For instructions, Duh! You're already here.)"
    +"\n- /stats (To display your current stats and decide whether you also want to consume an apple if you're wounded)"
    +"\n- /exit (To quit the game)"
    
    +"\n\nYour goal is to reach a certain level, when you do you are granted to fight the final boss."
    +"\nBe careful now! For if you ever reach your health down to 0, you are dead and have to restart all the way from the beginning."
    +"\nThere are no continues.";

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

            if (player.getLevel() == 10)
            {
                Battle battle = new Battle(player);
                battle.dragonFight(null);
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
