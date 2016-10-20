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
                            
                            break;
                        case 2 :
                            
                            break;
                        case 3 :
                            
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
                            
                            break;
                        case 2 :
                            
                            break;
                        case 3 :
                            
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
                            
                            break;
                        case 2 :
                            
                            break;
                        case 3 :
                            
                            break;
                        case 4 :
                            break;
                    }
                    break;
            }
        } while (opc > 4);

    }

}
