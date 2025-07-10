package test;

import dao.clientDAO;
import model.client;

import java.util.ArrayList;

public class TestClientBD {
    public static void main(String[] args) {
        System.out.println("✅ Ajout client dans la base...");
        client c = new client(0, "Karim", "Taha", "karim@mail.com", "0612345678");
        clientDAO.ajouter(c);

        System.out.println("📋 Liste des clients (non archivés) :");
        ArrayList<client> clients = clientDAO.getTous();
        for (client cl : clients) {
            System.out.println(" - " + cl.getNom() + " " + cl.getPrenom());
        }

        System.out.println("🕵️ Archivage du client 1...");
        clientDAO.archiver(1);

        System.out.println("♻️ Restauration du client 1...");
        clientDAO.restaurer(1);
    }
}
