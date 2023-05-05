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
public class Circle {

    private double r;       // radius
    private String input;   // user input

    public void setRadius(double userRadius) {
        // Prompt user to input radius.
        input = JOptionPane.showInputDialog("Circle: \n" + "Enter Radius:");

        // Convert the String input to a double.
        r = Double.parseDouble(input);
    }

    public double getCircumference() {
        double circumf = 2.0 * Math.PI * r;
        return circumf;
    }

    public double getArea() {
        //May want to look for a way to use the Math.pow(width,2) function
        double area = Math.PI * Math.pow(r, 2.0);
        return area;
    }

    public void printInfo() {

        JOptionPane.showMessageDialog(null, "Circle: \n"
                                          + "Radius:     " + r + "\n"
                                          + "Circumference: " + getCircumference() + "\n"
                                          + "Area:      " + getArea());
    }
}
