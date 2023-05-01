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
public class Parallelogram {

    private double width;
    private double height;
    private double length;

    public void setWidth(double userWidth) {
        width = userWidth;
    }

    public void setHeight(double userHeight) {
        height = userHeight;
    }

    public void setLength(double userLength) {
        length = userLength;
    }

    public double getPerimeter() {
        double perim = 2.0 * (width + length);
        return perim;
    }

    public double getArea() {
        double area = length * height;
        return area;
    }

    public void printInfo() {
        JOptionPane.showMessageDialog(null, "Parallelogram: \n"
                                          + "Base:      " + width + "\n"
                                          + "Height:    " + height + "\n"
                                          + "Length:    " + length + "\n"
                                          + "Perimeter: " + getPerimeter() + "\n"
                                          + "Area:      " + getArea());
    }
}
