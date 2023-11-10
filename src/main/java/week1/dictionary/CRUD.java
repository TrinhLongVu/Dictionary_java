/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.Dictionary;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.*;

/**
 *
 * @author Admin
 */
public class CRUD extends JPanel {

    private JComboBox list;
    private CardLayout cardLayout;
    private JPanel cardPanel;
    private HashMap<String, ArrayList<String>> Dicts;

    CRUD(HashMap<String, ArrayList<String>> d) {
        Dicts = d;
        UI();
    }

    private class Event implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String selectedItem = (String) list.getSelectedItem();
            if ("Add".equals(selectedItem)) {
                cardLayout.show(cardPanel, "Add");
            } else if ("Edit".equals(selectedItem)) {
                cardLayout.show(cardPanel, "Edit");
            } else if ("Delete".equals(selectedItem)) {
                cardLayout.show(cardPanel, "Delete");
            } else if ("Reset".equals(selectedItem)) {
                cardLayout.show(cardPanel, "Reset");
            }
        }
    }

    private void UI() {
        String[] data = {"Add", "Edit", "Delete", "Reset"};
        list = new JComboBox(data);
        cardPanel = new JPanel();

        list.setPreferredSize(new Dimension(50, 23));
        cardLayout = new CardLayout();
        setLayout(new BorderLayout());
        cardPanel.setLayout(cardLayout);

        add(list, BorderLayout.NORTH);
        add(cardPanel, BorderLayout.CENTER);

        cardPanel.add(new Add(Dicts), "Add");
        cardPanel.add(new Edit(Dicts), "Edit");
        cardPanel.add(new Delete(Dicts), "Delete");
        cardPanel.add(new Reset(Dicts), "Reset");

        list.addActionListener(new Event());
    }
}
