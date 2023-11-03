public class Occurence {


public void occurrencemall(Player p) {
    System.out.println(p.getAttack());
    p.addAttack(5);
    System.out.println(p.getAttack());
}

public void occurance1(Player p) {
    System.out.println("You trip and fall over a tree root. You lose 5 healthpoints.");
    p.decreaseCurrentHp(5);
    System.out.println("Current HP: " + "- 5");
    System.out.println("As you get up you realise the tree was a Golden Apple tree. You fill your pockets with fruit before you continue down the road.");
    System.out.println("What a lucky accident!");
    p.setApple(4);
    System.out.println("Apples: " + p.getApple());
}

// public void occurance2(Player p) {
//     System.out.println("You meet a traveler on the road. Do you stop and chat? (Y/N)");

//     //if(){
//     System.out.println("He offers to trade his dagger for a Golden Apple. Do you accept? (Y/N)");
//     //    if(input == y){
//         // if (p.getApples() != 0){
//             System.out.println("You gain a new dagger.");
//             p.addAttack(3);
//             p.addSpeed(2);
//             p.decreseApple(1);
//             System.out.println("Attack: + 3");
//             System.out.println("Speed: + 2");
//             System.out.println("You give up one Apple.");
//             System.out.println("Apple: - 1");
//       //  }else {} else{}}
//     }

    public void occurance3(Player p) {
        System.out.println("You come to an Inn by the road. You decide to take a rest.");
        System.out.println("The inn served a delicious hearty stew, you asked for seconds. Twice.");
        p.addCurrenHp(10);
        System.out.println("Current HP: + 10");
        System.out.println("When you set out again you realised you ate way too much. Your movements feel sluggish.");
        p.decreseSpeed(1);
        System.out.println("Speed: - 1");
    }





}

