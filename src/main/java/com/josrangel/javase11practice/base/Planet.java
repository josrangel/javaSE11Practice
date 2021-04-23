/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.josrangel.javase11practice.base;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.function.Function;

/**
 *
 * @author josra
 */
public class Planet {
    private BigDecimal milesFromSun;

    public Planet(String milesFromSun) {
        this.milesFromSun = new BigDecimal(milesFromSun);
    }
    public BigDecimal getMilesFromSun(){
        return milesFromSun;
    }
    public static BigDecimal milesToKilometers(BigDecimal miles) {
        BigDecimal scale = new BigDecimal("1.60934");
        return miles.multiply(scale);
    }
    
    public static void main(String[] args) {
        Planet earth = new Planet("93000000");
        //line n1
        Function<BigDecimal, BigDecimal> lambda = Planet::milesToKilometers;
        //Function<Planet, BigDecimal> lambda = Planet::milesToKilometers;
    }
    
}
