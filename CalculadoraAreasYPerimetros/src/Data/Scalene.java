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
public class Scalene extends Triangle {

    public Scalene(double side1, double side2, double side3) {
        super(side1, side2, side3);
        this.buildId();
    }

    @Override
    public void buildId() {
        this.setId("Scalene triangle");
    }

    @Override
    public void calculateArea() {

        double semiperimetro = (this.getSide1() + this.getSide2()
                + this.getSide3()) / 2;
        double area = Math.sqrt(semiperimetro * (semiperimetro - this.getSide1())
                * (semiperimetro - this.getSide2()) * (semiperimetro - this.getSide3()));
        this.setArea(area);

    }

}
