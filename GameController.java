import java.util.Scanner;

public class GameController {
    Player player;
    // Scanner userInput = new Scanner(System.in);
    InputHandler input = new InputHandler();
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
    +"\nThere is only one way to cheat death and that is the usage of a fairy that you can only obtain from one event.";

    public GameController(Player player) {
        this.player = player;
    }

    public void eatApple() {
        if (player.getApple() > 0) {
            clearScreen();
            player.eatApple();
            System.out.println("You consume the apple and feel rejuvenated from it, any previous wounds you had have been fully restored.");
            System.out.println("\nPress ENTER to continue.");
            input.readInput(player);
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
            roomChoice = input.readInput(player);
            
        switch (roomChoice) {
            case "left":
            case "1":
                clearScreen();
                Event e = ec.generateEvent(player);
                e.execute(player, input);
                //event.generateRandomEvent(player);
                break;

            case "right":
            case "2":
                clearScreen();
                Battle battle = new Battle(player);
                battle.battle(player);
                break;

            case "eat apple":
            case "3":
                clearScreen();
                player.heal(player);
                break;

            case "/stats":
                clearScreen();
                player.displayPlayerStats();
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

            if (player.getLevel() == 10) //This player level was just an example.
            {
                //Battle battle = new Battle(player);
                System.out.println("{THE END}");
                System.exit(0);
            }

            if (!player.IsAlive(player.getCurrentHp()))
            {
                if (player.getFairy() > 0) 
                {
                    clearScreen();
                    System.out.println("You died! But the fairy that you hold realises this and restores you to maximum.");
                    player.addCurrenHp(10000);
                }
                else
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
    }
    
    public void gameOver() throws InterruptedException {
        clearScreen();
        System.out.println("You've died!");
        System.out.println("\nThis poor soul has perished, may darkness overtake them and drift away to the afterlife.");
        System.out.println("\nDo you want to retry? Press ENTER to exit to menu, type \"No\" to quit.");
        String playAgain = input.readInput(player);

        if (playAgain.equals("no") || playAgain.equals("n")) {
            clearScreen();
            System.out.println("|GAME OVER|");
            System.out.println("Game Shutting down...");
            System.exit(0);
        }
        clearScreen();
    }

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
