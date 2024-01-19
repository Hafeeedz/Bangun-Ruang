/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author No Jeneng
 */
public class main {
    public static void main(String[] args) {
    
    BangunRuang BangunRuang = new BangunRuang();
    
    bola bola = new bola();
    bola.r = 7;
    
    balok balok = new balok();
    balok.p = 6;
    balok.l = 7;
    balok.t = 9;
    
    limassegitiga limassegitiga = new limassegitiga();
    limassegitiga.LuasSisiTegak = 34;
    limassegitiga.luasAlas = 10;
    limassegitiga.tLimas = 13;
    
    Tabung Tabung = new Tabung();
    Tabung.r = 7;
    Tabung.t = 10;
    
    BangunRuang.volume();
    BangunRuang.luaspermukaan();
    
    bola.volume();
    bola.luaspermukaan();
    
    balok.volume();
    balok.luaspermukaan();
    
    limassegitiga.volume();
    limassegitiga.luaspermukaan();
    
    
    Tabung.volume();
    Tabung.luaspermukaan();
       
    }  
}
