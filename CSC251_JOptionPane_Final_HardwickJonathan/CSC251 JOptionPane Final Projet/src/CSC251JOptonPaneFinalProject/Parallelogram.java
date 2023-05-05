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
public class Parallelogram {

    private double width;
    private double height;
    private double length;
    private String input;

    public void setWidth() {
        // Prompt user to input width.
        input = JOptionPane.showInputDialog("Parallelogram: \n" + "Enter Width:");

        // Convert the String input to a double.
        width = Double.parseDouble(input);
    }

    public void setHeight() {
        // Prompt user to input height.
        input = JOptionPane.showInputDialog("Parallelogram: \n" + "Enter Height:");

        // Convert the String input to a double.
        height = Double.parseDouble(input);
    }

    public void setLength() {
        // Prompt user to input length.
        input = JOptionPane.showInputDialog("Parallelogram: \n" + "Enter Length:");

        // Convert the String input to a double.
        length = Double.parseDouble(input);
    }

    public double getPerimeter() {
        double perim = 2.0 * (width + length);
        return perim;
    }

    public double getArea() {
        double area = length * height;
        return area;
    }

    public void printInfo() {
        JOptionPane.showMessageDialog(null, "Parallelogram: \n"
                                          + "Base:      " + width + "\n"
                                          + "Height:    " + height + "\n"
                                          + "Length:    " + length + "\n"
                                          + "Perimeter: " + getPerimeter() + "\n"
                                          + "Area:      " + getArea());
    }
}
