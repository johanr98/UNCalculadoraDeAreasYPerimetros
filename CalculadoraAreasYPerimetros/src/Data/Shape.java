/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author johanr98 jsromerod@unal.edu.co
 */
public abstract class Shape {
    private double area;
    private double perimeter;
    private String id;
    
    abstract void calculateArea();
    
    abstract void calculatePerimeter();    

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    abstract void buildId();
    
    
    
    @Override
    public String toString(){
        return "Shape : "+this.id+"\n"+
               "Area : "+this.area+"\n"+
               "Perimeter : "+ this.perimeter;
    }
    
}
