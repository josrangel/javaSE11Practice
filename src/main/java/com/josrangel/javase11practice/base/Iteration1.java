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
public class Iteration1 {
    public static void main(String[] args) {
        example1();
    }
    
    static void example1(){
        int x = 0;
        int i = 0;
        while (i < 4) {
            i++;            
            if (x%3 == 0) {
                x += 3;
            }
            if (x%2 == 0) {
                x += 2;
                continue;
            }
            x++;
        }
        System.out.println(x);
    }
    
}
