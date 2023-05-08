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
public class RectangularPyramid {
    private String input;
    private double width;
    private double height;
    private double length;
    static ImageIcon icon = new ImageIcon("parallelogram.png");
    
    public void setWidth() {
        // Prompt user to input width.
        input = JOptionPane.showInputDialog("Rectanglar Pyramid: \n" + "Enter Width:");

        // Convert the String input to a double.
        width = Double.parseDouble(input);
    }
    public void setHeight() {
        // Prompt user to input height.
        input = JOptionPane.showInputDialog("Rectanglar Pyramid: \n" + "Enter Height:");

        // Convert the String input to a double.
        height = Double.parseDouble(input);
    }
    public void setLength() {
        // Prompt user to input length.
        input = JOptionPane.showInputDialog("Rectanglar Pyramid: \n" + "Enter Length:");

        // Convert the String input to a double.
        length = Double.parseDouble(input);
    }
    public double getVolume() {
        double volume = (1.0/3.0) * width * height * length;
        return volume;
    }
   
    public void printInfo() {
        JOptionPane.showMessageDialog(null, "Rectanglar Pyramid: \n" 
                                          + "Width: " + width + "\n"
                                          + "Height: " + height + "\n" 
                                          + "Length: " + length + "\n"
                                          + "Volume: " + getVolume(),"Triangle",
                                          JOptionPane.INFORMATION_MESSAGE, icon);
   }
    
}
