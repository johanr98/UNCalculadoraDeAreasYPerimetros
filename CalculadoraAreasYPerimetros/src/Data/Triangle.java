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
public abstract class Triangle extends Shape{

    private double side1;
    private double side2;
    private double side3;
    private double high;

    public Triangle(double side1, double side2, double side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    
    @Override
    void calculatePerimeter() {
        double p= this.side1 + this.side2+ this.side3;
        this.setPerimeter(p);
    }
    
    @Override
    void calculateArea() {
        double a= (this.side1 * this.high)/2;
        this.setArea(a);
    }
    
    abstract void buildId();
    
}
