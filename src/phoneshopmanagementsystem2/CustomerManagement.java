/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phoneshopmanagementsystem2;

/**
 *
 * @author Kanishka Abesinghe
 */
import javax.swing.*;
import java.awt.*;

public class CustomerManagement {
    private JFrame frame;

    public CustomerManagement() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Customer Management");
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setLayout(new GridLayout(4, 1, 10, 10));

        JButton btnAddCustomer = new JButton("Add Customer");
        btnAddCustomer.addActionListener(e -> addCustomer());
        frame.getContentPane().add(btnAddCustomer);

        JButton btnUpdateCustomer = new JButton("Update Customer");
        btnUpdateCustomer.addActionListener(e -> updateCustomer());
        frame.getContentPane().add(btnUpdateCustomer);

        JButton btnDeleteCustomer = new JButton("Delete Customer");
        btnDeleteCustomer.addActionListener(e -> deleteCustomer());
        frame.getContentPane().add(btnDeleteCustomer);

        JButton btnViewCustomer = new JButton("View Customer");
        btnViewCustomer.addActionListener(e -> viewCustomer());
        frame.getContentPane().add(btnViewCustomer);

        frame.setVisible(true);
    }

    private void addCustomer() {
        // Add customer logic
    }

    private void updateCustomer() {
        // Update customer logic
    }

    private void deleteCustomer() {
        // Delete customer logic
    }

    private void viewCustomer() {
        // View customer logic
    }
}
