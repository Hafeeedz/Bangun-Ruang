/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;


 
public class limassegitiga extends BangunRuang {
 
    double luasAlas;
    double tLimas;
    double LuasSisiTegak;
    
    @Override
     double volume(){
        double volume = 1/3*luasAlas*tLimas;
        System.out.println("volume limas segitiga = "+ volume);
        return volume;
    }
     
    @Override
     double luaspermukaan(){
         double luaspermukaan = luasAlas+LuasSisiTegak;
         System.out.println("luas permukaan limas = "+ luaspermukaan);
         return luaspermukaan;
     }
}
