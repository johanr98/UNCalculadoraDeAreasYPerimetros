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
public class Perimetro {

    public static double perimetroTriangulo(Triangle a) {
        return a.getBase() + a.getLado2() + a.getLado3();
    }

    public static double perimetroCuadrado(Square a) {
        return 4.0 * a.getLado();
    }

    public static double perimetroRectangulo(Rectangle a) {
        return (2 * a.getBase()) + (2 * a.getAltura());
    }

    public static double perimetroCirculo(Circle a) {
        return 2 * Math.PI * a.getRadio();
    }

    public static double perimetroTrapecio(Trapezoid a) {
        return a.getBaseMayor() + a.getBaseMenor() + a.getLado1() + a.getLado2();
    }

    public static Square llenarCuadrado() {
        return Area.llenarCuadrado();
    }

    public static Circle llenarCirculo() {
        return Area.llenarCirculo();
    }

    public static Rectangle llenarRectangulo() {
        return Area.llenarRectangulo();
    }

    public static Triangle llenarTriangulo() {
        UI.printInputLado(1);
        double lado1 = Input.leerDouble();
        UI.printInputLado(2);
        double lado2 = Input.leerDouble();
        UI.printInputLado(3);
        double lado3 = Input.leerDouble();
        return new Triangle(lado1, lado2, lado3);
    }

    public static Trapezoid llenarTrapecio() {
        UI.printInputBase(1);
        double baseMayor = Input.leerDouble();
        UI.printInputBase(2);
        double baseMenor = Input.leerDouble();
        UI.printInputLado(1);
        double lado1 = Input.leerDouble();
        UI.printInputLado(2);
        double lado2 = Input.leerDouble();
        return new Trapezoid(baseMayor, baseMenor, lado1, lado2);
    }
}
