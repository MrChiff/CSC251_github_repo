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
public class RightCircularConeFrustum {
    private double r;   // minor radius
    private double R;   // major radius
    private double h;   // height
    private double s;   // side length
    private String input;

    public void setMinorRadius() {
        // Prompt user to input radius.
        input = JOptionPane.showInputDialog("Right Circular Cone Frustum: \n" + "Enter Minor Radius:");

        // Convert the String input to a double.
        r = Double.parseDouble(input);
    }
    public void setMajorRadius() {
        // Prompt user to input radius.
        input = JOptionPane.showInputDialog("Right Circular Cone Frustum: \n" + "Enter Major Radius:");

        // Convert the String input to a double.
        R = Double.parseDouble(input);
    }
    public void setHeight() {
        // Prompt user to input height.
        input = JOptionPane.showInputDialog("Right Circular Cone Frustum: \n" + "Enter Height:");

        // Convert the String input to a double.
        h = Double.parseDouble(input);
    }
    public void setSide(){
        // Prompt user to input side length.
        input = JOptionPane.showInputDialog("Cube: \n" + "Enter Side Length:");

        // Convert the String input to a double.
        s = Double.parseDouble(input);
    }
    public double getSurfaceArea(){
        double surfaceArea = Math.PI * s * (R + r);
        return surfaceArea;
    }

    public double getVolume() {
        //May want to look for a way to use the Math.pow(width,2) function
        double volume = (1.0/3.0) * Math.PI * (Math.pow(r, 2.0) + r * R + Math.pow(R, 2)) * h;
        return volume;
    }

    public void printInfo() {

        JOptionPane.showMessageDialog(null, "Right Circular Cylinder: \n"
                                          + "Minor Radius:  " + r + "\n"
                                          + "Major Radius:  " + r + "\n"
                                          + "Height:        " + h + "\n"
                                          + "Side Length:   " + s + "\n"
                                          + "Surface Area:  " + getSurfaceArea() + "\n"
                                          + "Volume:        " + getVolume());
    }
    
}