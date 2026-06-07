package entities;

public class Character {
    //Attributes
    protected String name;
    protected int totalEnergy;
    protected int actualLevel;


    //Method
    public void showState() {
    }

    public int takeDamage(int actualDamage) {
        int damageTaken = actualDamage / 5;
        return totalEnergy -= damageTaken;
    }

    @Override
    public String toString() {
        return "Character:\n" +
                "Name: " + name + '\n' +
                "Energia totale:" + totalEnergy + "\n" +
                "Livello:" + actualLevel;
    }
}
