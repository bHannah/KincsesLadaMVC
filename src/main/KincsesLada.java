/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import control.FelugroVezerlo;
import control.KonzolVezerlo;
import modell.JatekModell;
import view.FelugroNezet;
import view.KonzolNézet;

/**
 *
 * @author both.orsolya
 */
public class KincsesLada {
    
    public static void main(String[] args) {
        //new JatekModell();
        
        /*JatekModell modell = new JatekModell();
        KonzolNézet nezet = new KonzolNézet();
        new KonzolVezerlo(modell, nezet);*/
        
        JatekModell modell = new JatekModell();
        FelugroNezet nezet = new FelugroNezet();
        new FelugroVezerlo(modell, nezet);
    }
    
    
}
