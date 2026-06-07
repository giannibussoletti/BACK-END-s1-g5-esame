package entities;

public class Warrior extends Character {
    protected int strength;
    protected int resistance;


    public Warrior(String name, int totalEnergy, int actualLevel, int strength, int resistance) {
        this.name = name;
        this.totalEnergy = totalEnergy;
        this.actualLevel = actualLevel;
        this.strength = strength;
        this.resistance = resistance;
    }

    public void trainingMethod() {
        resistance++;
    }

    public int attackDamage() {
        return (strength * resistance * actualLevel) / 10;
    }

    @Override
    public void showState() {
        super.showState();
    }

    @Override
    public int takeDamage(int actualDamage) {
        return super.takeDamage(actualDamage);
    }

    @Override
    public String toString() {
        return "Warrior{" +
                super.toString() + "\n" +
                "Forza: " + strength + "\n" +
                "Resistenza:" + resistance + "\n";
    }
}
