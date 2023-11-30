
public class HardlyCodedEvent extends Event {
        Player player;
        HardlyCodedEvent() {
                super();
                this.eventLevel = 20;
        }     
        @Override
        public void execute(Player player, InputHandler InputHandler) {
                
                System.out.println("Press ENTER to continue");
                System.out.println("At eavening you walk along the path and come across an old man with a cart laden with sacks and boxes. \nThe carts axle is broken and the man looks feeble and distraught.");
                input.readInput(player);
                System.out.println("He sees you and his face brightens.");
                input.readInput(player);
                System.out.println("- Hoy there young adventurer! Would you mind helping an old man? \nI have a new axle for the cart but my feeble arms and back \nprevents me from lifting the cart to install it.");
                input.readInput(player);
                System.out.println("I'll reward you with whatever my hand first touches when I reach inside my cart.");
                System.out.println("What do you want to do?? \n[1] Help the poor man. \n[2] Rob him blind. \n[3] Leave him on the road. You have important buisness to atend.");
                String giveHelpingHand = input.readInput(player);
                for (int wrongInput = 0; wrongInput < 10; wrongInput++) {
                if (giveHelpingHand.equals("1")) {
                        AdventureGame.clearScreen();
                        System.out.println("Press ENTER to continue");
                        System.out.println("You decide to help him out and together you work to fix the cart.");
                        input.readInput(player);
                        System.out.println("It takes a fair bit of time and effort, but you get the work done.");
                        input.readInput(player);
                        System.out.println("The man looks at you and smiles. - Thank you young man. I thought I'ld be stuck here all night.");
                        input.readInput(player);
                        System.out.println("Well a promise is a promise. He sticks his hand into the pile of sacks.");
                        input.readInput(player);

                        int randomLoot = randomgen.nextInt(100) + 1;
                        if (randomLoot == 100) {
                                System.out.println("He pulls out a beautiful sword and his smile immediately disappears.");
                                input.readInput(player);
                                System.out.println("- Just my luck. First my cart breaks and now I have to give away a legendary sword.");
                                input.readInput(player);
                                System.out.println("But by my honour I'll stand by my word.");
                                input.readInput(player);
                                System.out.println("You've gained: Legendary sword Excalibre");
                                player.excalibre = 1;
                                player.addAttack(100);
                                player.addSpeed(100);
                                player.addMaxHp(300);
                                player.addCurrentHp(300);
                                pressEnterToContinue(player);
                        } else if (randomLoot <= 99 && randomLoot > 90) {
                                System.out.println("He pulls out a sleek, curvy shortsword and hands it to you.");
                                input.readInput(player);
                                System.out.println("- Now thats a blade of marvels. It glows blue if there are orcs around.");
                                input.readInput(player);
                                System.out.println("You've gained: Stung.");
                                player.addAttack(20);
                                player.addSpeed(20);
                                pressEnterToContinue(player);
                        } else if (randomLoot <= 89 && randomLoot > 70) {
                                System.out.println("He pulls out a breastplate of peculiar shape. It looks almost like the gaunt chest of a burnt demon.");
                                input.readInput(player);
                                System.out.println("- Ah. This is a very effective armor, created by fusing ebony with the liver of a Deedra.");
                                input.readInput(player);
                                System.out.println("You've gained: Deedric armor.");
                                player.addMaxHp(20);
                                player.addSpeed(15);
                                pressEnterToContinue(player);
                        } else if (randomLoot <= 69 && randomLoot > 50) {
                                System.out.println("He pulls out a branch that holds two golden apples and hands it to you.");
                                input.readInput(player);
                                System.out.println("- Oh these are very interesting. They are said to provide vitality to even those close to death.");
                                input.readInput(player);
                                System.out.println("You remove the apples from the branch and put them in your pouch.");
                                player.addApple(2);
                                System.out.println("You have " + player.getApple() + "/4 golden apples.");
                                input.readInput(player);
                                System.out.println("Do you want to keep the branch? \n[1] Yes\n[2] No");
                                String choices = input.readInput(player);
                                if (choices.equals("1") || choices.equals("Yes") || choices.equals("yes") || choices.equals("y")) {
                                        System.out.println("You keep the branch. Who knows? It could be usefull.");
                                        player.branch = 1;
                                        pressEnterToContinue(player);
                                } else {
                                        System.out.println("You throw the branch into the ditch.");
                                        pressEnterToContinue(player);
                                }
                        } else if (randomLoot <= 49 && randomLoot > 30) {
                                System.out.println("He pulls out a golden dagger with a ruby fitted into the hilt.");
                                input.readInput(player);
                                System.out.println("- Ooh be careful when using this one. It was found in the ruins of a once amazing city.");
                                input.readInput(player);
                                System.out.println("- It is said that a great evil sleeps there and that everything in the ruins are connected to it.");
                                input.readInput(player);
                                System.out.println("Do you want to take the dagger?\n[1] Yes\n[2] No");
                                String choices = input.readInput(player);
                                 if (choices.equals("1") || choices.equals("Yes") || choices.equals("yes") || choices.equals("y")) {
                                        System.out.println("You've gained: Ruby hilted dagger.");
                                        player.decreaseMaxHp(10);
                                        player.decreaseCurrentHp(10);
                                        player.addAttack(15);
                                        pressEnterToContinue(player);
                                 } else {
                                        System.out.println("You decline the dagger and the man shrugs and puts it back into the cart.");
                                        pressEnterToContinue(player);
                                 }
                        } else if (randomLoot <= 29 && randomLoot > 10) {
                                System.out.println("He pulls out a helmet that has a faceplate fastened with a long thing spike in the front.");
                                input.readInput(player);
                                System.out.println("- This is an interesting piece. It belongs to an elite fighting group based in the desert city Astaper.");
                                input.readInput(player);
                                System.out.println("- The soldiers are all slave-eunuchs and very effective warriors.");
                                input.readInput(player);
                                System.out.println("You've gained: Helm of the unsallied.");
                                player.addMaxHp(15);
                                player.addCurrentHp(15);
                                pressEnterToContinue(player);
                        } else if (randomLoot <= 9 && randomLoot < 1) {
                                System.out.println("He pulls out a beautiful green cloak and hands it to you.");
                                input.readInput(player);
                                System.out.println("You've gained: Green cloak.");
                                pressEnterToContinue(player);
                        } else {
                                System.out.println("He pulls out a dirty rag.");
                                input.readInput(player);
                                System.out.println("- Whew seems to be my lucky day.");
                                input.readInput(player);
                                System.out.println("You've gained: Dirty rag.");
                                pressEnterToContinue(player);
                        }
                        player.addExperience(100);
                        break;
                } else if (giveHelpingHand.equals("2")) {
                        AdventureGame.clearScreen();
                        System.out.println("You pull out your weapon and threaten the old man. He gives you his moneypouch while cursing you.");
                        input.readInput(player);
                        System.out.println("While walking away you feel yourself loosing strenght.");
                        player.decreaseAttack(3);
                        player.decreaseCurrentHp(5);
                        player.decreaseMaxHp(5);
                        player.decreaseSpeed(3);
                        pressEnterToContinue(player);
                        break;
                } else if (giveHelpingHand.equals("3")) {
                        AdventureGame.clearScreen();
                        System.out.println("You continue past him.");
                        pressEnterToContinue(player);
                        break;
                } else {
                        System.out.println("Incorrect input. Please choose: 1, 2 or 3");
                }
                }
                
        }
        
}
