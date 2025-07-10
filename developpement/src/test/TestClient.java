package test;

import model.client;
import model.Reservation;

import java.time.LocalDate;

public class TestClient {
    public static void main(String[] args) {
        client client = new client(1, "Kadiri", "Wadie", "wadie@email.com", "0600000000");

        System.out.println("🧪 Test: Création client");
        System.out.println(client);

        System.out.println("🧪 Test: Archivage");
        client.archiver();
        System.out.println("Archivé ? " + client.isArchive());

        System.out.println("🧪 Test: Historique");
        Reservation fakeRes = new Reservation(101, client, null, LocalDate.now());
        client.ajouterReservationHistorique(fakeRes);
        client.afficherHistorique();
    }
}
