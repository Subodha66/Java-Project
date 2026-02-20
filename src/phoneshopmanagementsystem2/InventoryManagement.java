/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package phoneshopmanagementsystem2;
 
/*
 *
 * @author Kanishka Abesinghe
 */
import javax.swing.*;
import java.awt.*;

public class InventoryManagement {
    private JFrame frame;

    public InventoryManagement() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Inventory Management");
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setLayout(new GridLayout(4, 1, 10, 10));

        JButton btnAddItem = new JButton("Add Item");
        btnAddItem.addActionListener(e -> addItem());
        frame.getContentPane().add(btnAddItem);

        JButton btnUpdateItem = new JButton("Update Item");
        btnUpdateItem.addActionListener(e -> updateItem());
        frame.getContentPane().add(btnUpdateItem);

        JButton btnDeleteItem = new JButton("Delete Item");
        btnDeleteItem.addActionListener(e -> deleteItem());
        frame.getContentPane().add(btnDeleteItem);

        JButton btnViewItem = new JButton("View Item");
        btnViewItem.addActionListener(e -> viewItem());
        frame.getContentPane().add(btnViewItem);

        frame.setVisible(true);
    }

    private void addItem() {
        // Add item logic
    }

    private void updateItem() {
        // Update item logic
    }

    private void deleteItem() {
        // Delete item logic
    }

    private void viewItem() {
        // View item logic
    }
}
