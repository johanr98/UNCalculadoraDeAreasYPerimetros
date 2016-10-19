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
public class Semicircle extends Circle{
    
    public Semicircle(double radio) {
        super(radio);
    }
    
    @Override
    public void calculateArea(){
        double a= (Math.PI * this.getRadio() * this.getRadio() )/2;
        this.setArea(a);
    }
    
    @Override
    public void calculatePerimeter(){
        double p= ( Math.PI * this.getRadio() ) + (2 * this.getRadio()) ;
        this.setPerimeter(p);
    }
    
    @Override
    void buildId() {
        this.setId("Semicircle");
    }
    
}
