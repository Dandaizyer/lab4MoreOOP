package lotr;

public class Elf extends Character {
    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character opponent) {
        if (opponent.getPower() < this.getPower()) {
            opponent.setHp(0);
            System.out.println("elf killed weaker opponent!");
        } else {
            opponent.setPower(opponent.getPower() - 1);
            System.out.println("elf made opponent's power fewer by 1");
        }
    }
}