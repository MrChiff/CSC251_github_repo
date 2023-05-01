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
public class Cube {
    private double s;
   
    public void setSide(double userSide){
        s = userSide;
    }
    
    public double getSurfaceArea(){
        double surfaceArea = 6 * Math.pow(s, 2);
        return surfaceArea;
    }
    
     public double getVolume() {
        double volume = Math.pow(s, 3);
        return volume;
    }
   
    public void printInfo() {
        
        JOptionPane.showMessageDialog(null, "Square: \n" 
                                          + "Width:     " + s + "\n"
                                          + "Perimeter: " + getSurfaceArea() + "\n" 
                                          + "Area:      " + getVolume());
    }
    
}
