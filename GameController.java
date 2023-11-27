import java.util.Random;

public class GameController {
    Player player;
    Random random = new Random();
    InputHandler input = new InputHandler();
    String roomChoice;
    EventController eventControl = new EventController();

    public String midInstructions = "You have the choices of going left or right, you also have the option to consume an apple in these sections."
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
    +"\n      HP : How much health the player/monster has."
    +"\n      Attack : How much minimum damage the player and the monster can output, the maximum output is randomized."
    +"\n      Speed : How dexterous the player/monster is, this determines who fights first."
    +"\n      Level : What level the player is and determines their overall prowess."
    +"\n      Experience : The amount of exp the player has accumelated, if the player reaches."
    +"\n- /exit (To quit the game)"
    
    +"\n\nYour goal is to reach a certain level, when you do you are granted to fight the final boss."
    +"\nBe careful now! For if you ever reach your health down to 0, you are dead and have to restart all the way from the beginning."
    +"\nThere is only one way to cheat death and that is the usage of a fairy that you can only obtain from one event.";

    public GameController(Player player) {
        this.player = player;
    }

    
    public void selectPath() {
        clearScreen();
        while (player.isAlive()) {

            System.out.println("\nWhich path do you want to take?\n[1]Left?\n[2]Right? \n[3]Eat a Golden Apple (" + player.getApple() + "/4)");
            roomChoice = input.readInput(player);
            
        switch (roomChoice) {
            case "left":
            case "1":

                // crossroads();
                clearScreen();                       // For testing. Remove before release.
                Event e = eventControl.generateEvent(player);
                e.execute(player, input);
                break;

            case "right":
            case "2":

                crossroads();
                // clearScreen();                       // For testing. Remove before release.
                // Battle battle = new Battle(player);
                // battle.battle(player);
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

            if (player.getLevel() == 5) {
                clearScreen();
                pressEnterToContinue(player);
                Event e = eventControl.Level5(player);
                e.execute(player, input);
            }

            if (player.getLevel() >= 10) { //This player level was just an example.
            
                player.setFairy(0);
                clearScreen();
                try {endStory();}
                catch (InterruptedException e) {/* IGNORE */}
                Battle b = new Battle(player);
                b.dragonFight(new Dragon("TestDragon"), player);
                System.out.println("{THE END} \nPress ENTER to exit.");
                input.readInput(player);
                System.exit(0);
            }

            if (!player.isAlive()) {
                if (player.getFairy() > 0) 
                {
                    clearScreen();
                    System.out.println("You died! But the fairy's blessing takes effect and restores you to maximum.");
                    player.setCurrentHp(player.maxHp);
                    player.setFairy(0);
                } else {
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
    
    public void crossroads(){
        int randompath = random.nextInt(3);
        if(randompath == 1){
                clearScreen();
                Event e = eventControl.generateEvent(player);
                e.execute(player, input);
        } else {
                clearScreen();
                Battle battle = new Battle(player);
                battle.battle(player);
        } 
    }
    
    public void gameOver() throws InterruptedException {
        // clearScreen();  this messed up some events. i think we can do without it.
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
    

    public void theEnd() throws InterruptedException {
        clearScreen();
        System.out.println("You've Reached the end!");
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

    public void endStory() throws InterruptedException {
        System.out.print("As you keep pacing towards the ruined catacombs... ");
        System.out.print("you start to feel immense dread as you get closer and closer.");
        System.out.print("\nThe despair you're feeling grows intensely, your legs shakes in fear.");
        System.out.println("\nPress Enter to Continue");
        userInput.nextLine();
        System.out.println("As you approach the last room of the catacombs, the remains of an ancient altar.");
        System.out.print("You hear the foreboding bellows from the monster.");
        System.out.print(" The horror of it is immense, you stand hopeless.");
        System.out.println("\nPress Enter to Continue");
        userInput.nextLine();
        System.out.println("You make a feeble attempt to regain control of yourself.");
        System.out.print("Drawing your weapon and readying yourself for the beasts incoming attack.\n");
        Thread.sleep(1500);
        System.out.print(".");
        Thread.sleep(1500);
        System.out.print(".");
    }

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    protected void pressEnterToContinue(Player player) {

        InputHandler input = new InputHandler();

        System.out.println("\nPress ENTER to continue");
        input.readInput(player);
    
    }
}
