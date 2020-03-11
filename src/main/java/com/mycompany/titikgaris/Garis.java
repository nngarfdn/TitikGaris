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
public class Garis {
    Titik titikAwal ;
    Titik titikAkhir;
    double jarak;
    
    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
    }

    public double getPanjang() {
        double jarakX = Math.pow((titikAkhir.getX()-titikAwal.getX()),2);
	double jarakY = Math.pow((titikAkhir.getY()-titikAwal.getY()),2);
	jarak = Math.pow((jarakX+jarakY),0.5);
        return jarak;
    }

    @Override
    public String toString() {
        return "Garis dari "+titikAwal+" sampai "+titikAkhir ;
    }
    
    
    
   
}
