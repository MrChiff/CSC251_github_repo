/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSC251JOptonPaneFinalProject;

import static CSC251JOptonPaneFinalProject.Parallelogram.icon;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * CSC 251 JOptionPane Final Project
 * Jonathan Hardwick
 * 2023/05/07
 */
public class Trapezoid {

    private double b1;      // base 1
    private double b2;      // base 2
    private double height;  // height
    private double s1;      // slanted side 1
    private double s2;      // slanted side 2
    private String input;
    static ImageIcon icon = new ImageIcon("trapezoid.png");
    
    public String userInput(JLabel label){
        input = String.valueOf(JOptionPane.showInputDialog(null, label, "Trapezoid:",
                JOptionPane.INFORMATION_MESSAGE, icon, null,""));
        
        return input;
    }

    public void setBase1() {
        // Prompt user to input base 1 length.
        JLabel label = new JLabel("Enter Base 1 Length:");
        label.setFont(new Font("Arial", Font.BOLD, 18));

        // Convert the String input to a double.
        b1 = Double.parseDouble(userInput(label));
    }
    
    public void setBase2() {
        // Prompt user to input base 2 length.
        JLabel label = new JLabel("Enter Base 2 Length:");
        label.setFont(new Font("Arial", Font.BOLD, 18));

        // Convert the String input to a double.
        b2 = Double.parseDouble(userInput(label));
    }

    public void setHeight() {
        // Prompt user to input height.
        JLabel label = new JLabel("Enter Height:");
        label.setFont(new Font("Arial", Font.BOLD, 18));

        // Convert the String input to a double.
        height = Double.parseDouble(userInput(label));
    }

    public void setSide1() {
        // Prompt user to input side 1 length.
        JLabel label = new JLabel("Enter Side 1 Length:");
        label.setFont(new Font("Arial", Font.BOLD, 18));

        // Convert the String input to a double.
        s1 = Double.parseDouble(userInput(label));
    }
    
    public void setSide2() {
        // Prompt user to input side 2 length.
        JLabel label = new JLabel("Enter Side 2 Length:");
        label.setFont(new Font("Arial", Font.BOLD, 18));

        // Convert the String input to a double.
        s2 = Double.parseDouble(userInput(label));
    }

    public double getPerimeter() {
        double perim = s1 + s2 + b1 + b2;
        return perim;
    }

    public double getArea() {
        double area = 0.5 * height * (b1 + b2);
        return area;
    }

    public void printInfo() {
        JOptionPane.showMessageDialog(null, "Base 1:    " + b1 + "\n"
                                          + "Base 2:    " + b2 + "\n"
                                          + "Height:    " + height + "\n"
                                          + "Side 1:    " + s1 + "\n"
                                          + "Side 2:    " + s2 + "\n"
                                          + "Perimeter: " + getPerimeter() + "\n"
                                          + "Area:      " + getArea(),"Trapezoid",
                                          JOptionPane.INFORMATION_MESSAGE, icon);
    }
}
