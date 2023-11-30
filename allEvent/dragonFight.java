public class dragonFight extends Event {

    dragonFight(){
        super();
        this.eventLevel = 20;
    }

    public void execute(Player player, InputHandler inputHandler){
        GameController gameController = new GameController(player);

        try {gameController.endStory(input);}
        catch (InterruptedException e) {/* IGNORE */}
        Battle b = new Battle(player);
                b.dragonFight(new Dragon("Silamgar"), player);
                System.out.println("{THE END} \nPress ENTER to exit.");
                input.readInput(player);

    }
    
}
