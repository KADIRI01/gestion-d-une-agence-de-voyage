package view;

import model.client;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ArchiveClientSwing extends JFrame {

    public ArchiveClientSwing(ArrayList<client> clients) {
        setTitle("Archiver / Restaurer Client");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JComboBox<client> combo = new JComboBox<>();
        for (client c : clients) {
            combo.addItem(c);
        }

        JButton archiveBtn = new JButton("Archiver");
        JButton restaurerBtn = new JButton("Restaurer");

        JTextArea resultat = new JTextArea(3, 25);
        resultat.setEditable(false);

        archiveBtn.addActionListener(e -> {
            client selected = (client) combo.getSelectedItem();
            selected.archiver();
            resultat.setText("Client archivé : " + selected.getNom());
        });

        restaurerBtn.addActionListener(e -> {
            client selected = (client) combo.getSelectedItem();
            selected.restaurer();
            resultat.setText("Client restauré : " + selected.getNom());
        });

        add(combo); add(archiveBtn); add(restaurerBtn);
        add(resultat);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
