/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author joseb
 */
public class UI {

    public static void printWelcome() {
        System.out.println("Bienvenido a la calculadora geometrica");
    }

    public static void printShapeOptions() {
        System.out.println("");
        System.out.println("Ingresa una de las siguientes opciones :");
        System.out.println("1. Triangulo");
        System.out.println("2. Circulo");
        System.out.println("3. Cuadrado");
        System.out.println("4. Rectangulo");
        System.out.println("5. Trapecio");
        System.out.print("Tu opcion : ");
    }

    public static void printCalcOptions() {
        System.out.println("");
        System.out.println("Ingresa una de las siguientes opciones :");
        System.out.println("1. Perimetro");
        System.out.println("2. Area");
        System.out.print("Tu opcion : ");
    }

    public static void printRepeat() {
        System.out.println("");
        System.out.println("Ingresa 4 si quieres salir del programa");
        System.out.println("y cualquier otro numero para hacer otro calculo.");
        System.out.print("Tu opcion : ");
    }

    public static void printResult(Double a) {
        System.out.println("El resultado es : " + a);
    }

    public static void printInputBase(int n) {
        System.out.println("");
        switch (n) {
            case 0:
                System.out.print("Ingrese la base : ");
                break;
            case 1:
                System.out.print("Ingrese la base mayor : ");
                break;
            case 2:
                System.out.print("Ingrese la base menor : ");
                break;
        }

    }

    public static void printInputAltura() {
        System.out.println("");
        System.out.print("Ingrese la altura : ");
    }

    public static void printInputRadio() {
        System.out.println("");
        System.out.print("Ingrese el radio : ");
    }

    public static void printInputLado(int n) {
        System.out.println("");
        switch (n) {
            case 0:
                System.out.print("Ingrese el lado : ");
                break;
            default:
                System.out.print("Ingrese el lado " + n + " : ");
        }
    }

    public static void printBoundError() {
        System.out.println("");
        System.out.print("Valor invalido, vuelva a ingresarlo : ");
    }
}
