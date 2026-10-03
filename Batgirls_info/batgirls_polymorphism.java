package Batgirls_Info;

import java.util.*;

public class BatGirls_PolyMorphism {
    public static void main(String[] args) {

        BatGirls_Identities batGirlsIdentities = new BatGirls_Identities();

        ArrayList<BatGirls_Identities.batGirls_Identities> whoarethey = new ArrayList<>();

        whoarethey.add(batGirlsIdentities.new BarbaraGordon("oracle", "1967"));
        whoarethey.add(batGirlsIdentities.new StephanieBrown("Spoiler", 100));
        whoarethey.add(batGirlsIdentities.new CassCain("Black Bat", "overpowered"));

        System.out.println("batgirls!!");
        for (BatGirls_Identities.batGirls_Identities batGirl : whoarethey) {
            batGirl.fightingStyle();
        }

    }
}
