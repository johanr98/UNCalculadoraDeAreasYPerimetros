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
public class Calculadora {

    static Triangulo triangulo;
    static Cuadrado cuadrado;
    static Rectangulo rectangulo;
    static Circulo circulo;
    static Trapecio trapecio;

    public static void main(String... args) {
        UI.printWelcome();
        int opc1;
        int opc2;
        double result;
        do {
            UI.printCalcOptions();
            do {
                opc1 = Input.leerInt();
                if (!(opc1 == 1 || opc1 == 2)) {
                    UI.printBoundError();
                }
            } while (!(opc1 == 1 || opc1 == 2));
            UI.printShapeOptions();
            do {
                opc2 = Input.leerInt();
                if (opc2 < 1 || opc2 > 5) {
                    UI.printBoundError();
                }
            } while (opc2 < 1 || opc2 > 5);
            result = option(opc1, opc2);
            UI.printResult(result);
            UI.printRepeat();
            opc1 = Input.leerInt();
        } while (opc1 != 4);

    }

    public static double option(int opc2, int opc1) {
        if (opc2 == 1) {
            switch (opc1) {
                case 1:
                    triangulo = Perimetro.llenarTriangulo();
                    return Perimetro.perimetroTriangulo(triangulo);
                case 2:
                    circulo = Perimetro.llenarCirculo();
                    return Perimetro.perimetroCirculo(circulo);
                case 3:
                    cuadrado = Perimetro.llenarCuadrado();
                    return Perimetro.perimetroCuadrado(cuadrado);
                case 4:
                    rectangulo = Perimetro.llenarRectangulo();
                    return Perimetro.perimetroRectangulo(rectangulo);
                case 5:
                    trapecio = Perimetro.llenarTrapecio();
                    return Perimetro.perimetroTrapecio(trapecio);
            }
        }
        if (opc2 == 2) {
            switch (opc1) {
                case 1:
                    triangulo = Area.llenarTriangulo();
                    return Area.areaTriangulo(triangulo);
                case 2:
                    circulo = Area.llenarCirculo();
                    return Area.areaCirculo(circulo);
                case 3:
                    cuadrado = Area.llenarCuadrado();
                    return Area.areaCuadrado(cuadrado);
                case 4:
                    rectangulo = Area.llenarRectangulo();
                    return Area.areaRectangulo(rectangulo);
                case 5:
                    trapecio = Area.llenarTrapecio();
                    return Area.areaTrapecio(trapecio);
            }
        }
        return 0.1;
    }

}
