/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author joseb
 */
public class Trapezoid extends Quadrilateral{

    private double high;
    
    public Trapezoid(double MayorBase, double MinorBase, double side3, double side4, double high) {
        super(MayorBase, MinorBase, side3, side4);
        this.high=high;
    }

    @Override
    public void calculateArea() {
        double a= ((this.getSide1()+this.getSide2())*this.getHigh())/2;
        this.setArea(a);
    }

    public double getHigh() {
        return high;
    }
    
    @Override
    public void buildId() {
        this.setId("Trapezoid");
    }

}
