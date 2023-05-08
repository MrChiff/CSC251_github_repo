/*
 * CSC 251 JOptionPane Final Project
 * Jonathan Hardwick
 * 2023/05/07
 */
package CSC251JOptonPaneFinalProject;

import javax.swing.*;
import java.awt.*;


public class Square {
    private double s;
    private String input;
    static ImageIcon icon = new ImageIcon("square.png");
    
    public String userInput(JLabel label){
        input = String.valueOf(JOptionPane.showInputDialog(null, label, "Square:",
                JOptionPane.INFORMATION_MESSAGE, icon, null,""));
        
        return input;
    }
    public void setSide(){
        // Prompt user to input side length.
        JLabel label = new JLabel("Enter Side Length:");
        label.setFont(new Font("Arial", Font.BOLD, 18));

        // Convert the String input to a double.
        s = Double.parseDouble(userInput(label));
    }
    
    public double getPerimeter(){
        double perim = 4.0 * s;
        return perim;
    }
    
     public double getArea() {
        double area = Math.pow(s, 2.0);
        return area;
    }
   
    public void printInfo() {
        String text = "Length:  " + String.format("%.2f",(s)) + "\n" 
                    + "Perimeter:  " + String.format("%.2f",(getPerimeter())) + "\n" 
                    + "Area:  " + String.format("%.2f",(getArea()));
        JOptionPane.showMessageDialog(null,text,"Square:", JOptionPane.INFORMATION_MESSAGE, icon);
    }
       
}
