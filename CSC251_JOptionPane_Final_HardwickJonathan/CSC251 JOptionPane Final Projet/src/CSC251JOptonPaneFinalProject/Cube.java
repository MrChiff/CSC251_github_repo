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
    private String input;
   
    public void setSide(){
        // Prompt user to input side length.
        input = JOptionPane.showInputDialog("Cube: \n" + "Enter Side Length:");

        // Convert the String input to a double.
        s = Double.parseDouble(input);
    }
    
    public double getSurfaceArea(){
        double surfaceArea = 6.0 * Math.pow(s, 2.0);
        return surfaceArea;
    }
    
     public double getVolume() {
        double volume = Math.pow(s, 3.0);
        return volume;
    }
   
    public void printInfo() {
        
        JOptionPane.showMessageDialog(null, "Cube: \n" 
                                          + "Width:     " + s + "\n"
                                          + "Perimeter: " + getSurfaceArea() + "\n" 
                                          + "Area:      " + getVolume());
    }
    
}
