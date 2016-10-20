/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author johanr98 jsromerod@unal.edu.co
 */
public class Isosceles extends Triangle{
    
    public Isosceles(double side1and2, double side3) {
        super(side1and2, side1and2, side3);
        this.buildId();
    }
    
    @Override
    public void buildId() {
        this.setId("Isosceles triangle");
    }

    @Override
    public void calculateArea() {
        double area = Math.sqrt((Math.pow(this.getSide1(), 2)
                - (Math.pow(this.getSide3(), 2)) / 4)) * this.getSide3() / 2;
        this.setArea(area);
    }
    
}
