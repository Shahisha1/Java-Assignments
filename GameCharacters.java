class GameCharacter {
    private String name;

    public GameCharacter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void attack() {
        System.out.println(name + " attacks!");
    }
}

class Warrior extends GameCharacter {
    private int Damage;

    public Warrior(String name, int Damage) {
        super(name);
        this.Damage = Damage;
    }

    @Override
    public void attack() {
        System.out.println(getName() + " [Warrior] swings their sword for " + Damage + "  mele damage!");
    }
}

class Archer extends GameCharacter {
    private int arrowCount;

    public Archer(String name, int arrowCount) {
        super(name);
        this.arrowCount = arrowCount;
    }

    @Override
    public void attack() {
        if (arrowCount > 0) {
            arrowCount--;
            System.out.println(getName() + " [Archer] shoots an arrow! Arrows remaining: " + arrowCount);
        } else {
            System.out.println(getName() + " [Archer] has no arrows left!");
        }
    }
}

class Mage extends GameCharacter {
    private int mana;

    public Mage(String name, int mana) {
        super(name);
        this.mana = mana;
    }

    @Override
    public void attack() {
        if (mana >= 20) {
            mana -= 20;
            System.out.println(getName() + " [Mage] casts a fireball! Mana remaining: " + mana);
        } else {
            System.out.println(getName() + " [Mage] does not have enough mana to cast a spell!");
        }
    }
}

public class GameCharacters {
    public static void main(String[] args) {
        GameCharacter[] party = {
            new Warrior("Lestat", 85),
            new Archer("Louis", 5),
            new Mage("Claudia", 50)
        };

        System.out.println("Battle Begins!");
        for (GameCharacter character : party) {
            character.attack();
        }

        System.out.println();
        System.out.println("Archer runs out of arrows");
        Archer archer = new Archer("Armand", 1);
        archer.attack();
        archer.attack();
    }
}
