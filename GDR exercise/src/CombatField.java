import entities.Character;
import entities.Merchant;
import entities.Warrior;
import entities.Wizard;

import java.util.Arrays;
import java.util.Scanner;

public class CombatField {
    static void main() {

        Character[] characters = new Character[2];
        Scanner scanner = new Scanner(System.in);

        System.out.println("{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}\n" +
                "{}                                                                  {}\n" +
                "{}                                                                  {}\n" +
                "{}      ________  ___  ________  ________   ________   ___          {}\n" +
                "{}     |\\   ____\\|\\  \\|\\   __  \\|\\   ___  \\|\\   ___  \\|\\  \\         {}\n" +
                "{}     \\ \\  \\___|\\ \\  \\ \\  \\|\\  \\ \\  \\\\ \\  \\ \\  \\\\ \\  \\ \\  \\        {}\n" +
                "{}      \\ \\  \\  __\\ \\  \\ \\   __  \\ \\  \\\\ \\  \\ \\  \\\\ \\  \\ \\  \\       {}\n" +
                "{}       \\ \\  \\|\\  \\ \\  \\ \\  \\ \\  \\ \\  \\\\ \\  \\ \\  \\\\ \\  \\ \\  \\      {}\n" +
                "{}        \\ \\_______\\ \\__\\ \\__\\ \\__\\ \\__\\\\ \\__\\ \\__\\\\ \\__\\ \\__\\     {}\n" +
                "{}         \\|_______|\\|__|\\|__|\\|__|\\|__| \\|__|\\|__| \\|__|\\|__|     {}\n" +
                "{}                                                                  {}\n" +
                "{}                                                                  {}\n" +
                "{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}\n\n\n");
        
        System.out.println("Andiamo in battaglia");
        for (int i = 0; i < characters.length; i++) {
            System.out.println("Creiamo il tuo " + (i + 1) + "°" + " personaggio");
            System.out.println("Cosa vuoi creare?\n1) Un guerriero\n2) un mago\n3) un mercante");
            int choice = scanner.nextInt();
            System.out.println("Come si chiama il tuo Personaggio?");
            scanner.nextLine();
            String name = scanner.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.println("Quale è il suo livello attuale");
                    int level = scanner.nextInt();
                    System.out.println("Il totale della sua forza");
                    int strength = scanner.nextInt();
                    System.out.println("Il totale della sua resistenza");
                    int resistance = scanner.nextInt();

                    characters[i] = new Warrior(name, 100, level, strength, resistance);
                }
                case 2 -> {
                    System.out.println("Quale è il suo livello attuale");
                    int level = scanner.nextInt();
                    System.out.println("Il totale del suo potere");
                    int magicPower = scanner.nextInt();
                    System.out.println("Il totale del suo mana");
                    int mana = scanner.nextInt();

                    characters[i] = new Wizard(name, 100, level, magicPower, mana);
                }
                case 3 -> {
                    System.out.println("Quanto oro possiede?");
                    int wealth = scanner.nextInt();
                    System.out.println("Quanti oggetti ha a disposizione?");
                    int obj = scanner.nextInt();
                    characters[i] = new Merchant(name, wealth, obj);
                }
            }
        }
        System.out.println(Arrays.toString(characters));
        System.out.println("Scegli il tuo primo combattente\n(ricorda che i mercanti non possono difendersi)\ndimmi un numero da 1 a 4");
        int firstChoice = (scanner.nextInt() - 1);
        System.out.println("Scegli il tuo secondo combattente\ndimmi un numero da 1 a 4");
        int secondChoice = (scanner.nextInt() - 1);
        while (true) {
            int attackDamage = 0;

            if (characters[firstChoice] instanceof Wizard wizard) {
                attackDamage = wizard.attackDamage();
            } else if (characters[firstChoice] instanceof Warrior warrior) {
                attackDamage = warrior.attackDamage();
            }

            int secondAttackDamage = 0;
            if (characters[secondChoice] instanceof Wizard wizard) {
                secondAttackDamage = wizard.attackDamage();
            } else if (characters[secondChoice] instanceof Warrior warrior) {
                secondAttackDamage = warrior.attackDamage();
            }

            if (characters[secondChoice] instanceof Wizard wizard) {
                wizard.takeDamage(attackDamage);
                wizard.showState();
            } else if (characters[secondChoice] instanceof Warrior warrior) {
                warrior.takeDamage(attackDamage);
                warrior.showState();
            } else if (characters[secondChoice] instanceof Merchant merchant) {
                merchant.takeDamage(attackDamage);
                merchant.showState();
            }
            if (characters[firstChoice].getTotalEnergy() <= 0 || characters[secondChoice].getTotalEnergy() <= 0) {
                System.out.println("La battaglia è finita");
                if (characters[firstChoice].getTotalEnergy() > characters[secondChoice].getTotalEnergy()) {
                    System.out.println(characters[firstChoice].getName() + " vince la battaglia");
                } else {
                    System.out.println(characters[secondChoice].getName() + " vince la battaglia");
                }
                break;
            }

            if (characters[firstChoice] instanceof Wizard wizard) {
                wizard.takeDamage(secondAttackDamage);
                wizard.showState();
            } else if (characters[firstChoice] instanceof Warrior warrior) {
                warrior.takeDamage(secondAttackDamage);
                warrior.showState();
            } else if (characters[firstChoice] instanceof Merchant merchant) {
                merchant.takeDamage(secondAttackDamage);
                merchant.showState();
            }
            if (characters[firstChoice].getTotalEnergy() <= 0 || characters[secondChoice].getTotalEnergy() <= 0) {
                System.out.println("La battaglia è finita");
                if (characters[firstChoice].getTotalEnergy() > characters[secondChoice].getTotalEnergy()) {
                    System.out.println(characters[firstChoice].getName() + " vince la battaglia");
                } else {
                    System.out.println(characters[secondChoice].getName() + " vince la battaglia");
                }
                break;
            }

        }
    }
}
