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
public class Rectangle {
    private double width;
    private double height;
    private String input;
   
    public void setWidth(){
        // Prompt user to input width.
        input = JOptionPane.showInputDialog("Rectangle: \n" + "Enter Width:");

        // Convert the String input to a double.
        width = Double.parseDouble(input);
    }
    public void setHeight() {
        // Prompt user to input height.
        input = JOptionPane.showInputDialog("Rectangle: \n" + "Enter Width:");

        // Convert the String input to a double.
        height = Double.parseDouble(input);
    }
    
    public double getPerimeter(){
        double perim = 2.0 * width + 2.0 * height;
        return perim;
    }
   
     public double getArea() {
        double area = width * height;
        return area;
    }
   
    public void printInfo() {
        JOptionPane.showMessageDialog(null, "Rectangle: \n" 
                                          + "Base: " + width + "\n"
                                          + "Height: " + height + "\n" 
                                          + "Perimeter: " + getPerimeter() + "\n"
                                          + "Area: " + getArea());
   }
}