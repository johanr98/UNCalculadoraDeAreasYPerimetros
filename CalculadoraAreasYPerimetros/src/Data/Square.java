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
public class Square extends Cuadrilateral{

    public Square(double side) {
        super(side,side,side,side); 
    }

    @Override
    void calculateArea() {
        double a = this.getSide1() * this.getSide1();
        this.setArea(a);
    }
    
}
