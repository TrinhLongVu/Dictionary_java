/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.Dictionary;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class SearchSlang extends JPanel {

    private JPanel HeaderUI;
    private JPanel Content;
    private JButton buttonInput;
    private JTextField textInput;
    private JLabel label;
    private JTable table;
    private JScrollPane scrollPane;
    private DefaultTableModel model;
    private HashMap<String, ArrayList<String>> Dicts;
    private ArrayList<String> ListHistory;
    private History PageHistory;

    SearchSlang(HashMap<String, ArrayList<String>> d) throws IOException {
        Dicts = new HashMap<>();
        Dicts = d;
        ListHistory = new ArrayList<>();
        PageHistory = new History();
        handleSearch();
        createAndShowGUI();
    }

    private class ButtonClickListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            model.setRowCount(0);
            String command = e.getActionCommand();
            if ("Input".equals(command)) {
                String key = textInput.getText();
                if (Dicts.containsKey(key)) {
                    ArrayList<String> temp = Dicts.get(key);
                    for (int i = 0; i < temp.size(); i++) {
                        model.addRow(new Object[]{key, temp.get(i)});
                    }
                }
                ListHistory.add(key);
                PageHistory.SetText(key);
            }
        }
    }

    private void handleSearch() throws IOException {
        // create table 
        model = new DefaultTableModel();
        table = new JTable(model);
        scrollPane = new JScrollPane(table);
        ArrayList<String> value = new ArrayList<>();

        model.addColumn("Slang");
        model.addColumn("defintion");

        for (Map.Entry<String, ArrayList<String>> entry : Dicts.entrySet()) {
            String key = entry.getKey();
            value = entry.getValue();
            ArrayList<String> temp = Dicts.get(key);
            for (int i = 0; i < temp.size(); i++) {
                model.addRow(new Object[]{key, temp.get(i)});
            }
        }
    }

    private void createAndShowGUI() throws IOException {
        HeaderUI = new JPanel();
        Content = new JPanel();
        textInput = new JTextField();
        buttonInput = new JButton("input");
        label = new JLabel("Result");

        // set layout
        setLayout(new BorderLayout());
        HeaderUI.setLayout(new FlowLayout());

        // set Size component
        textInput.setPreferredSize(new Dimension(244, 23));
        buttonInput.setPreferredSize(new Dimension(75, 23));
        scrollPane.setPreferredSize(new Dimension(325, 250));

        // add event 
        buttonInput.setActionCommand("Input");
        buttonInput.addActionListener(new ButtonClickListener());

        HeaderUI.add(textInput);
        HeaderUI.add(buttonInput);
        Content.add(label);
        Content.add(scrollPane);

        add(HeaderUI, BorderLayout.NORTH);
        add(Content, BorderLayout.CENTER);
        add(PageHistory, BorderLayout.SOUTH);
    }
}
