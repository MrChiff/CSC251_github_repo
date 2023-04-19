package CSC251JOptonPaneFinalProject;

/*
 * CSC 251 JOptionPane Final Project
 * Jonathan Hardwick
 * 2023/05/07
 */

/*import javax.swing.JOptionPane; // Needed for Dialog Box

import java.util.Scanner;

public class GeometricArea {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      Triangle triangle1 = new Triangle();
      Triangle triangle2 = new Triangle();

      // TODO: Read and set base and height for triangle1 (use setBase() and setHeight())
      triangle1.setBase(scnr.nextDouble()); 
      triangle1.setHeight(scnr.nextDouble());
      
      // TODO: Read and set base and height for triangle2 (use setBase() and setHeight())
      triangle2.setBase(scnr.nextDouble()); 
      triangle2.setHeight(scnr.nextDouble());
      
      System.out.println("Triangle with smaller area:");
      
      // TODO: Determine smaller triangle (use getArea())
      //       and output smaller triangle's info (use printInfo())
      if (triangle1.getArea() < triangle2.getArea()){triangle1.printInfo();}
      else {triangle2.printInfo();}
      
   }
}*/

import javax.swing.JOptionPane; // Needed for Dialog Box

/**
 * This program finds the area of a rectangle using input output dialog box.
 * 
 */
public class GeometricArea {

    public static void main(String[] args) {
        String input; // To hold String input.
        double height;   // To hold length.
        double width;    // To hold width.
        //int area;     // To hold area.
        
        Triangle triangle = new Triangle();
        
        // Prompt user to input length.
        input = JOptionPane.showInputDialog("Enter Height");
        
        // Convert the String input into an double.
        height = Double.parseDouble(input);
        triangle.setHeight(height); 
        
        
        // Prompt use to input width.
        input = JOptionPane.showInputDialog("Enter Width");
        
        // Convert the String input to an double.
        width = Double.parseDouble(input);
        triangle.setWidth(width);
        
        //The area is calculated in each of the shape classes
        
        // Display area of selected shape.
        JOptionPane.showMessageDialog(null, "Area of the triangle is " + triangle.getArea() );
        
    }
    
}