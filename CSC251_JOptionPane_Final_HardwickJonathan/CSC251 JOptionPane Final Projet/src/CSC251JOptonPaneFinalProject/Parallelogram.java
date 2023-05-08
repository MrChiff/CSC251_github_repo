/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSC251JOptonPaneFinalProject;

import static CSC251JOptonPaneFinalProject.Rectangle.icon;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * CSC 251 JOptionPane Final Project
 * Jonathan Hardwick
 * 2023/05/07
 */
public class Parallelogram {

    private double width;
    private double height;
    private double length;
    private String input;
    static ImageIcon icon = new ImageIcon("parallelogram.png");

    public void setWidth() {
        // Prompt user to input width.
        JLabel label = new JLabel("Enter Width:");
        label.setFont(new Font("Arial", Font.BOLD, 18));
        input = String.valueOf(JOptionPane.showInputDialog(null, label, "Parallelogram:",
                JOptionPane.INFORMATION_MESSAGE, icon, null,""));

        // Convert the String input to a double.
        width = Double.parseDouble(input);
    }

    public void setHeight() {
        // Prompt user to input height.
        JLabel label = new JLabel("Enter Height:");
        label.setFont(new Font("Arial", Font.BOLD, 18));
        input = String.valueOf(JOptionPane.showInputDialog(null, label, "Parallelogram:",
                JOptionPane.INFORMATION_MESSAGE, icon, null,""));

        // Convert the String input to a double.
        height = Double.parseDouble(input);
    }

    public void setLength() {
        // Prompt user to input length.
        JLabel label = new JLabel("Enter Length:");
        label.setFont(new Font("Arial", Font.BOLD, 18));
        input = String.valueOf(JOptionPane.showInputDialog(null, label, "Parallelogram:",
                JOptionPane.INFORMATION_MESSAGE, icon, null,""));

        // Convert the String input to a double.
        length = Double.parseDouble(input);
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
        JOptionPane.showMessageDialog(null, "Base:      " + width + "\n"
                                          + "Height:    " + height + "\n"
                                          + "Length:    " + length + "\n"
                                          + "Perimeter: " + getPerimeter() + "\n"
                                          + "Area:      " + getArea(),"Parallelogram",
                                          JOptionPane.INFORMATION_MESSAGE, icon);
    }
}
