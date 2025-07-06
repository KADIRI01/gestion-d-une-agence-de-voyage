package service;

import model.Reservation;
import model.Prestation;
import exception.NoAvailabilityException;

public class ReservationService {
    
    public void processReservation(Reservation reservation) throws NoAvailabilityException {
        Prestation prestation = reservation.getPrestation();
        
        if (prestation.getAvailablePlaces() <= 0) {
            throw new NoAvailabilityException("Plus de places disponibles pour: " + prestation.getDesignation());
        }
        
        reservation.confirm();
        prestation.decrementAvailability();
    }
}