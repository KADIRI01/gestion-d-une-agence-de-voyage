package test;

import view.ListeClientsSwing;
import view.AjoutClientSwing;

public class TestListeClientsSwing {
    public static void main(String[] args) {
        // Lance d'abord AjoutClient pour ajouter des données
        new view.AjoutClientSwing(); // facultatif
        new ListeClientsSwing(view.AjoutClientSwing.getClients());
    }
}
