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

    private double base;
    private double lado2;
    private double lado3;
    private double altura;

    public Triangle(double lado1, double lado2, double lado3) {
        this.base = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public Triangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public double getAltura() {
        return altura;
    }

}
