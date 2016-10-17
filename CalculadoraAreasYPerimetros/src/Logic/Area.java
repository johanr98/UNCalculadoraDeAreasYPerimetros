/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Data.*;
import UI.UI;

/**
 *
 * @author joseb
 */
public class Area {

    public static double areaTriangulo(Triangle a) {
        return (a.getAltura() * a.getBase()) / 2;
    }

    public static double areaCuadrado(Square a) {
        return a.getLado() * a.getLado();
    }

    public static double areaRectangulo(Rectangle a) {
        return a.getAltura() * a.getBase();
    }

    public static double areaCirculo(Circle a) {
        return a.getRadio() * a.getRadio() * Math.PI;
    }

    public static double areaTrapecio(Trapezoid a) {
        return ((a.getBaseMayor() + a.getBaseMenor()) * a.getAltura()) / 2;
    }

    public static Square llenarCuadrado() {
        UI.printInputLado(0);
        double lado = Input.leerDouble();
        return new Square(lado);
    }

    public static Circle llenarCirculo() {
        UI.printInputRadio();
        double radio = Input.leerDouble();
        return new Circle(radio);
    }

    public static Rectangle llenarRectangulo() {
        UI.printInputBase(0);
        double base = Input.leerDouble();
        UI.printInputAltura();
        double altura = Input.leerDouble();
        return new Rectangle(base, altura);
    }

    public static Triangle llenarTriangulo() {
        UI.printInputBase(0);
        double base = Input.leerDouble();
        UI.printInputAltura();
        double altura = Input.leerDouble();
        return new Triangle(base, altura);
    }

    public static Trapezoid llenarTrapecio() {
        UI.printInputBase(1);
        double baseMayor = Input.leerDouble();
        UI.printInputBase(2);
        double baseMenor = Input.leerDouble();
        UI.printInputAltura();
        double altura = Input.leerDouble();
        return new Trapezoid(baseMayor, baseMenor, altura);
    }
}
