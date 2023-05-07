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
                    JOptionPane.showMessageDialog(null, "Shape:  " + shapeInput.toUpperCase());
                    
                    // Create a Square shape object.
                    Square square = new Square();
                    
                    // Pass the width to the appropriate class
                    square.setSide();

                    /// Calculate and display area and perimeter of the
                    // selected shape.
                    square.printInfo();
                    
                    // Since the user entered a valid shape type the loop does 
                    // not need to continue.
                    cont = false;
                    
                    // Break out of the switch statement.
                    break;
                    
                case "rectangle":
                    JOptionPane.showMessageDialog(null, "Shape:  " + shapeInput.toUpperCase());
                    
                    // Create a Rectangle shape object.
                    Rectangle rect = new Rectangle();
                    
                    // Pass the width to the appropriate class
                    rect.setWidth();
                    
                    // Pass the length to the appropriate class
                    rect.setLength();

                    // Calculate and display area and perimeter of the
                    // selected shape.
                    rect.printInfo();
                    
                    // Since the user entered a valid shape type the loop does 
                    // not need to continue.
                    cont = false;
                    
                    // Break out of the switch statement.
                    break;
                    
                case "parallelogram":
                    JOptionPane.showMessageDialog(null, "Shape:  " + shapeInput.toUpperCase());
                    
                    // Create a Parallelogram shape object.
                    Parallelogram para = new Parallelogram();
                    
                    // Pass the width to the appropriate class
                    para.setWidth();
                    
                    // Pass the length to the appropriate class
                    para.setLength();
                    
                    // Pass the height to the appropriate class
                    para.setHeight();

                    // Calculate and display area and perimeter of the
                    // selected shape.
                    para.printInfo();
                    
                    // Since the user entered a valid shape type the loop does 
                    // not need to continue.
                    cont = false;
                    
                    // Break out of the switch statement.
                    break;
                    
                case "trapezoid":
                    JOptionPane.showMessageDialog(null, "Shape:  " + shapeInput.toUpperCase());
                    
                    // Create a Trapezoid shape object.
                    Trapezoid trap = new Trapezoid();
                    
                    // Pass the width to the appropriate class
                    trap.setBase1();
                    
                    // Pass the length to the appropriate class
                    trap.setBase2();
                    
                    // Pass the height to the appropriate class
                    trap.setSide1();
                    
                    // Pass the height to the appropriate class
                    trap.setSide2();
                    
                    // Pass the height to the appropriate class
                    trap.setHeight();

                    // Calculate and display area and perimeter of the
                    // selected shape.
                    trap.printInfo();
                    
                    // Since the user entered a valid shape type the loop does 
                    // not need to continue.
                    cont = false;
                    
                    // Break out of the switch statement.
                    break;
                    
                case "triangle":
                    JOptionPane.showMessageDialog(null, "Shape:  " + shapeInput.toUpperCase());
                    
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

                    // Calculate and display area and perimeter of the
                    // selected shape.
                    triangle.printInfo();
                    
                    // Since the user entered a valid shape type the loop does 
                    // not need to continue.
                    cont = false;
                    
                    // Break out of the switch statement.
                    break;
                    
                case "circle":
                    JOptionPane.showMessageDialog(null, "Shape:  " + shapeInput.toUpperCase());
                    
                    // Create a Circle shape object.
                    Circle circle = new Circle();
                    
                    // Pass the radius to the appropriate class
                    circle.setRadius();

                    // Calculate and display area and perimeter of the
                    // selected shape.
                    circle.printInfo();
                    
                    // Since the user entered a valid shape type the loop does 
                    // not need to continue.
                    cont = false;
                    
                    // Break out of the switch statement.
                    break;
                    
                case "rectangular solid":
                    JOptionPane.showMessageDialog(null, "Shape:  " + shapeInput.toUpperCase());
                    
                    // Create a RectangularSolid shape object.
                    RectangularSolid rectsolid = new RectangularSolid();
                    
                    // Pass the width to the appropriate class
                    rectsolid.setWidth();
                    
                    // Pass the length to the appropriate class
                    rectsolid.setLength();
                    
                    // Pass the height to the appropriate class
                    rectsolid.setHeight();

                    // Calculate and display volume and surface area of 
                    // selected shape.
                    rectsolid.printInfo();
                    
                    // Since the user entered a valid shape type the loop does 
                    // not need to continue.
                    cont = false;
                    
                    // Break out of the switch statement.
                    break;
                    
                case "cube":
                    JOptionPane.showMessageDialog(null, "Shape:  " + shapeInput.toUpperCase());
                    
                    // Create a Cube shape object.
                    Cube cube = new Cube();
                    
                    // Pass the side length to the appropriate class
                    cube.setSide();

                    // Calculate and display volume and surface area of 
                    // selected shape.
                    cube.printInfo();
                    
                    // Since the user entered a valid shape type the loop does 
                    // not need to continue.
                    cont = false;
                    
                    // Break out of the switch statement.
                    break;
                    
                case "right circular cylinder":
                    JOptionPane.showMessageDialog(null, "Shape:  " + shapeInput.toUpperCase());
                    
                    // Create a RightCircularCylinder shape object.
                    RightCircularCylinder rtcircyl = new RightCircularCylinder();
                    
                    // Pass the height to the appropriate class
                    rtcircyl.setHeight();
                    
                    // Pass the radius to the appropriate class
                    rtcircyl.setRadius();
                    
                    // Calculate and display volume and surface area of 
                    // selected shape.
                    rtcircyl.printInfo();
                    
                    // Since the user entered a valid shape type the loop does 
                    // not need to continue.
                    cont = false;
                    
                    // Break out of the switch statement.
                    break;
                    
                case "sphere":
                    JOptionPane.showMessageDialog(null, "Shape:  " + shapeInput.toUpperCase());
                    
                    // Create a Sphere shape object.
                    Sphere sphere = new Sphere();
                    
                    // Pass the radius to the appropriate class
                    sphere.setRadius();
                    
                    // Calculate and display volume and surface area of 
                    // selected shape.
                    sphere.printInfo();
                    
                    // Since the user entered a valid shape type the loop does 
                    // not need to continue.
                    cont = false;
                    
                    // Break out of the switch statement.
                    break;
                    
                case "right circular cone":
                    JOptionPane.showMessageDialog(null, "Shape:  " + shapeInput.toUpperCase());
                    
                    // Create a RightCircularCone shape object.
                    RightCircularCone rtcircone = new RightCircularCone();
                    
                    // Pass the radius to the appropriate class
                    rtcircone.setRadius();
                    
                    // Pass the height to the appropriate class
                    rtcircone.setHeight();
                    
                    // Calculate and display volume and surface area of 
                    // selected shape.
                    rtcircone.printInfo();
                    
                    // Since the user entered a valid shape type the loop does 
                    // not need to continue.
                    cont = false;
                    
                    // Break out of the switch statement.
                    break;
                    
                case "square or rectangular pyramid":
                    JOptionPane.showMessageDialog(null, "Shape:  " + shapeInput.toUpperCase());
                    
                    // Create a RectangularPyramid shape object.
                    RectangularPyramid pyramid = new RectangularPyramid();
                    
                    // Pass the width to the appropriate class
                    pyramid.setWidth();
                    
                    // Pass the height to the appropriate class
                    pyramid.setHeight();
                    
                    // Pass the length to the appropriate class
                    pyramid.setLength();
                    
                    // Calculate and display volume and surface area of 
                    // selected shape.
                    pyramid.printInfo();
                    
                    // Since the user entered a valid shape type the loop does 
                    // not need to continue.
                    cont = false;
                    
                    // Break out of the switch statement.
                    break;
                    
                case "right circular cone frustum":
                    JOptionPane.showMessageDialog(null, "Shape:  " + shapeInput.toUpperCase());
                    
                    // Create a RightCircularCone shape object.
                    RightCircularConeFrustum truncCone = new RightCircularConeFrustum();
                    
                    // Pass the minor radius to the appropriate class
                    truncCone.setMinorRadius();
                    
                    // Pass the major radius to the appropriate class
                    truncCone.setMajorRadius();
                    
                    // Pass the height to the appropriate class
                    truncCone.setHeight();
                    
                    // Pass the slant length to the appropriate class
                    truncCone.setSide();
                    
                    // Calculate and display volume and surface area of the
                    // selected shape.
                    truncCone.printInfo();
                    
                    // Since the user entered a valid shape type the loop does 
                    // not need to continue.
                    cont = false;
                    
                    // Break out of the switch statement.
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
