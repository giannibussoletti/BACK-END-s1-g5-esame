package entities;

public class Wizard extends Character {
    protected int magicalPower;
    protected int mana;


    public Wizard(String name, int totalEnergy, int actualLevel, int magicalPower, int mana) {
        this.name = name;
        this.totalEnergy = totalEnergy;
        this.actualLevel = actualLevel;
        this.magicalPower = magicalPower;
        this.mana = mana;
    }

    public void meditate() {
        ++mana;
    }

    public int attackDamage() {
        return (magicalPower * mana * actualLevel) / 10;
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
        return "\nMago\n" +
                super.toString() + "\n" +
                "Potere: " + magicalPower + "\n" +
                "Mana: " + mana;
    }
}
