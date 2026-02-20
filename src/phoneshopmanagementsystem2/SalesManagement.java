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

public class SalesManagement {
    private JFrame frame;

    public SalesManagement() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Sales Management");
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setLayout(new GridLayout(2, 1, 10, 10));

        JButton btnProcessSale = new JButton("Process Sale");
        btnProcessSale.addActionListener(e -> processSale());
        frame.getContentPane().add(btnProcessSale);

        JButton btnViewSales = new JButton("View Sales");
        btnViewSales.addActionListener(e -> viewSales());
        frame.getContentPane().add(btnViewSales);

        frame.setVisible(true);
    }

    private void processSale() {
        // Process sale logic
    }

    private void viewSales() {
        // View sales logic
    }
}
