/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSC251JOptonPaneFinalProject;

/**
 *
 * @author Jonathan
 */
public class Parallelogram {
   private double width;
   private double height;
   private double length;
   //private double s2;
   
   public void setWidth(double userWidth){
      width = userWidth;
   }
   public void setHeight(double userHeight) {
      height = userHeight;
   }
   public void setLength(double userLength) {
      length = userLength;
   } 
 
   public double getPerimeter(){
        double perim = width + s1 + s2;
        return perim;
    }
   
   
   public double getArea() {
      double area = 0.5 * width * height;
      return area;
   }
   
   public void printInfo() {
      System.out.printf("Base: %.2f\n", width);
      System.out.printf("Height: %.2f\n", height);
      System.out.printf("Area: %.2f\n", getArea());
   }
    
}
