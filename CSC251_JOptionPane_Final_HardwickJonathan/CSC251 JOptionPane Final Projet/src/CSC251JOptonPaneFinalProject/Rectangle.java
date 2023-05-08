/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSC251JOptonPaneFinalProject;

import static CSC251JOptonPaneFinalProject.Square.icon;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author mr.chiff
 */
public class Rectangle {
    private double width;
    private double length;
    private String input;
    static ImageIcon icon = new ImageIcon("rectangle.png");
    private String text;
    
    public void setWidth(){
        // Prompt user to input width.
        JLabel label = new JLabel("Enter Width:");
        label.setFont(new Font("Arial", Font.BOLD, 18));
        input = String.valueOf(JOptionPane.showInputDialog(null, label, "Rectangle:",
                JOptionPane.INFORMATION_MESSAGE, icon, null,""));

        // Convert the String input to a double.
        width = Double.parseDouble(input);
    }
    public void setLength() {
        // Prompt user to input height.
        JLabel label = new JLabel("Enter Height:");
        label.setFont(new Font("Arial", Font.BOLD, 18));
        input = String.valueOf(JOptionPane.showInputDialog(null, label, "Rectangle:",
                JOptionPane.INFORMATION_MESSAGE, icon, null,""));
        
        // Convert the String input to a double.
        length = Double.parseDouble(input);
    }
    
    public double getPerimeter(){
        double perim = 2.0 * width + 2.0 * length;
        return perim;
    }
   
     public double getArea() {
        double area = width * length;
        return area;
    }
   
    public void printInfo() {
        JOptionPane.showMessageDialog(null, "Width: " + width + "\n"
                                          + "Length: " + length + "\n" 
                                          + "Perimeter: " + getPerimeter() + "\n"
                                          + "Area: " + getArea(),"Rectangle",
                                          JOptionPane.INFORMATION_MESSAGE, icon);
   }
}