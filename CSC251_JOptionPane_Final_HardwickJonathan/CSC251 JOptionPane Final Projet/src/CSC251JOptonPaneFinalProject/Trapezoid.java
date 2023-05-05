/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSC251JOptonPaneFinalProject;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Trapezoid {

    private double b1;      // base 1
    private double b2;      // base 2
    private double height;  // height
    private double s1;      // slanted side 1
    private double s2;      // slanted side 2
    private String input;

    public void setBase1() {
        // Prompt user to input base 1 length.
        input = JOptionPane.showInputDialog("Trapezoid: \n" + "Enter Base 1 Length:");

        // Convert the String input to a double.
        b1 = Double.parseDouble(input);
    }
    
    public void setBase2() {
        // Prompt user to input base 2 length.
        input = JOptionPane.showInputDialog("Trapezoid: \n" + "Enter Base 2 Length:");

        // Convert the String input to a double.
        b2 = Double.parseDouble(input);
    }

    public void setHeight() {
        // Prompt user to input height.
        input = JOptionPane.showInputDialog("Trapezoid: \n" + "Enter Height:");

        // Convert the String input to a double.
        height = Double.parseDouble(input);
    }

    public void setSide1() {
        // Prompt user to input side 1 length.
        input = JOptionPane.showInputDialog("Trapezoid: \n" + "Enter Side 1 Length:");

        // Convert the String input to a double.
        s1 = Double.parseDouble(input);
    }
    
    public void setSide2() {
        // Prompt user to input side 2 length.
        input = JOptionPane.showInputDialog("Trapezoid: \n" + "Enter Side 1 Length:");

        // Convert the String input to a double.
        s2 = Double.parseDouble(input);
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
        JOptionPane.showMessageDialog(null, "Trapezoid: \n"
                                          + "Base 1:    " + b1 + "\n"
                                          + "Base 2:    " + b2 + "\n"
                                          + "Height:    " + height + "\n"
                                          + "Side 1:    " + s1 + "\n"
                                          + "Side 2:    " + s2 + "\n"
                                          + "Perimeter: " + getPerimeter() + "\n"
                                          + "Area:      " + getArea());
    }
}
