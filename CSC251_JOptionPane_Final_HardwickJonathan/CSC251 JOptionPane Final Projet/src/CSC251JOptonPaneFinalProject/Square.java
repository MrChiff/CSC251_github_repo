/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSC251JOptonPaneFinalProject;

import javax.swing.JOptionPane;

/**
 *
 * @author mr.chiff
 */
public class Square {
    private double width;
    //private double height;
   
    public void setWidth(double userWidth){
        width = userWidth;
    }
    
    public double getPerimeter(){
        double perim = 4 * width;
        return perim;
    }
    
     public double getArea() {
        //May want to look for a way to use the Math.pow(width,2) function
        double area = width * width;
        return area;
    }
   
    public void printInfo() {
        
        JOptionPane.showMessageDialog(null, "Square \n" + "Width: " + width + "\n"
                + "Perimeter: " + getPerimeter() + "\n" + "Area: " + getArea());
   }
    
}
