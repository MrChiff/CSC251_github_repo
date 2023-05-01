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
public class RightCircularCone {
    private double r;   // radius
    private double h;   // height

    public void setRadius(double userRadius) {
        r = userRadius;
    }
    public void setHeight(double userHeight) {
        h = userHeight;
    }
    public double getSurfaceArea(){
        double surfaceArea = Math.PI * r * Math.pow((Math.pow(r, 2.0) + Math.pow(h, 2.0)), 0.5);
        return surfaceArea;
    }

    public double getVolume() {
        //May want to look for a way to use the Math.pow(width,2) function
        double volume = (1.0/3.0) * Math.PI * Math.pow(r, 2.0) * h;
        return volume;
    }

    public void printInfo() {

        JOptionPane.showMessageDialog(null, "Right Circular Cylinder: \n"
                                          + "Radius:     " + r + "\n"
                                          + "Height:     " + h + "\n"
                                          + "Surface Area: " + getSurfaceArea() + "\n"
                                          + "Volume:      " + getVolume());
    }
}
