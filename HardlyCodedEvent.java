import java.util.Scanner;
import java.util.Random;

public class HardlyCodedEvent extends Event {
       Player player;
       Scanner scanner;
       private Random random;
        HardlyCodedEvent() {
                super();
                this.eventLevel = 20;
        }     
        @Override
        public void execute(Player player, Scanner scanner) throws InterruptedException{
                System.out.println("At eavening you walk along the path and come across an old man with a cart laden with sacks and boxes. \nThe carts axle is broken and the man looks feeble and distraught.");
                Thread.sleep(17000);
                System.out.println("He sees you and his face brightens.");
                Thread.sleep(3000);
                System.out.println("- Hoy there young adventurer! Would you mind helping an old man? \nI have a new axle for the cart but my feeble arms and back \nprevents me from lifting the cart to install it.");
                Thread.sleep(18000);
                System.out.println("I'll reward you with whatever my hand first touches when I reach inside my cart.");
                System.out.println("What do you want to do?? \n[1] Help the poor man. \n[2] Rob him blind. \n[3] Leave him on the road. You have important buisness to atend.");
                Scanner chooseToHelp = new Scanner(System.in);
                String giveHelpingHand = chooseToHelp.nextLine();
                if (giveHelpingHand.equals("1")) {
                        AdventureGame.clearScreen();
                        System.out.println("You decide to help him out and together you work to fix the cart.");
                        Thread.sleep(5000);
                        System.out.println("It takes a fair bit of time and effort, but you get the work done.");
                        Thread.sleep(5000);
                        System.out.println("The man looks at you and smiles. - Thank you young man. I thought I'ld be stuck here all night.");
                        Thread.sleep(8000);
                        System.out.println("Well a promise is a promise. He sticks his hand into the pile of sacks.");
                        Thread.sleep(7000);

                        Random random = new Random();
                        int randomLoot = random.nextInt(100) + 1;
                        if (randomLoot == 100) {
                                System.out.println("He pulls out a beautiful sword and his smile immediately disappears");
                                Thread.sleep(5000);
                                System.out.println("- Just my luck. First my cart breaks and now I have to give away a legendary sword.");
                                Thread.sleep(7000);
                                System.out.println("But by my honour I'll stand by my word");
                                Thread.sleep(3000);
                                System.out.println("You've gain the legendary sword Excalibre");
                                player.hasExcalibre = 1;
                                player.addAttack(100);
                                player.addSpeed(100);
                                player.addMaxHp(300);
                                player.addCurrenHp(300);
                        } else if (randomLoot < 99 && randomLoot > 90) {
                                System.out.println("He pulls out a sleek, curvy shortsword and hands it to you.");
                                Thread.sleep(5000);
                                System.out.println("- Now thats a blade of marvels. It glows blue if there are orcs around.");
                                Thread.sleep(7000);
                                System.out.println("You have gained Stung");
                                player.addAttack(20);
                                player.addSpeed(20);
                        } else if (randomLoot < 89 && randomLoot > 70) {
                                System.out.println(" en rustning av något slag");
                                player.addMaxHp(20);
                                player.addSpeed(15);
                        } else if (randomLoot < 69 && randomLoot > 50) {
                                System.out.println(" ett gyllene äpple?");
                        } else if (randomLoot < 49 && randomLoot > 30) {
                                System.out.println(" cursed dagger");
                                player.addAttack(15);
                                player.decreaseMaxHp(10);
                        }  else if (randomLoot < 29 && randomLoot > 10) {
                                System.out.println("");
                        }
                } else if (giveHelpingHand.equals("2")) {
                        AdventureGame.clearScreen();
                        System.out.println("You pull out your weapon");
                } else if (giveHelpingHand.equals("3")) {
                        AdventureGame.clearScreen();
                        System.out.println(" ");
                } else {
                        System.out.println("Incorrect input. Please choose: 1, 2 or 3");
                }


                

                chooseToHelp.close();
        }
        
}
