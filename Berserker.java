package Dota2;

public class Berserker extends BaseHero implements Hero {
    public Berserker(int health, int mana, int level) {
        super(health, mana, level);

    }

    public void move() {
        System.out.println("Its moving!!");
    }

    public void castAbilityOne() {
        System.out.println("casts ability one!!");
    }

    public void castAbilityTwo() {
        System.out.println("casts ability two!!");
    }

    public void castUltimate() {
        System.out.println("casts ultimate!!");
    }

    public void gainExperience(int xp) {
        level += 50;
        System.out.println("berserk gains xp!!");

}

}
