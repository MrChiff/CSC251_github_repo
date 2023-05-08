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
public class RightCircularCylinder {
    private double r;   // radius
    private double h;   // height
    private String input;
    static ImageIcon icon = new ImageIcon("parallelogram.png");

    public void setRadius() {
        // Prompt user to input radius.
        input = JOptionPane.showInputDialog("Right Circular Cylinder: \n" + "Enter Radius:");

        // Convert the String input to a double.
        r = Double.parseDouble(input);
    }
    public void setHeight() {
        // Prompt user to input height.
        input = JOptionPane.showInputDialog("Right Circular Cylinder: \n" + "Enter Height:");

        // Convert the String input to a double.
        h = Double.parseDouble(input);
    }
    public double getSurfaceArea(){
        double surfaceArea = 2.0 * Math.PI * (r * h + Math.pow(r,2.0));
        return surfaceArea;
    }

    public double getVolume() {
        //May want to look for a way to use the Math.pow(width,2) function
        double volume = Math.PI * Math.pow(r, 2.0) * h;
        return volume;
    }

    public void printInfo() {

        JOptionPane.showMessageDialog(null, "Right Circular Cylinder: \n"
                                          + "Radius:     " + r + "\n"
                                          + "Height:     " + h + "\n"
                                          + "Surface Area: " + getSurfaceArea() + "\n"
                                          + "Volume:      " + getVolume(),"Triangle",
                                          JOptionPane.INFORMATION_MESSAGE, icon);
    }
    
}
