

public class LulEvent extends Event {
       
        LulEvent() {
                super();
                this.eventLevel = 12;
}     
        @Override
        public void execute(Player player, InputHandler inputHandler) {
                System.out.println("Lul");
                }
        
        }
