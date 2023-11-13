import java.util.Scanner;

public class TravelerEvent extends Events {
    public int eventLevel = 2;

    public TravelerEvent (Player p, Scanner s) {
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

public int getEventLevel() {
    return eventLevel;
}
    
}
