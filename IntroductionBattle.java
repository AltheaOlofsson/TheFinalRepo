import java.util.Scanner;

public class IntroductionBattle 
{
    Player player;
    Scanner userInput = new Scanner(System.in);
    
    Monster slime = new Monster("Slime", 20, 2, 2, 1, 2, 100);

    public IntroductionBattle(Player player)
    {
        this.player = player;
    }

    public void introBattle(Player player) {
        Monster currentMonster = slime;
        System.out.println("The slime sludges towards you.");

        while (player.IsAlive(player.currentHp)) 
        {
            if (player.getSpeed() >= currentMonster.getSpeed()) 
            {
                choosesAttackOrStats(currentMonster, player);
                if (currentMonster.isAlive() == true) 
                {
                    currentMonster.attack(player);
                } 
                else 
                {
                    currentMonster.monsterDeath(player);
                    break;
                }
            } 
            else 
            {
                currentMonster.attack(player);
                if (player.IsAlive(player.currentHp) == true) 
                {
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

    void choosesAttackOrStats(Monster currentMonster, Player player) 
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
                player.displayPlayerStats();
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
