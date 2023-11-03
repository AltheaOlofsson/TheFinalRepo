public class Occurence {


public void occurrencemall(Player p) {
    System.out.println(p.getAttack());
    p.addAttack(5);
    System.out.println(p.getAttack());
}

public void occurance1(Player p) {
    System.out.println("You trip and fall over a tree root. You lose 5 healthpoints.");
    p.decreaseCurrentHp(5);
    System.out.println("As you get up you spot a golden apple tree in a meadow off the road. You fill your pockets with fruit.");
    p.setApple(4);
}


}