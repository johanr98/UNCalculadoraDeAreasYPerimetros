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
public abstract class Cuadrilateral extends Shape{
    
    private double side1;
    private double side2;
    private double side3;
    private double side4;

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getSide4() {
        return side4;
    }

    public Cuadrilateral(double side1, double side2, double side3, double side4){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
        this.side4=side4;
    }
    
    @Override
    void calculatePerimeter() {
        double p= this.side1 + this.side2+ this.side3+this.side4;
        this.setPerimeter(p);
    }
    
    abstract void buildId();
   
}
