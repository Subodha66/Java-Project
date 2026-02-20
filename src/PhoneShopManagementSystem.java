/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kanishka Abesinghe
 */
import javax.swing.*;
import java.awt.*;
import java.sql.Connection;

public class PhoneShopManagementSystem {
    private JFrame frame;

    public static void main(String[] args) {
        // Set up database connection
        Connection connection = DatabaseConnection.getConnection();
        if (connection == null) {
            JOptionPane.showMessageDialog(null, "Database connection failed", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Initialize the GUI
        EventQueue.invokeLater(() -> {
            try {
                PhoneShopManagementSystem window = new PhoneShopManagementSystem();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public PhoneShopManagementSystem() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Phone Shop Management System");
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new GridLayout(3, 1, 10, 10));

        JButton btnCustomerManagement = new JButton("Customer Management");
        btnCustomerManagement.addActionListener(e -> new CustomerManagement());
        frame.getContentPane().add(btnCustomerManagement);

        JButton btnInventoryManagement = new JButton("Inventory Management");
        btnInventoryManagement.addActionListener(e -> new InventoryManagement());
        frame.getContentPane().add(btnInventoryManagement);

        JButton btnSalesManagement = new JButton("Sales Management");
        btnSalesManagement.addActionListener(e -> new SalesManagement());
        frame.getContentPane().add(btnSalesManagement);
    }

    private static class CustomerManagement {

        public CustomerManagement() {
        }
    }

    private static class InventoryManagement {

        public InventoryManagement() {
        }
    }

    private static class SalesManagement {

        public SalesManagement() {
        }
    }
}
