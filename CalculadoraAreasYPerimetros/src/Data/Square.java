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
public class Square extends Cuadrilateral{

    private double side;

    public Square(double lado) {
        this.side = side;
    }
    
    public void setArea(){
        this.area= side * side ;
    }
    
    public void setPerimeter(){
        this.perimeter = 4 * side;
    }

}
