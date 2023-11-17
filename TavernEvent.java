public class TavernEvent extends Events {

    public TavernEvent(Player p) {
        System.out.println("You come to an Inn by the road. You decide to take a rest.");
        System.out.println("The inn served a delicious hearty stew, you asked for seconds. Twice.");
        System.out.println("Current HP: + 10");
        p.addCurrenHp(10);
        System.out.println("When you set out again you realised you ate way too much. Your movements feel sluggish.");
        p.decreseSpeed(1);
        System.out.println("Speed: - 1");
        p.addExperience(25);
        }
    
}
