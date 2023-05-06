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
public class Sphere {
    private double r;   // radius
    private String input;

    public void setRadius() {
        // Prompt user to input radius.
        input = JOptionPane.showInputDialog("Sphere: \n" + "Enter Radius:");

        // Convert the String input to a double.
        r = Double.parseDouble(input);
    }

    public double getSurfaceArea() {
        double surfaceArea = 4.0 * Math.PI * Math.pow(r, 2.0);
        return surfaceArea;
    }

    public double getVolume() {
        //May want to look for a way to use the Math.pow(width,2) function
        double volume = (4.0/3.0) * Math.PI * Math.pow(r, 3.0);
        return volume;
    }

    public void printInfo() {

        JOptionPane.showMessageDialog(null, "Sphere: \n"
                                          + "Radius:     " + r + "\n"
                                          + "Surface Area: " + getSurfaceArea() + "\n"
                                          + "Volume:      " + getVolume());
    }
}
