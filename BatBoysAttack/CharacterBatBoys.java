package BatBoys_Attack;

public class CharacterBatBoys {
    public static abstract class Character {
        protected String secretIdentity;

        public Character(String secretIdentity) {
            this.secretIdentity = secretIdentity;
        }

        public String getSecretIdentity() {
            return secretIdentity;
        }

        public abstract void throwAnItem();
    }

    public static class DickGrayson extends Character {
        private String escrimaSticks;

        public DickGrayson(String secretIdentity, String escrimaSticks) {
            super(secretIdentity);
            this.escrimaSticks = escrimaSticks;
        }

        @Override
        public void throwAnItem() {
            System.out.println("Nightwing electrocutes Killer Croc with his " + escrimaSticks + "!");
        }
    }

    public static class JasonTodd extends Character {
        private String blades;

        public JasonTodd(String secretIdentity, String blades) {
            super(secretIdentity);
            this.blades = blades;
        }

        @Override
        public void throwAnItem() {
            System.out.println("Red Hood shoots Black Mask in the face! " + blades + " unsheathed.");
        }
    }

    public static class TimDrake extends Character {
        private String boStaff;

        public TimDrake(String secretIdentity, String boStaff) {
            super(secretIdentity);
            this.boStaff = boStaff;
        }

        @Override
        public void throwAnItem() {
            System.out.println(boStaff + " Red Robin knocks out Two-Face and Penguin at once!");
        }
    }

    public static class DamianWayne extends Character {
        private String katana;

        public DamianWayne(String secretIdentity, String katana) {
            super(secretIdentity);
            this.katana = katana;
        }

        @Override
        public void throwAnItem() {
            System.out.println("Robin slices through Clayface with his " + katana + "!");
        }
    }

    public static void main(String[] args) {
        Character[] heroes = {
            new DickGrayson("Dick Grayson", "escrima sticks"),
            new JasonTodd("Jason Todd", "all blades"),
            new TimDrake("Tim Drake", "bo staff"),
            new DamianWayne("Damian Wayne", "katana")
        };

        for (Character hero : heroes) {
            hero.throwAnItem();
        }
    }
}
