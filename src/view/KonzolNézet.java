package view;

import java.util.Scanner;

public class KonzolNézet {
    private static final Scanner sc = new Scanner(System.in);
    public int bekeres() {
        kiiras("Melyik ládában van a kincs?(1,2 vagy 3): ");
        int valasztas = sc.nextInt()-1;
        return valasztas;
    }
        public void kiiras(String szoveg){
        System.out.print(szoveg);
    }
}
