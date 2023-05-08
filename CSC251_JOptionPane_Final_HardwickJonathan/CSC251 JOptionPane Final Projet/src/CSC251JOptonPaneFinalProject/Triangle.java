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

public class Triangle {

    private double width;
    private double height;
    private double s1;
    private double s2;
    private String input;
    static ImageIcon icon = new ImageIcon("triangle.png");
    
    public String userInput(JLabel label){
        input = String.valueOf(JOptionPane.showInputDialog(null, label, "Triangle:",
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

    public void setHeight() {
        // Prompt user to input height.
        JLabel label = new JLabel("Enter Height:");
        label.setFont(new Font("Arial", Font.BOLD, 18));

        // Convert the String input to an int.
        height = Double.parseDouble(userInput(label));
    }

    public void setSide1() {
        // Prompt user to input side 1 length.
        JLabel label = new JLabel("Enter Side 1 Length:");
        label.setFont(new Font("Arial", Font.BOLD, 18));

        // Convert the String input to an int.
        s1 = Double.parseDouble(userInput(label));
    }

    public void setSide2() {
        // Prompt user to input side 2 length.
        JLabel label = new JLabel("Enter Side 2 Length:");
        label.setFont(new Font("Arial", Font.BOLD, 18));

        // Convert the String input to an int.
        s2 = Double.parseDouble(userInput(label));
    }

    public double getPerimeter() {
        double perim = width + s1 + s2;
        return perim;
    }

    public double getArea() {
        double area = 0.5 * width * height;
        return area;
    }

    public void printInfo() {
        
        JOptionPane.showMessageDialog(null, "Base: " + String.format("%.2f",(width)) + "\n"
                                          + "Height: " + String.format("%.2f",(height)) + "\n" 
                                          + "S1: " + String.format("%.2f",(s1)) + "\n" 
                                          + "S2: " + String.format("%.2f",(s2)) + "\n" 
                                          + "Perimeter: " + String.format("%.2f",(getPerimeter())) + "\n" 
                                          + "Area: " + String.format("%.2f",(getArea())),
                                          "Triangle:", JOptionPane.INFORMATION_MESSAGE, icon);
    }
    
}
