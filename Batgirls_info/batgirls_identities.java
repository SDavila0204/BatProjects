package Batgirls_Info;

public class BatGirls_Identities {
    abstract class batGirls_Identities {
        protected String secretIdentities;


        public batGirls_Identities(String secretIdentity) {
            this.secretIdentities = secretIdentity;
        }

        public void fightingStyle() {
        }
    }

    class BarbaraGordon extends batGirls_Identities {
        private String firstAppereance;

        public BarbaraGordon(String secretIdentity, String firstAppereance) {
            super(secretIdentity);
            this.firstAppereance = firstAppereance;
        }

        @Override
        public void fightingStyle() {
            System.out.println( secretIdentities + " can hack into any device");
            System.out.println("first appeared " + firstAppereance);
        }
    }

    class StephanieBrown extends batGirls_Identities {
        private int likelyhoodOfCrashout;

        public StephanieBrown(String secretIdentity, int likelyhoodOfCrashout) {
            super(secretIdentity);
            this.likelyhoodOfCrashout = likelyhoodOfCrashout;
        }

        @Override
        public void fightingStyle() {
            System.out.println(secretIdentities + " yaps her way out of situations");
            System.out.println("likelyhood of crash out " + likelyhoodOfCrashout);
        }
    }

    class CassCain extends batGirls_Identities {
        private String bodyLanguageAnalysis;

        public CassCain(String secretIdentity, String bodyLanguageAnalysis) {
            super(secretIdentity);
            this.bodyLanguageAnalysis = bodyLanguageAnalysis;
        }

        @Override
        public void fightingStyle() {
            System.out.println(secretIdentities + " can predict movements with deadly accuracy");
            System.out.println("body language analysis skills: " + bodyLanguageAnalysis);
        }
    }

}
