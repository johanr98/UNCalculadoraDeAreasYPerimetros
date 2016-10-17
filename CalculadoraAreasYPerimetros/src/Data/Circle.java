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
public class Circle extends Shape{

    private double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    @Override
    public void calculateArea(){
        double a=  Math.PI * radio * radio ; 
        this.setArea(a);
    }
    
    @Override
    public void calculatePerimeter(){
        double p = 2 * Math.PI * radio ;
        this.setPerimeter(p);
    }

    public double getRadio() {
        return radio;
    }

}
