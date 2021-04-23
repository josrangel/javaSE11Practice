/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.josrangel.javase11practice.streamandlambda;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author josra
 */
public class StreamNames {
    public static void main(String[] args) {
        Optional name = pickName();
    }
    //String
    static Optional pickName(){
        List names = List.of("Barclay", "Barry", "Bert");
        /* Line 1 */
        return names.stream()
                .filter(n -> n.contains("Bart"))
                .findAny()
                /*line 2*/
                //.orElse("Not Found")
                ;
    }
}