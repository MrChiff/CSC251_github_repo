package CSC251JOptonPaneFinalProject;

/*
 * CSC 251 JOptionPane Final Project
 * Jonathan Hardwick
 * 2023/05/07
 */
import java.util.*;
import javax.swing.JOptionPane; // Needed for Dialog Box

/**
 * This program finds the area of a rectangle using input output dialog box.
 *
 */

/*Like TODO:  Add pictures instead of text for the main menu.*/
/*TODO: - Add other shapes to the switch statement in the getShape method.  
        - Look at changing the name of the main program file to something more
          inclusive.
        */
public class GeometricArea {
    
    public static String getShapeType(){
        String shapeType;
        
        shapeType = JOptionPane.showInputDialog(null, "Choose A Shape: \n"
                    + "1. Square              " + "2. Rectangle               " + "3. Parallelogram   \n"
                    + "4. Trapezoid           " + "5. Triangle                " + "6. Circle \n"
                    + "7. Rectangular Solid   " + "8. Cube                    " + "9. Right Circular Cylinder   \n"
                    + "10. Sphere             " + "11. Right Circular Cone    " + "12. Square or Rectangular Pyramid   \n"
                    + "13. Right Circular Cone Frustum \n");
        
        shapeType = shapeType.toLowerCase();
        return shapeType;
    }

    public static void getShape(String shapeInput) {
        String input;  // To hold String input.
        double height; // To hold length.
        double width;  // To hold width.
        double s1;     // To hold side1 length.
        double s2;     // To hold side2 length.
        boolean cont = true;  // Default state is to continue the program. 

        while (cont != false) {
            
            switch (shapeInput) {

                case "square":
                    JOptionPane.showMessageDialog(null, "Shape:  " + shapeInput);
                    // Create a triangle shape object.
                    Square square = new Square();

                    // Prompt user to input length.
                    input = JOptionPane.showInputDialog("Square: \n" + "Enter Width:");

                    // Convert the String input to a double.
                    width = Double.parseDouble(input);

                    // Pass the width to the appropriate class
                    square.setWidth(width);

                    // The area is calculated for a triangle.
                    // Display area of selected shape.
                    square.printInfo();

                    cont = false;

                    break;
                    
                case "rectangle":
                    JOptionPane.showMessageDialog(null, "Shape:  " + shapeInput);
                    cont = false;
                    break;
                case "triangle":
                    // Create a triangle shape object.
                    Triangle triangle = new Triangle();

                    // Prompt user to input length.
                    input = JOptionPane.showInputDialog("Triangle: \n" + "Enter Height:");

                    // Convert the String input into a double.
                    height = Double.parseDouble(input);

                    //Pass the height to the appropriate class
                    triangle.setHeight(height);

                    // Prompt use to input width.
                    input = JOptionPane.showInputDialog("Triangle: \n" + "Enter Width");

                    // Convert the String input to a double.
                    width = Double.parseDouble(input);

                    // Pass the width to the appropriate class
                    triangle.setWidth(width);

                    // Prompt user to input s1 length.
                    input = JOptionPane.showInputDialog("Triangle: \n" + "Enter S1 length: ");

                    // Convert the string input into a double
                    s1 = Double.parseDouble(input);

                    // Pass side1 length to the triangle class.
                    triangle.setSide1(s1);

                    // Prompt user to input s2 length.
                    input = JOptionPane.showInputDialog("Triangle: \n" + "Enter S2 length: ");
                    s2 = Double.parseDouble(input);
                    triangle.setSide2(s2);

                    // The area is calculated for a triangle.
                    // Display area of selected shape.
                    triangle.printInfo();

                    cont = false;

                    break;

                default:
                    JOptionPane.showMessageDialog(null, shapeInput + " is not a valid shape.");
                    shapeInput = getShapeType();
                    break;
            }
        }
    }


    public static void main(String[] args) {
        String input;
        String shapeType;
        boolean cont = true;
        int redo = 0;

        while (redo != 1) {

            shapeType = getShapeType();

            getShape(shapeType);       

            input = JOptionPane.showInputDialog("Do you want to continue: \n"
                    + "0. Yes \n" + "1. No \n");
            redo = Integer.parseInt(input);
        }
    }

}
