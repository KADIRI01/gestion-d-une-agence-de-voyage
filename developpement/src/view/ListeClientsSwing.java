package view;

import model.client;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ListeClientsSwing extends JFrame {
    public ListeClientsSwing(ArrayList<client> clients) {
        setTitle("Liste des Clients");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        JTextArea area = new JTextArea(15, 30);
        area.setEditable(false);
        for (client c : clients) {
            if (!c.isArchive()) {
                area.append(c.toString() + "\n");
            }
        }

        add(new JScrollPane(area), BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
