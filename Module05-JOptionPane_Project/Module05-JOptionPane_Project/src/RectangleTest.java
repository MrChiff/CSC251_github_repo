/*
 * CSC 251 Module 5: JOptionPane Project
 * Jonathan Hardwick
 * 2023/03/26
 */

import javax.swing.JOptionPane; // Needed for Dialog Box

/**
 * This program finds the area of a rectangle using input output dialog box.
 * 
 */
public class RectangleTest {

    public static void main(String[] args) {
        String input; // To hold String input.
        int length;   // To hold length.
        int width;    // To hold width.
        int area;     // To hold area.
        
        // Prompt user to input length.
        input = JOptionPane.showInputDialog("Enter Length");
        
        // Convert the String input into an int.
        length = Integer.parseInt(input);
        
        // Prompt use to input width.
        input = JOptionPane.showInputDialog("Enter Width");
        
        // Convert the String input to an int.
        width = Integer.parseInt(input);
        
        // Calculate area of the rectangle.
        area = length * width;
        
        // Display area of rectangle.
        JOptionPane.showMessageDialog(null, "Area of the rectangle is " + area);
    }
    
}
