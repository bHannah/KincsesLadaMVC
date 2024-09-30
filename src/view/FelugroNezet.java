/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import javax.swing.JOptionPane;

/**
 *
 * @author both.orsolya
 */
public class FelugroNezet {
    public int bekeres() {
        String v = JOptionPane.showInputDialog("Melyik ládában van a kincs?(1,2 vagy 3): " );
        return Integer.parseInt(v) -1;
    }
        public void kiiras(String szoveg){
            JOptionPane.showMessageDialog(null, szoveg);
    }
}
