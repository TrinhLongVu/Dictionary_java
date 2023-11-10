/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.Dictionary;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Admin
 */
public class Edit extends JPanel {

    private HashMap<String, ArrayList<String>> Dicts;
    private JPanel p1;
    private JPanel p2;

    private JLabel LabelWord;
    private JLabel LabelDefine;

    private JTextField Word;
    private JTextField Define;

    private JButton buttonEdit;

    Edit(HashMap<String, ArrayList<String>> d) {
        Dicts = d;
        p1 = new JPanel();
        p2 = new JPanel();

        LabelWord = new JLabel("Word");
        LabelDefine = new JLabel("New Define");

        Word = new JTextField();
        Define = new JTextField();

        buttonEdit = new JButton("Edit");
        ui();
    }

    private class ButtonClickListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if ("Edit".equals(command)) {
                Dicts.get(Word.getText()).clear();
                Dicts.get(Word.getText()).add(Define.getText());
                JOptionPane.showMessageDialog(null, "Edit Success", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private void ui() {

        Word.setPreferredSize(new Dimension(170, 23));
        Define.setPreferredSize(new Dimension(170, 23));
        buttonEdit.setPreferredSize(new Dimension(100, 23));

        p1.add(LabelWord);
        p1.add(Word);

        p2.add(LabelDefine);
        p2.add(Define);

        add(p1);
        add(p2);
        add(buttonEdit);

        buttonEdit.setActionCommand("Edit");
        buttonEdit.addActionListener(new ButtonClickListener());

    }
}
