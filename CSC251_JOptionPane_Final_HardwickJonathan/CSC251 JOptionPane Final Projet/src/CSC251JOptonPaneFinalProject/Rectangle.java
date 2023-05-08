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

public class Rectangle {
    private double width;
    private double length;
    private String input;
    static ImageIcon icon = new ImageIcon("rectangle.png");
    
    public String userInput(JLabel label){
        input = String.valueOf(JOptionPane.showInputDialog(null, label, "Rectangle:",
                JOptionPane.INFORMATION_MESSAGE, icon, null,""));
        
        return input;
    }
    
    public void setWidth(){
        // Prompt user to input width.
        JLabel label = new JLabel("Enter Width:");
        label.setFont(new Font("Arial", Font.BOLD, 18));

        // Convert the String input to a double.
        width = Double.parseDouble(userInput(label));
    }
    public void setLength() {
        // Prompt user to input height.
        JLabel label = new JLabel("Enter Height:");
        label.setFont(new Font("Arial", Font.BOLD, 18));
        
        // Convert the String input to a double.
        length = Double.parseDouble(userInput(label));
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
        JOptionPane.showMessageDialog(null, "Width: " + String.format("%.2f",(width)) + "\n"
                                          + "Length: " + String.format("%.2f",(length)) + "\n" 
                                          + "Perimeter: " + String.format("%.2f",(getPerimeter())) + "\n"
                                          + "Area: " + String.format("%.2f",(getArea())),
                                          "Rectangle:",JOptionPane.INFORMATION_MESSAGE, icon);
   }
}