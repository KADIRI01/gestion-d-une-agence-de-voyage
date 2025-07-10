package test;

import model.Prestation;

import java.time.LocalDate;

public class TestPrestation {
    public static void main(String[] args) {
        Prestation p = new Prestation(
            1001,
            "Séjour 5 étoiles",
            "All inclusive",
            "Hotel Royal",
            "Marrakech",
            "Maroc",
            LocalDate.of(2025, 7, 1),
            LocalDate.of(2025, 7, 10),
            8500.0,
            3
        );

        System.out.println("🧪 Test: Prestation");
        System.out.println(p);

        System.out.println("🧪 Test: Vérification disponibilité");
        System.out.println("Places disponibles ? " + p.verifierDisponibilite());

        System.out.println("🧪 Test: Diminuer les places");
        p.diminuerPlace();
        p.diminuerPlace();
        p.diminuerPlace();
        p.diminuerPlace(); // ne descend pas en-dessous de 0
        System.out.println("Places restantes : " + p.getPlacesDisponibles());
    }
}
