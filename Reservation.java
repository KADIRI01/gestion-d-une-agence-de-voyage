package model;

import java.util.Date;

public class Reservation {
    private Long id;
    private Date confirmationDate;
    private ReservationStatus status;
    private Client client;
    private Prestation prestation;

    // Changer le statut
    public void confirm() {
        this.status = ReservationStatus.CONFIRMED;
        this.confirmationDate = new Date();
    }
    
    public void cancel() {
        this.status = ReservationStatus.CANCELLED;
    }
}