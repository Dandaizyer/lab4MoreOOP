package lotr;

public class Elf extends Character {
    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character opponent) {
        if (opponent.getPower() < this.getPower()) {
            opponent.setHp(0);
            System.out.println("Elf killed the weaker opponent!");
        } else {
            opponent.setPower(opponent.getPower() - 1);
            System.out.println("Elf decreased opponent's power by 1");
        }
    }
}