/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSC251JOptonPaneFinalProject;

import static CSC251JOptonPaneFinalProject.Triangle.icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * CSC 251 JOptionPane Final Project
 * Jonathan Hardwick
 * 2023/05/07
 */
public class Circle {

    private double r;       // radius
    private String input;   // user input
    static ImageIcon icon = new ImageIcon("parallelogram.png");

    public void setRadius() {
        // Prompt user to input radius.
        input = JOptionPane.showInputDialog("Circle: \n" + "Enter Radius:");

        // Convert the String input to a double.
        r = Double.parseDouble(input);
    }

    public double getCircumference() {
        double circumf = 2.0 * Math.PI * r;
        return circumf;
    }

    public double getArea() {
        //May want to look for a way to use the Math.pow(width,2) function
        double area = Math.PI * Math.pow(r, 2.0);
        return area;
    }

    public void printInfo() {

        JOptionPane.showMessageDialog(null, "Circle: \n"
                                          + "Radius:     " + r + "\n"
                                          + "Circumference: " + getCircumference() + "\n"
                                          + "Area:      " + getArea(),"Triangle",
                                          JOptionPane.INFORMATION_MESSAGE, icon);
    }
}
