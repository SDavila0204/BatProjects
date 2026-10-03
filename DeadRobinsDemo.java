package DeadRobinsSociety;

public class DeadRobinsDemo {
    public static void main(String[] args) {
        DeadRobins killed = new DeadRobins("Jason Todd", 2,"Red Hood", true);
        System.out.println("Dead Robin information: \n Name: " + killed.getName()
                + "\n Robin #" + killed.getRobNum()
                + "\n New alias: " + killed.getNewAlias());
        System.out.print(" aka ");
        killed.brags();
    }
}
