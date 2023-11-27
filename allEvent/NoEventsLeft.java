

public class NoEventsLeft extends Event {

    NoEventsLeft() {
        super();
        this.eventLevel = 1;
    }
    
    @Override
        public void execute(Player player, InputHandler inputHandler) {
            
            battle.battle(player);

            if (!player.isAlive()) {return;}
            
        }
    

}
