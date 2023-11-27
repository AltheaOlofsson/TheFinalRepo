
public class RootEvent extends Event {
       
        RootEvent() {
                super();
                this.eventLevel = 4;
}     
        @Override
        public void execute(Player player, InputHandler inputHandler) {
                System.out.println("You trip over a tree root and land on your face.");
                System.out.println("HP: - 5");
                player.decreaseCurrentHp(5);
                System.out.println("As you get up you realise the tree was a Golden Apple tree. You fill your pockets with fruit before you continue down the road.");
                System.out.println("What a lucky accident!");
                player.setApple(4);
                System.out.println("Apples: " + player.getApple());
                System.out.println();
                gainEXP(player);
                }
        
        }