package test;

import model.client;
import model.Prestation;
import model.Reservation;

import java.time.LocalDate;

public class TestReservation {
    public static void main(String[] args) {
        client client = new client(2, "Ahmed", "El Hadi", "ahmed@agence.com", "0611122233");
        Prestation prestation = new Prestation(
            202,
            "Week-end détente",
            "SPA",
            "ThermaLux",
            "Fès",
            "Maroc",
            LocalDate.of(2025, 8, 1),
            LocalDate.of(2025, 8, 3),
            1200.0,
            5
        );

        Reservation r = new Reservation(501, client, prestation, LocalDate.now());

        System.out.println("🧪 Test: Réservation");
        System.out.println(r);
    }
}
