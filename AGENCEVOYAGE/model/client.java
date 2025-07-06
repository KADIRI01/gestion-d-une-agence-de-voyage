package model;

public class Client {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private boolean isArchived;

    // Constructeur
    public Client(String firstName, String lastName, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.isArchived = false;
    }

    // Méthodes d'archivage
    public void archive() {
        this.isArchived = true;
    }
    
    public void restore() {
        this.isArchived = false;
    }

    
}
