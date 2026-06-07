package entities;

public class Warrior extends Character {
    protected int strength;
    protected int resistance;


    public void trainingMethod() {
        ++resistance;
    }

    public int attackDamage() {
        return (strength * resistance * actualLevel) / 10;
    }

    @Override
    public int takeDamage(int actualDamage) {
        return super.takeDamage(actualDamage);
    }
}
