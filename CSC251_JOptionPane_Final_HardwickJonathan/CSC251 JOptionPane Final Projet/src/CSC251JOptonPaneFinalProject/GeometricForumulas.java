package CSC251JOptonPaneFinalProject;

/*
 * CSC 251 JOptionPane Final Project
 * Jonathan Hardwick
 * 2023/05/07
 */
import java.util.*;
import javax.swing.*;
import javax.swing.ImageIcon;

/**
 * This program finds the area of a rectangle using input output dialog box.
 *
 */

/*Like TODO:  Add pictures instead of text for the main menu.*/

public class GeometricForumulas {
    static ImageIcon icon = new ImageIcon("allshapes.png");
    public static int getShapeType(){
        int shapeType = -1;
        Object userInput;
        
        String categories[] ={"Choose a shape:",
                            "1. Square",          "2. Rectangle",            "3. Parallelogram", 
                            "4. Trapezoid",         "5. Triangle",             "6. Circle",
                            "7. Rectangular Solid", "8. Cube",                 "9. Right Circular Cylinder",
                            "10. Sphere",           "11. Right Circular Cone", "12. Square or Rectangular Pyramid",
                            "13. Right Circular Cone Frustum"};
        
        userInput = JOptionPane.showInputDialog(null,icon,
                "Geometric Formulas", JOptionPane.QUESTION_MESSAGE, null, 
                categories,categories[0]);
        
        if (userInput == categories[1]){shapeType = 1;}
        else if (userInput == categories[2]){shapeType = 2;}
        else if (userInput == categories[3]){shapeType = 3;}
        else if (userInput == categories[4]){shapeType = 4;}
        else if (userInput == categories[5]){shapeType = 5;}
        else if (userInput == categories[6]){shapeType = 6;}
        else if (userInput == categories[7]){shapeType = 7;}
        else if (userInput == categories[8]){shapeType = 8;}
        else if (userInput == categories[9]){shapeType = 9;}
        else if (userInput == categories[10]){shapeType = 10;}
        else if (userInput == categories[11]){shapeType = 11;}
        else if (userInput == categories[12]){shapeType = 12;}
        else if (userInput == categories[13]){shapeType = 13;}
        else {System.exit(0);}
        
        return shapeType;
    }

    public static void getShape(int shapeInput) {
        
        boolean cont = true;  // Default state is to continue the program. 

        while (cont != false) {
            
            switch (shapeInput) {

                case 1:
                    // Square
                    JOptionPane.showMessageDialog(null, "Shape:  Square");
                    
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
                    
                case 2:
                    // rectangle
                    JOptionPane.showMessageDialog(null, "Shape:  Rectangle");
                    
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
                    
                case 3:
                    // parallelogram
                    JOptionPane.showMessageDialog(null, "Shape:  Parallelogram");
                    
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
                    
                case 4:
                    // trapezoid
                    JOptionPane.showMessageDialog(null, "Shape:  Trapezoid");
                    
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
                    
                case 5:
                    JOptionPane.showMessageDialog(null, "Shape:  Triangle");
                    
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
                    
                case 6:
                    JOptionPane.showMessageDialog(null, "Shape:  Circle");
                    
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
                    
                case 7:
                    JOptionPane.showMessageDialog(null, "Shape:  Rectangular Solid");
                    
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
                    
                case 8:
                    JOptionPane.showMessageDialog(null, "Shape:  Cube");
                    
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
                    
                case 9:
                    JOptionPane.showMessageDialog(null, "Shape:  Right Circular Cylinder");
                    
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
                    
                case 10:
                    JOptionPane.showMessageDialog(null, "Shape:  Sphere");
                    
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
                    
                case 11:
                    JOptionPane.showMessageDialog(null, "Shape:  Right Circular Cone");
                    
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
                    
                case 12:
                    JOptionPane.showMessageDialog(null, "Shape:  Square or Rectangular Pyramid");
                    
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
                    
                case 13:
                    JOptionPane.showMessageDialog(null, "Shape:  Right Circular Cone Frustum");
                    
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
        int shapeType;
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
