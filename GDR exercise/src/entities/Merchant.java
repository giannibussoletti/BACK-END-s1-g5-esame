package entities;

public class Merchant extends Character {
    protected int wealth;
    protected int nOfObjects;

    public Merchant(String name, int wealth, int nOfObjects) {
        this.name = name;
        this.wealth = wealth;
        this.nOfObjects = nOfObjects;
    }

    @Override
    public String toString() {
        return "Merchant{" +
                "Nome: " + name + '\n' +
                "Ricchezza: " + wealth + '\n' +
                "Totale Oggetti: " + nOfObjects;
    }
}
