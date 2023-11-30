
import java.util.Scanner;


public class Event5 extends Event {
       Player player;
       Scanner scanner;
        Event5() {
                super();
                this.eventLevel = 20;
        }     
        @Override
        public void execute(Player player, InputHandler inputHandler) {

                intro();

                System.out.println("What do you want to do?? \n[1] Help the poor man. \n[2] Rob him blind. \n[3] Leave him on the road. You have important buisness to atend.");

                boolean help = true;
                while(help){
                String choice = input.readInput(player);
                        switch (choice){
                                case "1":
                                        AdventureGame.clearScreen();
                                        System.out.println("You decide to help");    
                                        int randomLoot = randomgen.nextInt(100) + 1;
                                        if (randomLoot > 80 && randomLoot <= 100) {
                                                player.setExcalibre(1);
                                                System.out.println("You get the fantastical magic sword.");
                                                player.addExperience(100);
                                                help = false;
                                                break;
                                        }
                                        else if (randomLoot < 81 && randomLoot > 60){
                                                player.addAttack(5);
                                                player.addSpeed(5);
                                                System.out.println("Amulet of strenght \nAttack: + 5 \nSpeed: + 5");
                                                player.addExperience(100);
                                                help = false;
                                                break;
                                        }                                    
                                        else if (randomLoot <=60 && randomLoot > 30){
                                                System.out.println("Healing tonic and an apple. \nMax HP: + 10 \nCuttent HP: + 5");
                                                player.addMaxHp(10);
                                                player.addApple(1);
                                                player.addCurrentHp(15);
                                                player.addExperience(100);
                                                help = false;
                                                break;
                                        }
                                        else if (randomLoot <= 30 && randomLoot > 0){
                                                System.out.println("Scroll of intelligence. \nSpeed: + 5 \nExperience: + 15");
                                                player.addExperience(15);
                                                player.addSpeed(5);
                                                player.addExperience(100);
                                                help = false;
                                                break;
                                        }
                                case "2":
                                        AdventureGame.clearScreen();
                                        System.out.println("You pull out your weapon");
                                        player.addExperience(100);
                                        help = false;
                                        break;
                                case "3":
                                        AdventureGame.clearScreen();
                                        System.out.println(".... \nYou leave.");
                                        player.addExperience(100);
                                        help = false;
                                        break;
                        }       


                }


        }

public void intro() {
        // try {
        //         System.out.println("You walk along the path and come across an old man with a cart laden with sacks and boxes. The carts axle is broken and the man looks feeble and distraught.");
        //         Thread.sleep(8500);
        //         System.out.println("He sees you and his face brightens.");
        //         Thread.sleep(1000);
        //         System.out.println("-Hoy there young adventurer! Would you mind helping an old man? \nI have a new axle for the cart but my feeble arms and back \nprevents me from lifting the cart to install it.");
        //         Thread.sleep(13000);
        //         System.out.println("I'll reward you with whatever my hand first touches when I reach inside my cart.");

                System.out.println("You walk along the path and come across an old man with a cart laden with sacks and boxes. The carts axle is broken and the man looks feeble and distraught.");
                System.out.println("He sees you and his face brightens.");
                System.out.println("-Hoy there young adventurer! Would you mind helping an old man? \nI have a new axle for the cart but my feeble arms and back \nprevents me from lifting the cart to install it.");
                System.out.println("I'll reward you with whatever my hand first touches when I reach inside my cart.");

                                
// }  catch (InterruptedException e) {

//         Thread.currentThread().interrupt();
// }
}
        
}
