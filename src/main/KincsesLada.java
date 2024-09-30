/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import control.KonzolVezerlo;
import modell.JatekModell;
import view.KonzolNézet;

/**
 *
 * @author both.orsolya
 */
public class KincsesLada {
    
    public static void main(String[] args) {
        //new JatekModell();
        
        JatekModell modell = new JatekModell();
        KonzolNézet nezet = new KonzolNézet();
        new KonzolVezerlo(modell, nezet);
    }
    
    
}
