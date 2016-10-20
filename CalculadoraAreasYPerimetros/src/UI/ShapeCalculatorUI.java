/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.util.Scanner;
import Data.Shape;

/**
 *
 * @author joseb
 */
public class ShapeCalculatorUI {

    public static void printWelcome() {
        System.out.println("Welcome to the Area and Perimeter Shape Calculator");
    }

    public static void printShapeOptions() {
        System.out.println("");
        System.out.println("Options :");
        System.out.println("1. Triangle");
        System.out.println("2. Circle");
        System.out.println("3. Cuadrilateral");
        System.out.print("Your option : ");
    }
    
    public static void printTriangleOptions() {
        System.out.println("");
        System.out.println("Options :");
        System.out.println("1. Escalene");
        System.out.println("2. Equilateral");
        System.out.println("3. Isosceles");
        System.out.print("Your option : ");
    }
    
    public static void printCircleOptions() {
        System.out.println("");
        System.out.println("Options :");
        System.out.println("1. Circle");
        System.out.println("2. Semicirlce");
        System.out.print("Your option : ");
    }
    
    public static void printCuadrilateralOptions() {
        System.out.println("");
        System.out.println("Options :");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Trapezoid");
        System.out.print("Your option : ");
    }

    public static void printRepeat() {
        System.out.println("");
        System.out.println("Input a number 4 if you want to exit from the app");
        System.out.println("and any other number higher than 4 to repeat the whole menu.");
        System.out.print("Your option: ");
    }

    public static double printInputBase(int n) {
        System.out.println("");
        switch (n) {
            case 0:
                System.out.print("Input the base : ");
                break;
            case 1:
                System.out.print("Input the mayor base : ");
                break;
            case 2:
                System.out.print("Input the minor base : ");
                break;
        }
        return leerDouble();
    }

    public static double printInputAltura() {
        System.out.println("");
        System.out.print("Input the high : ");
        return leerDouble();
    }

    public static double printInputRadio() {
        System.out.println("");
        System.out.print("Input the radio : ");
        return leerDouble();
    }

    public static double printInputLado(int n) {
        System.out.println("");
        switch (n) {
            case 0:
                System.out.print("Input the side : ");
                break;
            default:
                System.out.print("Input the side number " + n + " : ");
        }
        return leerDouble();
    }
    
    public static void printShapeAreaAndPerimeter(Shape a){
        System.out.println(a);
    }
    
    public static int leerInt() {
        return Integer.parseInt(leerString());
    }

    public static double leerDouble() {
        return Double.parseDouble(leerString());
    }

    public static String leerString() {
        Scanner dto = new Scanner(System.in);
        return dto.nextLine();
    }
}
