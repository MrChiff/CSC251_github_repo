/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSC251JOptonPaneFinalProject;

/**
 *
 * @author mr.chiff
 */
public class Triangle {
   private double width;
   private double height;
   private double s1;
   private double s2;
   
   public void setWidth(double userWidth){
      width = userWidth;
   }
   public void setHeight(double userHeight) {
      height = userHeight;
   }
   
   public void setSide1(double userSide1) {
      s1 = userSide1;
   }
   
   public void setSide2(double userSide2) {
      s2 = userSide2;
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
