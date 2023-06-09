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

public class RightCircularCone {
    private double r;   // radius
    private double h;   // height
    private String input;
    static ImageIcon icon = new ImageIcon("rightCircularCone.png");

    public String userInput(JLabel label){
        input = String.valueOf(JOptionPane.showInputDialog(null, label, "Right Circular Cone:",
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
    public void setHeight() {
        // Prompt user to input height.
        JLabel label = new JLabel("Enter Height:");
        label.setFont(new Font("Arial", Font.BOLD, 18));

        // Convert the String input to a double.
        h = Double.parseDouble(userInput(label));
    }
    public double getSurfaceArea(){
        double surfaceArea = Math.PI * r * Math.pow((Math.pow(r, 2.0) + Math.pow(h, 2.0)), 0.5);
        return surfaceArea;
    }

    public double getVolume() {
        //May want to look for a way to use the Math.pow(width,2) function
        double volume = (1.0/3.0) * Math.PI * Math.pow(r, 2.0) * h;
        return volume;
    }

    public void printInfo() {

        JOptionPane.showMessageDialog(null, "Radius:     " + String.format("%.2f",(r)) + "\n"
                                          + "Height:     " + String.format("%.2f",(h)) + "\n"
                                          + "Surface Area: " + String.format("%.2f",(getSurfaceArea())) + "\n"
                                          + "Volume:      " + String.format("%.2f",(getVolume())),
                                          "Right Circular Cone:", JOptionPane.INFORMATION_MESSAGE, icon);
    }
}
