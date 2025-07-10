package dao;

import model.client;
import model.DBConnection;

import java.sql.*;
import java.util.ArrayList;

public class clientDAO {

    public static void ajouter(client c) {
        try {
            String sql = "INSERT INTO client (nom, prenom, email, telephone) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql);
            ps.setString(1, c.getNom());
            ps.setString(2, c.getPrenom());
            ps.setString(3, c.getEmail());
            ps.setString(4, c.getTelephone());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<client> getTous() {
        ArrayList<client> liste = new ArrayList<>();
        try {
            String sql = "SELECT * FROM client WHERE archive = FALSE";
            Statement st = DBConnection.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                client c = new client(
                        rs.getInt("id"),
                        rs.getString("nom"),
                        rs.getString("prenom"),
                        rs.getString("email"),
                        rs.getString("telephone")
                );
                if (rs.getBoolean("archive")) c.archiver();
                liste.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return liste;
    }

    public static void archiver(int id) {
        try {
            String sql = "UPDATE client SET archive = TRUE WHERE id = ?";
            PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void restaurer(int id) {
        try {
            String sql = "UPDATE client SET archive = FALSE WHERE id = ?";
            PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
