/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author DITO
 */
public class Shape {
    private final String color;
    
    public Shape (String color){
        this.color = color;
    }
    @Override
    public String toString(){
        return "Shape[color=" + color +"]";
    }
    public double getArea(){
        System.err.println("Shape unknown! Cannot compute area!");
        return 0;
    }
    
    
}
