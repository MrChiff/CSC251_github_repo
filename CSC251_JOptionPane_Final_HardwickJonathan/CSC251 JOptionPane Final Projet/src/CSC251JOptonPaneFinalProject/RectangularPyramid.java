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
public class RectangularPyramid {
    private String input;
    private double width;
    private double height;
    private double length;
    static ImageIcon icon = new ImageIcon("rectangularPyramid.png");
    
    public String userInput(JLabel label){
        input = String.valueOf(JOptionPane.showInputDialog(null, label, "Rectangular Pyramid:",
                JOptionPane.INFORMATION_MESSAGE, icon, null,""));
        
        return input;
    }
    public void setWidth() {
        // Prompt user to input width.
        JLabel label = new JLabel("Enter Width:");
        label.setFont(new Font("Arial", Font.BOLD, 18));

        // Convert the String input to a double.
        width = Double.parseDouble(userInput(label));
    }

    public void setHeight() {
        // Prompt user to input height.
        JLabel label = new JLabel("Enter Height:");
        label.setFont(new Font("Arial", Font.BOLD, 18));

        // Convert the String input to a double.
        height = Double.parseDouble(userInput(label));
    }

    public void setLength() {
        // Prompt user to input length.
        JLabel label = new JLabel("Enter Length:");
        label.setFont(new Font("Arial", Font.BOLD, 18));

        // Convert the String input to a double.
        length = Double.parseDouble(userInput(label));
    }
    public double getVolume() {
        double volume = (1.0/3.0) * width * height * length;
        return volume;
    }
    public void printInfo() {
        JOptionPane.showMessageDialog(null, "Width: " + String.format("%.2f",(width)) + "\n"
                                          + "Height: " + String.format("%.2f",(height)) + "\n" 
                                          + "Length: " + String.format("%.2f",(length)) + "\n"
                                          + "Volume: " + String.format("%.2f",(getVolume())),
                                          "Rectangular Pyramid:", JOptionPane.INFORMATION_MESSAGE, icon);
   }
    
}
