/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.dictionary;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Admin
 */
public class CRUD extends JPanel {

    private JComboBox list;
    private CardLayout cardLayout;
    private JPanel cardPanel;

    CRUD() {
        UI();
    }

    private class Event implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String selectedItem = (String) list.getSelectedItem();
            if ("Edit".equals(selectedItem)) {
                cardLayout.show(cardPanel, "Edit");
            } else if ("Delete".equals(selectedItem)) {
                cardLayout.show(cardPanel, "Delete");
            }
        }
    }

    public void UI() {
        String[] data = {"Add", "Edit", "Delete", "Reset"};
        list = new JComboBox(data);
        cardPanel = new JPanel();

        list.setPreferredSize(new Dimension(50, 23));
        cardLayout = new CardLayout();
        setLayout(new BorderLayout());
        cardPanel.setLayout(cardLayout);

        add(list, BorderLayout.NORTH);
        add(cardPanel, BorderLayout.CENTER);

        cardPanel.add( new Edit(), "Edit");
        cardPanel.add(new Delete(), "Delete");

        list.addActionListener(new Event());
    }
}
