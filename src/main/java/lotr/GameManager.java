package lotr;

public class GameManager {
    public void fight(Character c1, Character c2) {
        System.out.println("START");
        System.out.println(c1 + " against " + c2);

        int round = 1;
        while (c1.isAlive() && c2.isAlive()) {
            System.out.println("\n round: " + round);

            if (c1.isAlive()) {
                System.out.print(c1.getClass().getSimpleName() + " attacks: ");
                c1.kick(c2);
            }

            if (c2.isAlive()) {
                System.out.print(c2.getClass().getSimpleName() + " attacks: ");
                c2.kick(c1);
            }

            System.out.println("status: " + c1 + " | " + c2);
            round++;

            if (round > 20) {
                System.out.println("That`s too long - need to stop!");
                break;
            }
        }

        System.out.println("\nEND");
        if (c1.isAlive()) {
            System.out.println(c1.getClass().getSimpleName() + " is the winner");
        } else if (c2.isAlive()) {
            System.out.println(c2.getClass().getSimpleName() + " is the winner");
        } else {
            System.out.println("DRAW");
        }
    }
}