package test;

import model.client;
import view.*;

import javax.swing.*;
import java.util.ArrayList;

public class TestCycleClientComplet {

    public static void main(String[] args) {
        // 1. On ajoute un client manuellement
        ArrayList<client> clients = AjoutClientSwing.getClients();

        System.out.println("✅ Ajout d’un client...");
        client c = new client(1, "Ali", "Karim", "ali@mail.com", "0611223344");
        clients.add(c);

        // 2. Afficher la liste (le client doit être visible)
        System.out.println("📋 Affichage de la liste des clients actifs");
        for (client cl : clients) {
            if (!cl.isArchive()) {
                System.out.println(" - " + cl);
            }
        }

        // 3. Archiver le client
        System.out.println("🕵️ Archivage du client...");
        c.archiver();

        // 4. Vérifier qu’il ne s’affiche plus comme actif
        System.out.println("📋 Liste après archivage :");
        for (client cl : clients) {
            if (!cl.isArchive()) {
                System.out.println(" - " + cl);
            }
        }

        // 5. Restaurer le client
        System.out.println("♻️ Restauration du client...");
        c.restaurer();

        // 6. Vérifier qu’il est de retour dans la liste
        System.out.println("📋 Liste finale après restauration :");
        for (client cl : clients) {
            if (!cl.isArchive()) {
                System.out.println(" - " + cl);
            }
        }

        // Facultatif : ouvrir les interfaces aussi
        SwingUtilities.invokeLater(() -> {
            new ListeClientsSwing(clients);
            new ArchiveClientSwing(clients);
        });
    }
}
