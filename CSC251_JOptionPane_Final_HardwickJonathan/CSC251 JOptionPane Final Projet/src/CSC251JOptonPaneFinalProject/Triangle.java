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
public class Triangle {

    private double width;
    private double height;
    private double s1;
    private double s2;
    private String input;

    public void setWidth() {
        // Prompt user to input length.
        input = JOptionPane.showInputDialog("Triangle: \n" + "Enter Width");

        // Convert the String input into an int.
        width = Double.parseDouble(input);
    }

    public void setHeight() {
        // Prompt user to input width.
        input = JOptionPane.showInputDialog("Triangle: \n" + "Enter Height");

        // Convert the String input to an int.
        height = Double.parseDouble(input);
    }

    public void setSide1() {
        // Prompt user to input width.
        input = JOptionPane.showInputDialog("Triangle: \n" + "Enter Height");

        // Convert the String input to an int.
        s1 = Double.parseDouble(input);
    }

    public void setSide2() {
        // Prompt user to input width.
        input = JOptionPane.showInputDialog("Triangle: \n" + "Enter Height");

        // Convert the String input to an int.
        s2 = Double.parseDouble(input);
    }

    public double getPerimeter() {
        double perim = width + s1 + s2;
        return perim;
    }

    public double getArea() {
        double area = 0.5 * width * height;
        return area;
    }

    public void printInfo() {
        
        JOptionPane.showMessageDialog(null, "Triangle:\n" 
                                          + "Base: " + width + "\n"
                                          + "Height: " + height + "\n" 
                                          + "S1: " + s1 + "\n" 
                                          + "S2: " + s2 + "\n" 
                                          + "Perimeter: " + getPerimeter() + "\n" 
                                          + "Area: " + getArea());
    }
    
}
