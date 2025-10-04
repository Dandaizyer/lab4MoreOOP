package lotr;

import java.util.Random;

public class Knight extends Character {
    public Knight() {
        super(generateRandom(2, 12), generateRandom(2, 12));
    }

    @Override
    public void kick(Character opponent) {
        int damage = new Random().nextInt(this.getPower()) + 1;
        opponent.setHp(opponent.getHp() - damage);
        System.out.println("knight made " + damage + " dmg");
    }

    private static int generateRandom(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }
}