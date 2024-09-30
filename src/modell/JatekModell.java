/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

/**
 *
 * @author both.orsolya
 */
public class JatekModell {
    
    
    private Lada[] ladak;

    public JatekModell() {

        ladak = new Lada[3];
        ladak[0] = new Lada("arany", "Én rejtem a kincset");
        ladak[1] = new Lada("ezüst", "Nem én rejtem a kincset", true);
        ladak[2] = new Lada("bronz", "Az arany hazudik");
    }

    public String kezdes() {
        String s = "Hol a kincs? Csak az egyik felirat lesz igaz!\n";
        int i = 1;
        for(Lada lada : ladak){
            String a = lada.getAnyag();
            String f = lada.getFelirat();
            s += i + ". " + a + "láda: " + f + "\n";
            i++;
        }
        return s;
    }


    
    public String ellenorzes(int szam){
        String s = "Gratulálok, eltaláltad!";
        s = ladak[szam].isKincs() ? s : "Sajnos nem talált!";
        
        /*mellékhatás, az ellenőrzés be is zárja a scannert, de erről nem értesít*/
        //sc.close();
        
        return s;
    }
}
