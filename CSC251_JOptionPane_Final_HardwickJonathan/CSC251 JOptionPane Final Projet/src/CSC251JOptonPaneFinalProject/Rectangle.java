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
public class Rectangle {
    private double width;
    private double height;
   
    public void setWidth(double userWidth){
        width = userWidth;
    }
    public void setHeight(double userHeight) {
        height = userHeight;
    }
    
    public double getPerimeter(){
        double perim = 2 * width + 2 * height;
        return perim;
    }
   
     public double getArea() {
        double area = width * height;
        return area;
    }
   
    public void printInfo() {
        System.out.printf("Base: %.2f\n", width);
        System.out.printf("Height: %.2f\n", height);
        System.out.printf("Area: %.2f\n", getArea());
   }
}