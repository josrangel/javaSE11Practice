/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.josrangel.javase11practice.abstractExample;

/**
 *
 * @author josra
 */
public abstract class TestClass implements TestInterface {
    public double calculateTax(double tax){
        return 0.0;
    }
}

/*NOT COMPILE*/
/*
public abstract class TestClass implements TestInterface {
    public abstract void calculateTax() {
    }
}

public class TestClass implements TestInterface {
    public double calculateTax(double tax){
        return 10.0;
    }
}

public class TestClass implements TestInterface {
    public abstract double calculateTax();
}
*/