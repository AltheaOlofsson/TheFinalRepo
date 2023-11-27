
public class ArenaEvent extends Event {
     ArenaEvent() {
                super();
                this.eventLevel = 12;
}     
        @Override
        public void execute(Player player, InputHandler inputHandler) {
                System.out.println("Arena Event");
                gainEXP(player);
                }
        
}
