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

    public static double areaTriangulo(Triangulo a) {
        return (a.getAltura() * a.getBase()) / 2;
    }

    public static double areaCuadrado(Cuadrado a) {
        return a.getLado() * a.getLado();
    }

    public static double areaRectangulo(Rectangulo a) {
        return a.getAltura() * a.getBase();
    }

    public static double areaCirculo(Circulo a) {
        return a.getRadio() * a.getRadio() * Math.PI;
    }

    public static double areaTrapecio(Trapecio a) {
        return ((a.getBaseMayor() + a.getBaseMenor()) * a.getAltura()) / 2;
    }

    public static Cuadrado llenarCuadrado() {
        UI.printInputLado(0);
        double lado = Input.leerDouble();
        return new Cuadrado(lado);
    }

    public static Circulo llenarCirculo() {
        UI.printInputRadio();
        double radio = Input.leerDouble();
        return new Circulo(radio);
    }

    public static Rectangulo llenarRectangulo() {
        UI.printInputBase(0);
        double base = Input.leerDouble();
        UI.printInputAltura();
        double altura = Input.leerDouble();
        return new Rectangulo(base, altura);
    }

    public static Triangulo llenarTriangulo() {
        UI.printInputBase(0);
        double base = Input.leerDouble();
        UI.printInputAltura();
        double altura = Input.leerDouble();
        return new Triangulo(base, altura);
    }

    public static Trapecio llenarTrapecio() {
        UI.printInputBase(1);
        double baseMayor = Input.leerDouble();
        UI.printInputBase(2);
        double baseMenor = Input.leerDouble();
        UI.printInputAltura();
        double altura = Input.leerDouble();
        return new Trapecio(baseMayor, baseMenor, altura);
    }
}
