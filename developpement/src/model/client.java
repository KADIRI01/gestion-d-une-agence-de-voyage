package model;

import java.util.ArrayList;
import java.util.List;

public class client {
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private boolean archive;
    private List<Reservation> historique;

    public client(int id, String nom, String prenom, String email, String telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.archive = false;
        this.historique = new ArrayList<>();
    }

    // Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelephone() { return telephone; }
    public void setTelephone(String telephone) { this.telephone = telephone; }

    public boolean isArchive() { return archive; }
    public void setArchive(boolean archive) { this.archive = archive; }

    public List<Reservation> getHistorique() { return historique; }

    // Méthodes
    public void archiver() {
        this.archive = true;
    }

    public void restaurer() {
        this.archive = false;
    }

    public void afficherHistorique() {
        for (Reservation res : historique) {
            System.out.println(res);
        }
    }

    public void ajouterReservationHistorique(Reservation r) {
        historique.add(r);
    }

    @Override
    public String toString() {
        return nom + " " + prenom + " (" + email + ")";
    }
}
