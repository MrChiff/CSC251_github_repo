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

public class Cube {
    private double s;
    private String input;
    static ImageIcon icon = new ImageIcon("cube.png");
   
    public String userInput(JLabel label){
        input = String.valueOf(JOptionPane.showInputDialog(null, label, "Cube:",
                JOptionPane.INFORMATION_MESSAGE, icon, null,""));
        
        return input;
    }
    public void setSide() {
        // Prompt user to input side length.
        JLabel label = new JLabel("Enter Side Length:");
        label.setFont(new Font("Arial", Font.BOLD, 18));

        // Convert the String input to a double.
        s = Double.parseDouble(userInput(label));
    }
    
    public double getSurfaceArea(){
        double surfaceArea = 6.0 * Math.pow(s, 2.0);
        return surfaceArea;
    }
    
     public double getVolume() {
        double volume = Math.pow(s, 3.0);
        return volume;
    }
   
    public void printInfo() {
        
        JOptionPane.showMessageDialog(null, "Side Length:   " + String.format("%.2f",(s)) + "\n"
                                          + "Survace Area:  " + String.format("%.2f",(getSurfaceArea())) + "\n" 
                                          + "Volume:        " + String.format("%.2f",(getVolume())), 
                                          "Cube:", JOptionPane.INFORMATION_MESSAGE, icon);
    }
    
}
