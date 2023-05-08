/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSC251JOptonPaneFinalProject;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * CSC 251 JOptionPane Final Project
 * Jonathan Hardwick
 * 2023/05/07
 */

public class RightCircularCylinder {
    private double r;   // radius
    private double h;   // height
    private String input;
    static ImageIcon icon = new ImageIcon("rightCircularCylinder.png");
    
    public String userInput(JLabel label){
        input = String.valueOf(JOptionPane.showInputDialog(null, label, "Right Circular Cylinder:",
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
        double surfaceArea = 2.0 * Math.PI * (r * h + Math.pow(r,2.0));
        return surfaceArea;
    }

    public double getVolume() {
        //May want to look for a way to use the Math.pow(width,2) function
        double volume = Math.PI * Math.pow(r, 2.0) * h;
        return volume;
    }

    public void printInfo() {

        JOptionPane.showMessageDialog(null, "Radius:     " + String.format("%.2f",(r)) + "\n"
                                          + "Height:     " + String.format("%.2f",(h)) + "\n"
                                          + "Surface Area: " + String.format("%.2f",(getSurfaceArea())) + "\n"
                                          + "Volume:      " + String.format("%.2f",(getVolume())),
                                          "Right Circular Cylinder", JOptionPane.INFORMATION_MESSAGE, icon);
    }
    
}
