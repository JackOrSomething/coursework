/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework;

/**
 *
 * @author up825579
 */
public class Pipe {
    
    int type = 0;
    int grade = 0;
    String[] colour = new String[2];
    boolean insulation = false;
    boolean reinforcement = false;
    boolean resistance = false;
    double[] costPerInch = new double[0.4, 0.6, 0.75, 0.8, 0.95];
    /*
    public Pipe(int Type, int Grade, String[] Colour, boolean Insulation, boolean Reinforcement, boolean Resistance){
        type = Type;
        grade = Grade;
        colour = Colour;
        insulation = Insulation;
        reinforcement = Reinforcement;
        resistance = Resistance;
        
    }
    */
    public double CalculatePrice(int length, int diameter){
        double radius  = diameter/2;
        
        double outerArea = Math.pow(Math.PI * radius,2);
        double innerArea = Math.pow(Math.PI*(radius*0.9), 2);
        
        double totalArea = outerArea - innerArea;
        double price = area
    }
    
    
}
