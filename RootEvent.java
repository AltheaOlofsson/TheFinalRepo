import java.util.Scanner;

public class RootEvent extends Event {
       
        RootEvent() {
                super();
                this.eventLevel = 1;
}     
        @Override
        public void execute(Player player, Scanner scanner) {
                System.out.println("You trip over a tree root and land on your face.");
                player.decreaseCurrentHp(5);
                System.out.println("HP: - 5");
                System.out.println("As you get up you realise the tree was a Golden Apple tree. You fill your pockets with fruit before you continue down the road.");
                System.out.println("What a lucky accident!");
                player.setApple(4);
                System.out.println("Apples: " + player.getApple());
                player.addExperience(50);
                }
        
        }
