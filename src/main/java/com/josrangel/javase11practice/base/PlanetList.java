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
public class PlanetList {

    public static void main(String[] args) {
        for (Planet p : Planet.values()) {
            System.out.println(p.getDistance());
        }
    }
    
    public enum Planet {
        MERCURY(0.39), VENUS(), EARTH;
        private double distanceFromSunAU = 1.0;
        
        private Planet(double distance) {
            distanceFromSunAU = distance;
        }
        
        private Planet() {
            distanceFromSunAU = 5.0;
        }

        public double getDistance() {
            return distanceFromSunAU;
        }
    }
}

