/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author No Jeneng
 */
public class balok extends BangunRuang {
    double p;
    double l;
    double t;
    
     @Override
    double volume(){
        double volume = p*l*t;
        System.out.println("volume balok = "+ volume);
        return volume;
    }
    
    @Override
    double luaspermukaan(){
        double luaspermukaan = 2* (p*l+p*t+l*t);
        System.out.println("luaspermukaan balok = "+ luaspermukaan);
        return luaspermukaan;
    }
    
}
