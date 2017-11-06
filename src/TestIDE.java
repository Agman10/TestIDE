import javax.swing.*;

/**
 * Created by August on 2017-11-06.
 * Created to test IntellJ  
 */
public class TestIDE {
    public static void main(String[] args) {

        int r = (int)Math.floor(Math.random() * 100);
        int g = 0;


        g =  Integer.parseInt(JOptionPane.showInputDialog("guess a number between 1 and 100"));

        if (g > r) {
            JOptionPane.showMessageDialog(null,"too much"); }

        if (g < r) {
            JOptionPane.showMessageDialog(null, "too low"); }










        /**
        boolean correct = false;
        double random = random;

        int g

        System.out.println(random);

    }

        System.out.println("random")
        double randomOutput = Math.floor(Math.random() * 100);
        return.randomOutput;
         */


    }
}
