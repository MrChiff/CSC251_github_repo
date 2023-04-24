package CSC251JOptonPaneFinalProject;

/*
 * CSC 251 JOptionPane Final Project
 * Jonathan Hardwick
 * 2023/05/07
 */

public String getShape(String shapeInput) {
     String shapeType;
     switch (shapeinput) {
         case "Monday":
             typeOfDay = "Start of work week";
             break;
         case "Tuesday":
         case "Wednesday":
         case "Thursday":
             shapetype = "Midweek";
             break;
         case "Friday":
             shapeType = "End of work week";
             break;
         case "Saturday":;
         case "Sunday":
             shapeType = "Weekend";
             break;
         default:
             throw new IllegalArgumentException("Invalid type of shape: " + dayOfWeekArg);
     }
     return shapeType;
}

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