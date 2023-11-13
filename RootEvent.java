public class RootEvent extends Events {


public RootEvent (Player p, int eventLevel) {

        System.out.println("You trip over a tree root and land on your face.");
        p.decreaseCurrentHp(5);
        System.out.println("HP: - 5");
        System.out.println("As you get up you realise the tree was a Golden Apple tree. You fill your pockets with fruit before you continue down the road.");
        System.out.println("What a lucky accident!");
        p.setApple(4);
        System.out.println("Apples: " + p.getApple());
        }

@Override
public int getEventLevel() {
        return eventLevel;

}

 
    
}
