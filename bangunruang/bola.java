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
public class bola extends BangunRuang {
    
    double r;
    
    @Override
    double volume(){
        double volume = 4/3*PI*r*r*r;
        System.out.println("volume bola = "+ volume);
        return volume;
    }
    
    @Override
    double luaspermukaan(){
        double luaspermukaan = 4*PI*r*r;
        System.out.println("luas permukaan bola = "+luaspermukaan);
        return luaspermukaan;
    }
    
}
