/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSC251JOptonPaneFinalProject;

import javax.swing.JOptionPane;

/**
 *
 * @author mr.chiff
 */
public class Square {
    private double s;
    private String input;
   
    public void setSide(){
        // Prompt user to input side length.
        input = JOptionPane.showInputDialog("Square: \n" + "Enter Width:");

        // Convert the String input to a double.
        s = Double.parseDouble(input);
    }
    
    public double getPerimeter(){
        double perim = 4.0 * s;
        return perim;
    }
    
     public double getArea() {
        double area = Math.pow(s, 2.0);
        return area;
    }
   
    public void printInfo() {
        
        JOptionPane.showMessageDialog(null, "Square: \n" 
                                          + "Width:     " + s + "\n"
                                          + "Perimeter: " + getPerimeter() + "\n" 
                                          + "Area:      " + getArea());
    }
       
}
