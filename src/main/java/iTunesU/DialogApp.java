package iTunesU;

import javax.swing.JOptionPane;

public class DialogApp {
    public static void main(String[] args) {
        String s;

        s = JOptionPane.showInputDialog("Enter an Integer:");
        int x = Integer.parseInt(s);

        System.out.println("You entered " + x + ".");


    }
}
