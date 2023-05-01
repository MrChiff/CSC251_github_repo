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
   
    public void setSide(double userSide){
        s = userSide;
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
    /*
    public void main() {
        String input;
        double width;
        double area;
        double perim;

        // Prompt user to input length.
        input = JOptionPane.showInputDialog("Square: \n" + "Enter Width:");

        // Convert the String input into an int.
        width = Double.parseDouble(input);

        // Calculate area of the rectangle.
        area = width * width;

        // Calculate the perimeter.
        perim = 4 * width;

        // Display the information
        JOptionPane.showMessageDialog(null, "Square: \n" + "Base: " + width + "\n"
                + "Perimeter: " + perim + "\n" + "Area: " + area);
    }*/
    
}
