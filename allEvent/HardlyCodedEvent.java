
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
        public void execute(Player player, InputHandler InputHandler) {
                Scanner userInput = new Scanner(System.in);
                System.out.println("Press ENTER to continue");
                System.out.println("At eavening you walk along the path and come across an old man with a cart laden with sacks and boxes. \nThe carts axle is broken and the man looks feeble and distraught.");
                userInput.nextLine();
                System.out.println("He sees you and his face brightens.");
                userInput.nextLine();
                System.out.println("- Hoy there young adventurer! Would you mind helping an old man? \nI have a new axle for the cart but my feeble arms and back \nprevents me from lifting the cart to install it.");
                userInput.nextLine();
                System.out.println("I'll reward you with whatever my hand first touches when I reach inside my cart.");
                System.out.println("What do you want to do?? \n[1] Help the poor man. \n[2] Rob him blind. \n[3] Leave him on the road. You have important buisness to atend.");
                Scanner chooseToHelp = new Scanner(System.in);
                String giveHelpingHand = chooseToHelp.nextLine();
                if (giveHelpingHand.equals("1")) {
                        AdventureGame.clearScreen();
                        System.out.println("Press ENTER to continue");
                        System.out.println("You decide to help him out and together you work to fix the cart.");
                        userInput.nextLine();
                        System.out.println("It takes a fair bit of time and effort, but you get the work done.");
                        userInput.nextLine();
                        System.out.println("The man looks at you and smiles. - Thank you young man. I thought I'ld be stuck here all night.");
                        userInput.nextLine();
                        System.out.println("Well a promise is a promise. He sticks his hand into the pile of sacks.");
                        userInput.nextLine();

                        Random random = new Random();
                        int randomLoot = random.nextInt(100) + 1;
                        if (randomLoot == 100) {
                                System.out.println("He pulls out a beautiful sword and his smile immediately disappears");
                                userInput.nextLine();
                                System.out.println("- Just my luck. First my cart breaks and now I have to give away a legendary sword.");
                                userInput.nextLine();
                                System.out.println("But by my honour I'll stand by my word");
                                userInput.nextLine();
                                System.out.println("You've gained: Legendary sword Excalibre");
                                player.excalibre = 1;
                                player.addAttack(100);
                                player.addSpeed(100);
                                player.addMaxHp(300);
                                player.addCurrentHp(300);
                        } else if (randomLoot <= 99 && randomLoot > 90) {
                                System.out.println("He pulls out a sleek, curvy shortsword and hands it to you.");
                                userInput.nextLine();
                                System.out.println("- Now thats a blade of marvels. It glows blue if there are orcs around.");
                                userInput.nextLine();
                                System.out.println("You've gained: Stung");
                                player.addAttack(20);
                                player.addSpeed(20);
                        } else if (randomLoot <= 89 && randomLoot > 70) {
                                System.out.println("He pulls out a breastplate of peculiar shape. It looks almost like the gaunt chest of a burnt demon.");
                                userInput.nextLine();
                                System.out.println("- Ah. This is a very effective armor, created by fusing ebony with the liver of a Deedra.");
                                userInput.nextLine();
                                System.out.println("You've gained: Deedric armor.");
                                player.addMaxHp(20);
                                player.addSpeed(15);
                        } else if (randomLoot <= 69 && randomLoot > 50) {
                                System.out.println("He pulls out a branch that holds two golden apples and hands it to you.");
                                userInput.nextLine();
                                System.out.println("- Oh these are very interesting. They are said to provide vitality to even those close to death.");
                                userInput.nextLine();
                                System.out.println("You remove the apples from the branch and put them in your pouch.");
                                player.addApple(2);
                                System.out.println("You have " + player.getApple() + "/4 golden apples.");
                                userInput.nextLine();
                                System.out.println("Do you want to keep the branch? \n[1] Yes\n[2] No");
                                userInput.nextLine();
                                if (userInput.equals("1") || userInput.equals("Yes") || userInput.equals("yes") || userInput.equals("y")) {
                                        System.out.println("You keep the branch. Who knows? It could be usefull.");
                                        player.branch = 1;
                                } else {
                                        System.out.println("You throw the branch into the ditch.");
                                }
                        } else if (randomLoot <= 49 && randomLoot > 30) {
                                System.out.println("He pulls out a golden dagger with a ruby fitted into the hilt.");
                                userInput.nextLine();
                                System.out.println("- Ooh be careful when using this one. It was found in the ruins of a once amazing city.");
                                userInput.nextLine();
                                System.out.println("- It is said that a great evil sleeps there and that everything in the ruins are connected to it.");
                                userInput.nextLine();
                                System.out.println("Do you want to take the dagger?\n[1] Yes\n[2] No");
                                userInput.nextLine();
                                 if (userInput.equals("1") || userInput.equals("Yes") || userInput.equals("yes") || userInput.equals("y")) {
                                        System.out.println("You've gained: Ruby hilted dagger.");
                                        player.decreaseMaxHp(10);
                                        player.decreaseCurrentHp(10);
                                        player.addAttack(15);
                                 } else {
                                        System.out.println("You decline the dagger and the man shrugs and puts it back into the cart.");
                                 }
                        } else if (randomLoot <= 29 && randomLoot > 10) {
                                System.out.println("He pulls out a helmet that has a faceplate fastened with a long thing spike in the front.");
                                userInput.nextLine();
                                System.out.println("- This is an interesting piece. It belongs to an elite fighting group based in the desert city Astaper.");
                                userInput.nextLine();
                                System.out.println("- The soldiers are all slave-eunuchs and very effective warriors.");
                                userInput.nextLine();
                                System.out.println("You've gained: Helm of the unsallied");
                                player.addMaxHp(15);
                                player.addCurrentHp(15);
                        } else if (randomLoot <= 9 && randomLoot < 1) {
                                System.out.println("He pulls out a beautiful green cloak and hands it to you.");
                                userInput.nextLine();
                                System.out.println("You've gained: Green cloak.");
                        } else {
                                System.out.println("He pulls out a dirty rag");
                                userInput.nextLine();
                                System.out.println("- Whew seems to be my lucky day.");
                                userInput.nextLine();
                                System.out.println("You've gained: Dirty rag.");
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
