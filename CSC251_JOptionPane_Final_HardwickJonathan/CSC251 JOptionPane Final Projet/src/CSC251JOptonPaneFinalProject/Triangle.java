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

    public void setWidth(double userWidth) {
        width = userWidth;
    }

    public void setHeight(double userHeight) {
        height = userHeight;
    }

    public void setSide1(double userSide1) {
        s1 = userSide1;
    }

    public void setSide2(double userSide2) {
        s2 = userSide2;
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

        System.out.print("Triangle: ");
        System.out.printf("Base: %.2f\n", width);
        System.out.printf("Height: %.2f\n", height);
        System.out.printf("Area: %.2f\n", getArea());

        JOptionPane.showMessageDialog(null, "Triangle\n" + "Base: " + width + "\n"
                + "Height: " + height + "\n" + "S1: " + s1 + "\n" + "S2: " + s2 + "\n" 
                + "Perimeter: " + getPerimeter() + "\n" + "Area: " + getArea());
    }

    public void main() {
        String input;
        double height;
        double width;
        double area;
        double s1;
        double s2;
        double perim;

        // Prompt user to input length.
        input = JOptionPane.showInputDialog("Enter Width:");

        // Convert the String input into an int.
        width = Double.parseDouble(input);

        // Prompt user to input width.
        input = JOptionPane.showInputDialog("Enter Height: ");

        // Convert the String input to an int.
        height = Double.parseDouble(input);

        // Calculate area of the rectangle.
        area = height * width;

        // Prompt user to input s1 length.
        input = JOptionPane.showInputDialog("Enter S1 length: ");
        s1 = Double.parseDouble(input);

        // Prompt user to input s2 length.
        input = JOptionPane.showInputDialog("Enter S2 length: ");
        s2 = Double.parseDouble(input);

        // Calculate the perimeter.
        perim = s1 + s2 + width;

        // Display the information
        JOptionPane.showMessageDialog(null, "Triangle\n" + "Base: " + width + "\n"
                + "Height: " + height + "\n" + "S1: " + s1 + "S2: " + s2 + 
                "Area: " + area);
    }
}
