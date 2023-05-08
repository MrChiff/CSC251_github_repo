/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSC251JOptonPaneFinalProject;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * CSC 251 JOptionPane Final Project
 * Jonathan Hardwick
 * 2023/05/07
 */
public class Circle {

    private double r;       // radius
    private String input;   // user input
    static ImageIcon icon = new ImageIcon("circle.png");
    
    public String userInput(JLabel label){
        input = String.valueOf(JOptionPane.showInputDialog(null, label, "Circle:",
                JOptionPane.INFORMATION_MESSAGE, icon, null,""));
        
        return input;
    }

    public void setRadius() {
        // Prompt user to input radius.
        JLabel label = new JLabel("Enter Radius:");
        label.setFont(new Font("Arial", Font.BOLD, 18));

        // Convert the String input to a double.
        r = Double.parseDouble(userInput(label));
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

        JOptionPane.showMessageDialog(null, "Radius:     " + String.format("%.2f",(r)) + "\n"
                                          + "Circumference: " + String.format("%.2f",(getCircumference())) + "\n"
                                          + "Area:      " + String.format("%.2f",(getArea())),"Circle",
                                          JOptionPane.INFORMATION_MESSAGE, icon);
    }
}
