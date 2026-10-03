package BatBoys_Attack;

import java.util.ArrayList;

public class BatBoysPolymorphism {
    public static void main(String[] args) {

        ArrayList<Character> characters = new ArrayList<>();

        characters.add(new DickGrayson("Nightwing", "Electricity: MAX"));
        characters.add(new JasonTodd("Red Hood", "powers unlocked"));
        characters.add(new TimDrake ("red Robin", "throws bo staff a staff at " +
                "Two face and Penguin!!"));
        characters.add(new DamianWayne("Robin", " stab stab!!"));


        System.out.println("Breakout in arkham! the batboys must defeat the rogues!");
        for(Character character : characters)
            character.throwAnItem();

    }
}
