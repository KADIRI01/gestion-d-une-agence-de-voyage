package test;

import view.HistoriqueClientSwing;
import view.AjoutClientSwing;

public class TestHistoriqueClientSwing {
    public static void main(String[] args) {
        new HistoriqueClientSwing(AjoutClientSwing.getClients());
    }
}

