package model;

import java.time.LocalDate;

public class Reservation {
    private int id;
    private client client;
    private Prestation prestation;
    private LocalDate dateReservation;

    public Reservation(int id, client client, Prestation prestation, LocalDate dateReservation) {
        this.id = id;
        this.client = client;
        this.prestation = prestation;
        this.dateReservation = dateReservation;
    }

    // Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public client getClient() { return client; }
    public void setClient(client client) { this.client = client; }

    public Prestation getPrestation() { return prestation; }
    public void setPrestation(Prestation prestation) { this.prestation = prestation; }

    public LocalDate getDateReservation() { return dateReservation; }
    public void setDateReservation(LocalDate dateReservation) { this.dateReservation = dateReservation; }

    @Override
    public String toString() {
        return "Réservation n°" + id + " - " + client + " pour " + prestation + " le " + dateReservation;
    }
}
