/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSC251JOptonPaneFinalProject;


import javax.swing.*;
import java.awt.*;

/**
 *
 * @author mr.chiff
 */
public class Square {
    private double s;
    private String input;
    
    //private String[] columnHeadings;      // Stores the table's column headings
    //private String[][] tableVals;         // Stores the table's values
    private JTable layoutTable;        // Table of array values
   
    public void setSide(){
        // Prompt user to input side length.
        input = JOptionPane.showInputDialog(null,"Enter Side Length:", "Square", 
                JOptionPane.QUESTION_MESSAGE);

        // Convert the String input to a double.
        s = Double.parseDouble(input);
    }
    
    public double getPerimeter(){
        double perim = 4.0 * s;
        return perim;
    }
    
     public double getArea() {
        double area = Math.pow(s, 2.0);
        return area;
    }
   
    public void printInfo() {
        JFrame f = new JFrame();
        f.setSize(600,800);
        f.setTitle("Square");
        // Initialize column heading(s)
        String[] columnHeadings = {"Square:", ""};
        //tableVals = new String[3][1];
        
        
        //columnHeadings[0] = "Square";
        Object[][] tableVals ={{"Square:",""},{"Length:", s}, {"Perimeter:", getPerimeter()},
            {"Area:", getArea()}};
        //tableVals[0][0] = "Width";
        //tableVals[1][0] = "Perimeter";
        //tableVals[2][0] = "Area";
        
        layoutTable = new JTable(tableVals, columnHeadings);
        layoutTable.setBounds(30,40,200,300);
        layoutTable.setShowGrid(false);
        //layoutTable.setFont(new Font("San Serif", Font.BOLD, 14));
        //layoutTable.setIntercellSpacing(new Dimension(0,0));
        //layoutTable.setBackground(Color.lightGray);
        
        
        
        //Create the scroll pane and add the table to it.
        //JScrollPane scrollPane = new JScrollPane(layoutTable);
        //f.add(scrollPane);
        //f.setSize(500,200);
        //f.setVisible(true);
               

        
        JOptionPane.showMessageDialog(null, "Square: \n" 
                                          + "Length:  " + String.format("    %.2f",(s)) + "\n"
                                          + "Perimeter:" + String.format("  %.2f",(getPerimeter())) + "\n" 
                                          + "Area:  " + String.format("     %.2f",(getArea())), 
                                          "Square", JOptionPane.QUESTION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, layoutTable);
        //JOptionPane.showMessageDialog(null, scrollPane);
    }
       
}
