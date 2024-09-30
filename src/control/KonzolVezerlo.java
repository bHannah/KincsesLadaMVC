package control;

import modell.JatekModell;
import view.KonzolNézet;

public class KonzolVezerlo {
    private JatekModell modell;
    private KonzolNézet nezet;

    public KonzolVezerlo(JatekModell modell, KonzolNézet nezet) {
        this.modell = modell;
        this.nezet = nezet;
        this.nezet.kiiras(this.modell.kezdes());
        this.nezet.kiiras(this.modell.ellenorzes(this.nezet.bekeres()));
    }
}
