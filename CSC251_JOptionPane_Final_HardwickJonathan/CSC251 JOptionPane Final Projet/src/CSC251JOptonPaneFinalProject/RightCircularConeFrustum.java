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
public class RightCircularConeFrustum {
    private double r;   // minor radius
    private double R;   // major radius
    private double h;   // height
    private double s;   // slant length
    private String input;
    static ImageIcon icon = new ImageIcon("rightCircularConeFrustum.png");
    
    public String userInput(JLabel label){
        input = String.valueOf(JOptionPane.showInputDialog(null, label, "Right Circular Cone Frustum:",
                JOptionPane.INFORMATION_MESSAGE, icon, null,""));
        
        return input;
    }

    public void setMinorRadius() {
        // Prompt user to input radius.
        JLabel label = new JLabel("Enter Minor Radius (r):");
        label.setFont(new Font("Arial", Font.BOLD, 18));

        // Convert the String input to a double.
        r = Double.parseDouble(userInput(label));
    }
    public void setMajorRadius() {
        // Prompt user to input radius.
        JLabel label = new JLabel("Enter Major Radius (R):");
        label.setFont(new Font("Arial", Font.BOLD, 18));

        // Convert the String input to a double.
        R = Double.parseDouble(userInput(label));
    }
    public void setHeight() {
        // Prompt user to input height.
        JLabel label = new JLabel("Enter Height:");
        label.setFont(new Font("Arial", Font.BOLD, 18));

        // Convert the String input to a double.
        h = Double.parseDouble(userInput(label));
    }
    public void setSide() {
        // Prompt user to input side length.
        JLabel label = new JLabel("Enter Side Length:");
        label.setFont(new Font("Arial", Font.BOLD, 18));

        // Convert the String input to a double.
        s = Double.parseDouble(userInput(label));
    }
    public double getSurfaceArea(){
        double surfaceArea = Math.PI * s * (R + r);
        return surfaceArea;
    }

    public double getVolume() {
        //May want to look for a way to use the Math.pow(width,2) function
        double volume = (1.0/3.0) * Math.PI * (Math.pow(r, 2.0) + r * R + Math.pow(R, 2.0)) * h;
        return volume;
    }

    public void printInfo() {

        JOptionPane.showMessageDialog(null, "Minor Radius:  " + String.format("%.2f",(r)) + "\n"
                                          + "Major Radius:  " + String.format("%.2f",(R)) + "\n"
                                          + "Height:        " + String.format("%.2f",(h)) + "\n"
                                          + "Side Length:   " + String.format("%.2f",(s)) + "\n"
                                          + "Surface Area:  " + String.format("%.2f",(getSurfaceArea())) + "\n"
                                          + "Volume:        " + String.format("%.2f",(getVolume())),
                                          "Right Circular Cone Frustum:", JOptionPane.INFORMATION_MESSAGE, icon);
    }
    
}
