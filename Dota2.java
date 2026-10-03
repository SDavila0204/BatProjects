package Dota2;

public class Dota2 {
    public static void main(String[] args) {
        Berserker calling = new Berserker(200, 50, 48);

        calling.move();
        calling.castAbilityOne();
        calling.castAbilityTwo();
        calling.castUltimate();

        calling.takeDamage(50);
        calling.heal(20);
        calling.gainExperience(53);
        calling.gainExperience(40);
    }
}
