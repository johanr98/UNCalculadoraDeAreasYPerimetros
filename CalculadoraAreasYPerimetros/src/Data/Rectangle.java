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
public class Rectangle extends Cuadrilateral {

    public Rectangle(double base, double high) {
        super(base, high, base, high);
    }

    @Override
    void calculateArea() {
        double a = this.getSide1() * this.getSide2();
        this.setArea(a);
    }

    @Override
    void buildId() {
        this.setId("Rectangle");
    }

}
