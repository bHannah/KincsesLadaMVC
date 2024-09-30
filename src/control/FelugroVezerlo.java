/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import modell.JatekModell;
import view.FelugroNezet;

/**
 *
 * @author both.orsolya
 */
public class FelugroVezerlo {
    private JatekModell modell;
    private FelugroNezet nezet;

    public FelugroVezerlo(JatekModell modell, FelugroNezet nezet) {
        this.modell = modell;
        this.nezet = nezet;
        this.nezet.kiiras(this.modell.kezdes());
        this.nezet.kiiras(this.modell.ellenorzes(this.nezet.bekeres()));
    }
}
