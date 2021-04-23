/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.josrangel.javase11practice.base;

/**
 *
 * @author josra
 */
public class Cube extends Square{
    
    public static void main(String[] args) {
        Square shape = new Cube(1);
        System.out.println(shape.findSurfaceArea());
    }
    
    public Cube(double length) {
        super(length);
    }
    
    public double findSurfaceArea(){
        return super.findSurfaceArea() * 6;
    }
    
}