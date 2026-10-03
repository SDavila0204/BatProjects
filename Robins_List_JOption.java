import javax.swing.*;
import java.util.ArrayList;

public class Robins_List_JOption {
    public static void main(String[] args) {
        System.out.println("An itemized list of all the robins " +
                "(or at least the most popular ones");

        ArrayList<String> robins = new ArrayList<>();

        robins.add("Dick Grayson");
        robins.add("Jason Todd");
        robins.add("Tim Drake");
        robins.add("Stephanie Brown");
        robins.add("Damian Wayne");
        robins.add("Carrie Kelly");
        robins.add("Duke Thomas");
        robins.add("Matthew McGinnis");
        robins.add("Jarro the Starro");
        robins.add("Robin the Toy wonder");

        System.out.println(robins);

        JOptionPane.showMessageDialog(null, robins,"ALL WHO HAVE ASSUMED THE ROLE OF ROBIN: ", JOptionPane.INFORMATION_MESSAGE);




    }
}
