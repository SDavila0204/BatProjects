package Dota2;

public abstract class BaseHero {
    protected int health;
    protected int mana;
    protected int level;

    public BaseHero(int health, int mana, int level) {
        this.health = health;
        this.mana = mana;
        this.level = level;

    }

    public int getHealth() {
       return health;
    }

    public void takeDamage(int damange) {
       health += damange;
        System.out.println("Take damage");
    }
    public void heal (int amount) {
        health += amount;
        System.out.println("Heal");
    }

    abstract void gainExperience(int xp);

}
