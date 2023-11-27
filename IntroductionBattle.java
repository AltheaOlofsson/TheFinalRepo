import java.util.Scanner;

public class IntroductionBattle 
{
    Player player;
    Scanner userInput = new Scanner(System.in);
    
    Enemy slime = new Enemy("Slime", 50, 2, 6, 1, 2, 100);

    public IntroductionBattle(Player player)
    {
        this.player = player;
    }

    public void introBattle(Player player) {
        Enemy currentMonster = slime;
        System.out.println("The slime sludges towards you.");

        while (player.isAlive()) 
        {
            if (player.getSpeed() >= currentMonster.getSpeed()) 
            {
                choosesAttackOrStats(currentMonster, player);
                if (currentMonster.isAlive() == true) 
                {
                    currentMonster.attack(player);
                    if (!player.isAlive()) {return;}
                } 
                else 
                {
                    currentMonster.monsterDeath(player);
                    break;
                }
            } 
            else {

                //The slime can now kill you if you dont heal but the text that comes up is one of victory. I'd want to either force the player to heal or make the screen say someting abot this if you die.

                currentMonster.attack(player);
                if (player.isAlive()) 
                {
                    if(player.getCurrentHp()<10){
                        System.out.println("The monster hits hard. Eat a Golden apple to Heal.");
                    }
                    choosesAttackOrStats(currentMonster, player);
                }
                if (!currentMonster.isAlive()) 
                {
                    currentMonster.monsterDeath(player);
                    break;
                }
            }
        }
    }

    void choosesAttackOrStats(Enemy currentMonster, Player player) 
    {
        String attackChoice= "";
        while (attackChoice != "1" || attackChoice != "2") 
        {
            System.out.println("\nWhat do you want to do? \n[1] Attack! \n[2] Eat Apple.");
            attackChoice = userInput.nextLine();
            if (attackChoice.equals("1")) 
            {
                player.attack(currentMonster);
                System.out.println(currentMonster.getName() + ":  HP: " + currentMonster.getHitPoints());
                break;
            } 
            else if (attackChoice.equals("2")) 
            {
                player.heal(player);
                break;
            } 
            else 
            {
                System.out.println("Incorrect input.");
            }
        }
    }

    public static void main(String[] args) {
        Player player = new Player("Brian");
        IntroductionBattle intro = new IntroductionBattle(player);
        player.setSpeed(2);
        player.setMaxHp(20);
        player.setCurrentHp(20);
        player.setAttack(15);

        intro.introBattle(player);
    }
}
