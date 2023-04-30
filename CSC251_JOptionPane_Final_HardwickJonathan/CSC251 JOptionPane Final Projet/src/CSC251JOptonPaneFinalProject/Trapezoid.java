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
public class Trapezoid {

    private double b1;      // base 1
    private double b2;      // base 2
    private double height;  // height
    private double s1;      // slanted side 1
    private double s2;      // slanted side 2

    public void setBase1(double userBase1) {
        b1 = userBase1;
    }
    
    public void setBase2(double userBase2) {
        b2 = userBase2;
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
        double perim = s1 + s2 + b1 + b2;
        return perim;
    }

    public double getArea() {
        double area = 0.5 * height * (b1 + b2);
        return area;
    }

    public void printInfo() {
        JOptionPane.showMessageDialog(null, "Trapezoid: \n"
                                          + "Base 1:    " + b1 + "\n"
                                          + "Base 2:    " + b2 + "\n"
                                          + "Height:    " + height + "\n"
                                          + "Side 1:    " + s1 + "\n"
                                          + "Side 2:    " + s2 + "\n"
                                          + "Perimeter: " + getPerimeter() + "\n"
                                          + "Area:      " + getArea());
    }
}
