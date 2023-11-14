import java.util.Scanner;
public class Occurence {


public void occurrencemall(Player p) {
    System.out.println(p.getAttack());
    p.addAttack(5);
    System.out.println(p.getAttack());
}

public class RootEvent extends Events { }
public class TravelerEvent extends Occurence { }

public void occurance1(Player p) {
    System.out.println("You trip over a tree root and land on your face.");
    p.decreaseCurrentHp(5);
    System.out.println("HP: - 5");
    System.out.println("As you get up you realise the tree was a Golden Apple tree. You fill your pockets with fruit before you continue down the road.");
    System.out.println("What a lucky accident!");
    p.setApple(4);
    System.out.println("Apples: " + p.getApple());
}

public void occurance2(Player p, Scanner s) {
    System.out.println("You meet a traveler on the road. Do you stop and chat? (Y/N)");
    String choice = s.nextLine();

    if(choice.equalsIgnoreCase("y")){
    System.out.println("As you converse he tells you of his quest for a Golden Apple. You remember seeing some apples in your bag earlier and says as much.");
    System.out.println("His face lights up and he offers to trade his dagger for a Golden Apple.");
    System.out.println("Do you accept? (Y/N)");
        String secondChoice = s.nextLine();

        if(secondChoice.equalsIgnoreCase("y")) {
                
            if (p.getApple() != 0){
                    System.out.println("The traveler becomes delighted and hands you the dagger.");
                    p.addAttack(3);
                    p.addSpeed(2);
                    p.decreseApple(1);
                    System.out.println("Attack: + 3\nSpeed: + 2\n\nYou give up one Apple.\nApple: - 1\n");
                    System.out.println("The traveler seems so happy about his new apple that you start to wonder if you might have gotten the short straw.");
                    System.out.println("Oh well, at least someone got the winning hand.");
            }   else {
                        System.out.println("You look through your bag but it seems you don't have any apples to trade. The traveler sighs disappointedly and continues his hunt for a Golden apple.");
                } 

        } else if(secondChoice.equalsIgnoreCase("n"))   {
            System.out.println("You want to keep your apples and politely decline.");
            System.out.println("The travaler looks disappointed before rummaging through his backpack but finds nothing.");
            System.out.println("He looks at you desperately before frantically stripping himself of his cloak and offers it to you.");
            System.out.println("'If I give you this aswell, would you please reconsider?' he pleads desperately.");
            System.out.println("Do you accept? (Y/N)");
                String thirdChoice = s.nextLine();

                if(thirdChoice.equalsIgnoreCase("y")) {
                    
                    if ( p.getApple() != 0){
                    System.out.println("You take pity on him and accept. You could always use a new cloak anyway.");
                    System.out.println("You hand over the apple as he throws the dagger and cloak into your hands.");
                    p.addMaxHp(10);
                    p.addCurrenHp(10);
                    p.addSpeed(3);
                    p.addAttack(3);
                    p.decreseApple(1);
                    System.out.println("\nMax HP: + 10 \nAttack: + 3 \nSpeed: + 2\n\nApple: - 1\n");
                    System.out.println("The traveler thanks you profously and rushes down the road with his precious apple.");
                    System.out.println("You feel pretty good about the trade even though you lost an apple. You continue down the road.");
                    System.out.println();
                    }  else  {
                        System.out.println("You look through your bag but it seams you don't have any apples to trade. The traveler sighs disappointedly and continues his hunt for a Golden apple.");
                        }
                        
                } else {    
                System.out.println("You still dont want to trade your apples. The traveler stalks off in anger.");
                System.out.println("You shrug and continue on your way.");
                }
                
        }  else {    
                System.out.println("You still dont want to trade your apples. The traveler stalks off in anger.");
                System.out.println("You shrug and continue on your way.");
                }             
    } else {
        System.out.println("You ingore the travaler and continue down the road.");
        System.out.println("Nothing happens.");
        }
}

public void occurance3(Player p) {
    System.out.println("You come to an Inn by the road. You decide to take a rest.");
    System.out.println("The inn served a delicious hearty stew, you asked for seconds. Twice.");
    System.out.println("Current HP: + 10");
    p.addCurrenHp(10);
    System.out.println("When you set out again you realised you ate way too much. Your movements feel sluggish.");
    p.decreseSpeed(1);
    System.out.println("Speed: - 1");
    }

public void occurance4(Player p, Scanner s){
    System.out.println("You hear a singing voice coming from deep within the forest. Do you check it out?");
    String check = s.nextLine();
    if (check.equalsIgnoreCase("y")){
        System.out.println("You follow the beautiful voice until the dark trees give way to a silver pool.");
        System.out.println("Above the glittering water you see a beautiful lady dancing in the air. You get the feeling that you should not be here. Leave?");
        String leave = s.nextLine();
            if(leave.equalsIgnoreCase("y")){
                System.out.println("As you move to step away you step on a twig. The snap results in a deafening silence.");
            }
    } else {
        System.out.println("You continue down the road, the beautiful singing haunting you for a long time.");

    }

}

public void occurance5(Player p, Scanner s) {

    System.out.println("When you are about to tuck in for the night you witness a meteor shower and have the opportunity to wish upon a falling star");
    System.out.println("Do you make a wish? (y/n)");
    String choice = s.nextLine();
        if(choice.equalsIgnoreCase("y")) {
            System.out.println("You decide to wish for:\n\nGreat health (1)\nFenomenal strenght (2)\nExceptional speed (3)\n");
            String wish = s.nextLine();
                if(wish.equals("1")) {
                   p.addMaxHp(20);
                   System.out.println("You has good health my friend");
                } else if (wish.equals("2")) {
                  p.addAttack(10);
                   System.out.println("You can feel the power surging inside!");
                } else if (wish.equals("3")) {
                  p.addSpeed(20);
                   System.out.println();
                }

        } else {
            System.out.println("You decide to just admire the beautiful natural occurance of possible impending doom " +
            "and suddenly can't seem to get the 'impending doom'-part out of your mind.\nYou have trouble falling asleep.\nHP: - 5");
            p.decreaseCurrentHp(5);
            System.out.println("You wake up at dawn of the next day and feel like shit. Despite that you know you have to " + 
            "continue your journey.");
}           }
    
}