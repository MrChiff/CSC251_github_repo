package CSC251JOptonPaneFinalProject;

/*
 * CSC 251 JOptionPane Final Project
 * Jonathan Hardwick
 * 2023/05/07
 */



import javax.swing.JOptionPane; // Needed for Dialog Box

/**
 * This program finds the area of a rectangle using input output dialog box.
 * 
 */


public class GeometricArea {
    
 
public static void getShape(String shapeInput) {
     String input; // To hold String input.
     double height;   // To hold length.
     double width;    // To hold width.
     
     switch (shapeInput) {
         case "rectangle":
             JOptionPane.showMessageDialog(null, "Shape:  " + shapeInput);
             break;
         case "square":
             JOptionPane.showMessageDialog(null, "Shape:  " + shapeInput);
             break;
         case "triangle":
              JOptionPane.showMessageDialog(null, "Shape:  " + shapeInput);
              
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
        
              //The area is calculated for a triangle.
        
              // Display area of selected shape.
              JOptionPane.showMessageDialog(null, "Area of the " + shapeInput +" is " + triangle.getArea() );
             break;
             
         default:
             JOptionPane.showMessageDialog(null, shapeInput + " is not a valid shape.");
             break;
     }
     //return shapeType;
}
    
    //public static void ()

    public static void main(String[] args) {
        
        String shapeType;
        //int area;     // To hold area.
        
        shapeType=JOptionPane.showInputDialog("Enter Shape:") ;
        
        getShape(shapeType);
    }
    
}