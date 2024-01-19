/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

import static java.lang.Math.PI;

/**
 *
 * @author No Jeneng
 */
public class Tabung extends BangunRuang {
    double r;
    double t;
    
 
    @Override
     double volume(){
        double volume = PI*r*r*t;
        System.out.println("volume Tabung = "+ volume);
        return volume;
    }
     
    @Override
    double luaspermukaan(){
         double luaspermukaan = 2*PI*r*(r+t);
         System.out.println("luas Permukaan Tabung = "+ luaspermukaan);
         return luaspermukaan;
     }
    
}
