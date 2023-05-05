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
        
        boolean cont = true;  // Default state is to continue the program. 

        while (cont != false) {
            
            switch (shapeInput) {

                case "square":
                    JOptionPane.showMessageDialog(null, "Shape:  " + shapeInput);
                    // Create a triangle shape object.
                    Square square = new Square();
                    

                    // Pass the width to the appropriate class
                    square.setSide();

                    // The area is calculated for a triangle.
                    // Display area of selected shape.
                    square.printInfo();
                    
                    // Since the user entered a valid shape type the loop does 
                    // not need to continue.
                    cont = false;
                    
                    // Break out of the switch statement.
                    break;
                    
                case "rectangle":
                    JOptionPane.showMessageDialog(null, "Shape:  " + shapeInput);
                    cont = false;
                    break;
                case "parallelogram":
                    JOptionPane.showMessageDialog(null, "Shape:  " + shapeInput);
                    cont = false;
                    break;
                case "trapezoid":
                    JOptionPane.showMessageDialog(null, "Shape:  " + shapeInput);
                    cont = false;
                    break;
                case "triangle":
                    
                    // Create a triangle shape object.
                    Triangle triangle = new Triangle();
                    
                    // Call the class to set the height.
                    triangle.setHeight();

                    // Call the class to set the width.
                    triangle.setWidth();
                    
                    // Call the class to set the s1 value.
                    triangle.setSide1();
                    
                    // Call the class to set the s2 value.
                    triangle.setSide2();

                    // The area and perimeter are calculated for a triangle
                    // inside the triangle class.
                    
                    // Display the calculated properties of the selected shape.
                    triangle.printInfo();
                    
                    // Since the user entered a valid shape type the loop does 
                    // not need to continue.
                    cont = false;
                    
                    // Break out of the switch statement.
                    break;
                    
                case "circle":
                    JOptionPane.showMessageDialog(null, "Shape:  " + shapeInput);
                    cont = false;
                    break;
                case "rectangular solid":
                    JOptionPane.showMessageDialog(null, "Shape:  " + shapeInput);
                    cont = false;
                    break;
                case "cube":
                    JOptionPane.showMessageDialog(null, "Shape:  " + shapeInput);
                    cont = false;
                    break;
                case "right circular cylinder":
                    JOptionPane.showMessageDialog(null, "Shape:  " + shapeInput);
                    cont = false;
                    break;
                case "sphere":
                    JOptionPane.showMessageDialog(null, "Shape:  " + shapeInput);
                    cont = false;
                    break;
                case "right circular cone":
                    JOptionPane.showMessageDialog(null, "Shape:  " + shapeInput);
                    cont = false;
                    break;
                case "square or rectangular pyramid":
                    JOptionPane.showMessageDialog(null, "Shape:  " + shapeInput);
                    cont = false;
                    break;
                case "right circular cone frustum":
                    JOptionPane.showMessageDialog(null, "Shape:  " + shapeInput);
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
