/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.josrangel.javase11practice.streamandlambda;

import java.util.Iterator;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author josra
 */
public class ListCountries {
    
    public static Function<String, String> swap = s -> {
        if (s.equals("Australia")) 
            return "New Zealand";
        else
            return s;
    };
    
    public static void main(String[] args) {
        Set<String> isLandNations = Set.of("Australia", "Japan", "Taiwan", "Cyprus", "Cuba");
        isLandNations = isLandNations.stream()
                .map(swap)
                .map(n -> n.substring(0,1))
                .collect(Collectors.toSet());
        for (String s : isLandNations) {
            System.out.print(s);
        }
    }
}
