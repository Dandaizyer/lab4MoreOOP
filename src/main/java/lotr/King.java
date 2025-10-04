package lotr;
import java.util.Random;

public class King extends Character {
    public King() {
        super(generateRandom(5, 15), generateRandom(5, 15));
    }

    @Override
    public void kick(Character opponent) {
        int damage = new Random().nextInt(this.getPower()) + 1;
        opponent.setHp(opponent.getHp() - damage);
        System.out.println("king made " + damage + " dmg");
    }

    private static int generateRandom(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }
}