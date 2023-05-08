/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSC251JOptonPaneFinalProject;


import javax.swing.*;
import java.awt.*;

/**
 *
 * @author mr.chiff
 */
public class Square {
    private double s;
    private String input;
    static ImageIcon icon = new ImageIcon("square1.png");
   
    public void setSide(){
        // Prompt user to input side length.
        JLabel label = new JLabel("Enter Side Length:");
        label.setFont(new Font("Arial", Font.BOLD, 18));
        input = String.valueOf(JOptionPane.showInputDialog(null, label, "Square:",
                JOptionPane.INFORMATION_MESSAGE, icon, null,""));

        // Convert the String input to a double.
        s = Double.parseDouble(input);
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
