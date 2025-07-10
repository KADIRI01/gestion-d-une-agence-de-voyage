package view;

import model.client;
import model.Reservation;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class HistoriqueClientSwing extends JFrame {

    public HistoriqueClientSwing(ArrayList<client> clients) {
        setTitle("Historique Client");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JComboBox<client> combo = new JComboBox<>();
        for (client c : clients) {
            combo.addItem(c);
        }

        JTextArea historique = new JTextArea(10, 30);
        historique.setEditable(false);

        combo.addActionListener(e -> {
            client selected = (client) combo.getSelectedItem();
            historique.setText("");
            for (Reservation r : selected.getHistorique()) {
                historique.append(r.toString() + "\n");
            }
        });

        add(combo, BorderLayout.NORTH);
        add(new JScrollPane(historique), BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
