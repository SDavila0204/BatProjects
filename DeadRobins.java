package DeadRobinsSociety;

public class DeadRobins {
    private String name;
    private int robNum;
    private String newAlias;
    private boolean brags;

    public DeadRobins(String n, int rn, String nA, boolean brgs) {
        name = n;
        robNum = rn;
        newAlias = nA;
        brags = brgs;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void setRobNum(int rn) {
        this.robNum = rn;
    }

    public int getRobNum() {
        return robNum;
    }

    public void setNewAlias(String nA) {
        this.newAlias = nA;
    }

    public String getNewAlias(){
        return newAlias;
    }

    public void brags() {
        if (brags) {
            System.out.println("the one that got beat up and blown up by joker");
        } else {
            System.out.println("died some other convoluted way that probably isn't related to the joker");
        }
    }
}
