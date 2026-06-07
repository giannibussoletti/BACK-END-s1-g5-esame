package entities;

public abstract class Character {
    //Attributes
    protected String name;
    protected int totalEnergy;
    protected int actualLevel;


    //Method
    public void showState() {
        System.out.println(name + " ha " + totalEnergy + " di energia totale rimanente");
    }

    public int takeDamage(int actualDamage) {
        int damageTaken = actualDamage / 5;
        return totalEnergy -= damageTaken;
    }

    public int getTotalEnergy() {
        return totalEnergy;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Nome: " + name + '\n' +
                "Energia totale: " + totalEnergy + "\n" +
                "Livello: " + actualLevel;
    }
}
