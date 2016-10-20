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
public class Equilateral extends Triangle {

    public Equilateral(double side) {
        super(side, side, side);
        this.buildId();
    }

    @Override
    public void buildId() {
        this.setId("Equilateral triangle");
    }

    @Override
    public void calculateArea() {
        double altura = Math.sqrt(Math.pow(this.getSide1(), 2)
                - Math.pow((this.getSide3() / 2), 2));
        double area = this.getSide3() * altura / 2;
        this.setArea(area);
    }

}
