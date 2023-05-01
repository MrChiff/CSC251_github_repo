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
public class RectangularSolid {
    private double width;
    private double height;
    private double length;
   
    public void setWidth(double userWidth){
        width = userWidth;
    }
    public void setHeight(double userHeight) {
        height = userHeight;
    }
    public void setLength(double userLength) {
        length = userLength;
    }
    public double getSurfaceArea(){
        double surfaceArea = 2 * length * height 
                           + 2 * width * height 
                           + 2 * width * length;
        return surfaceArea;
    }
   
     public double getVolume() {
        double volume = width * height * length;
        return volume;
    }
   
    public void printInfo() {
        JOptionPane.showMessageDialog(null, "Rectangle: \n" 
                                          + "Base: " + width + "\n"
                                          + "Height: " + height + "\n" 
                                          + "Length: " + length + "\n" 
                                          + "Surface Area: " + getSurfaceArea() + "\n"
                                          + "Volume: " + getVolume());
   }
}
