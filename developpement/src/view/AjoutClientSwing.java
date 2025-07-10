package view;

import model.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class AjoutClientSwing extends JFrame {

    private JTextField nomField = new JTextField(15);
    private JTextField prenomField = new JTextField(15);
    private JTextField emailField = new JTextField(15);
    private JTextField telField = new JTextField(15);
    private JTextArea output = new JTextArea(5, 30);

    private static ArrayList<client> clients = new ArrayList<>();

    public AjoutClientSwing() {
        setTitle("Ajout Client - Swing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("Nom:"));
        add(nomField);
        add(new JLabel("Prénom:"));
        add(prenomField);
        add(new JLabel("Email:"));
        add(emailField);
        add(new JLabel("Téléphone:"));
        add(telField);

        JButton ajouterBtn = new JButton("Ajouter Client");
        add(ajouterBtn);

        output.setEditable(false);
        add(new JScrollPane(output));

        ajouterBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ajouterClient();
            }
        });

        pack();
        setLocationRelativeTo(null); // centre la fenêtre
        setVisible(true);
    }

    private void ajouterClient() {
        String nom = nomField.getText();
        String prenom = prenomField.getText();
        String email = emailField.getText();
        String tel = telField.getText();

        if (nom.isEmpty() || prenom.isEmpty()) {
            output.setText("Nom et prénom sont obligatoires.\n");
            return;
        }

        client c = new client(clients.size() + 1, nom, prenom, email, tel);
        clients.add(c);

        output.setText("Client ajouté : " + c.getNom() + " " + c.getPrenom() + "\n");
        nomField.setText(""); prenomField.setText(""); emailField.setText(""); telField.setText("");
    }

    public static ArrayList<client> getClients() {
        return clients;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AjoutClientSwing());
    }
}
