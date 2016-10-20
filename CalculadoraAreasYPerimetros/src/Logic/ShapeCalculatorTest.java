/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Data.*;
import UI.ShapeCalculatorUI;

/**
 *
 * @author joseb
 */
public class ShapeCalculatorTest {

    static Shape s;

    public static void main(String... args) {
        ShapeCalculatorUI.printWelcome();
        int opc;
        do {
            ShapeCalculatorUI.printShapeOptions();
            opc = ShapeCalculatorUI.leerInt();
            switch (opc) {
                case 1:
                    ShapeCalculatorUI.printTriangleOptions();
                    opc = ShapeCalculatorUI.leerInt();
                    switch (opc) {
                        case 1:
                            s=new Scalene(ShapeCalculatorUI.printInputLado(1), ShapeCalculatorUI.printInputLado(2), ShapeCalculatorUI.printInputLado(3));
                            s.calculateArea();
                            s.calculatePerimeter();
                            ShapeCalculatorUI.printShapeAreaAndPerimeter(s);
                            break;
                        case 2 :
                            s=new Equilateral(ShapeCalculatorUI.printInputLado(0));
                            s.calculateArea();
                            s.calculatePerimeter();
                            ShapeCalculatorUI.printShapeAreaAndPerimeter(s);
                            break;
                        case 3 :
                            s=new Isosceles(ShapeCalculatorUI.printInputLado(1), ShapeCalculatorUI.printInputLado(3));
                            s.calculateArea();
                            s.calculatePerimeter();
                            ShapeCalculatorUI.printShapeAreaAndPerimeter(s);
                            break;
                        case 4 :
                            break;
                    }
                    break;
                case 2:
                    ShapeCalculatorUI.printCircleOptions();
                    opc = ShapeCalculatorUI.leerInt();
                    switch (opc) {
                        case 1:
                            s= new Circle(ShapeCalculatorUI.printInputRadio());
                            s.calculateArea();
                            s.calculatePerimeter();
                            ShapeCalculatorUI.printShapeAreaAndPerimeter(s);
                            break;
                        case 2 :
                            s= new Semicircle(ShapeCalculatorUI.printInputRadio());
                            s.calculateArea();
                            s.calculatePerimeter();
                            ShapeCalculatorUI.printShapeAreaAndPerimeter(s);
                            break;
                        case 4 :
                            break;
                    }
                    break;
                case 3:
                    ShapeCalculatorUI.printCuadrilateralOptions();
                    opc = ShapeCalculatorUI.leerInt();
                    switch (opc) {
                        case 1:
                            s= new Square(ShapeCalculatorUI.printInputLado(0));
                            s.calculateArea();
                            s.calculatePerimeter();
                            ShapeCalculatorUI.printShapeAreaAndPerimeter(s);
                            break;
                        case 2 :
                            s= new Rectangle(ShapeCalculatorUI.printInputBase(0), ShapeCalculatorUI.printInputAltura());
                            s.calculateArea();
                            s.calculatePerimeter();
                            ShapeCalculatorUI.printShapeAreaAndPerimeter(s);
                            break;
                        case 3 :
                            s= new Trapezoid(ShapeCalculatorUI.printInputBase(1), ShapeCalculatorUI.printInputBase(2), ShapeCalculatorUI.printInputLado(3),ShapeCalculatorUI.printInputLado(4) , ShapeCalculatorUI.printInputAltura());
                            s.calculateArea();
                            s.calculatePerimeter();
                            ShapeCalculatorUI.printShapeAreaAndPerimeter(s);
                            break;
                        case 4 :
                            break;
                    }
                    break;
            }
            ShapeCalculatorUI.printRepeat();
            opc=ShapeCalculatorUI.leerInt();
        } while (opc > 4);

    }

}
