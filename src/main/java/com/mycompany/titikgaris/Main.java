/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.titikgaris;

/**
 *
 * @author praktikan
 */
public class Main {
    public static void main(String[] args) {
        Titik t1 = new Titik(5,8);
        Titik t2 = new Titik(2,4);
        Garis g1 = new Garis(t1, t2);
        System.out.println(g1);
        System.out.println(g1.getPanjang());
	t1.naik();
	System.out.println(g1);		
	System.out.println(g1.getPanjang());
    }
    
}
