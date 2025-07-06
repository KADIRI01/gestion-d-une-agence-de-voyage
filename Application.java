package agencevoyage;

import agencevoyage.model.*;
import agencevoyage.service.ReservationService;
import agencevoyage.exception.NoAvailabilityException;

public class Application {
    public static void main(String[] args) {
        // Données de test
        Client client = new Client("Jean", "Dupont", "jean@mail.com", "0123456789");
        Prestation prestation = new Prestation("Séjour Bali", "Voyage", 5);
        Reservation reservation = new Reservation(client, prestation);
        
        // Traitement
        ReservationService service = new ReservationService();
        try {
            service.processReservation(reservation);
            System.out.println("Réservation confirmée!");
        } catch (NoAvailabilityException e) {
            System.err.println("Erreur: " + e.getMessage());
        }
    }
}