/*
 * CSC 251 JOptionPane Final Project
 * Jonathan Hardwick
 * 2023/05/07
 */
package CSC251JOptonPaneFinalProject;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Sphere {
    private double r;   // radius
    private String input;
    static ImageIcon icon = new ImageIcon("sphere.png");

    public String userInput(JLabel label){
        input = String.valueOf(JOptionPane.showInputDialog(null, label, "Sphere:",
                JOptionPane.INFORMATION_MESSAGE, icon, null,""));
        
        return input;
    }

    public void setRadius() {
        // Prompt user to input radius.
        JLabel label = new JLabel("Enter Radius:");
        label.setFont(new Font("Arial", Font.BOLD, 18));

        // Convert the String input to a double.
        r = Double.parseDouble(userInput(label));
    }

    public double getSurfaceArea() {
        double surfaceArea = 4.0 * Math.PI * Math.pow(r, 2.0);
        return surfaceArea;
    }

    public double getVolume() {
        //May want to look for a way to use the Math.pow(width,2) function
        double volume = (4.0/3.0) * Math.PI * Math.pow(r, 3.0);
        return volume;
    }

    public void printInfo() {

        JOptionPane.showMessageDialog(null, "Radius:     " + String.format("%.2f",(r)) + "\n"
                                          + "Surface Area: " + String.format("%.2f",(getSurfaceArea())) + "\n"
                                          + "Volume:      " + String.format("%.2f",(getVolume())),
                                          "Sphere:",JOptionPane.INFORMATION_MESSAGE, icon);
    }
}
