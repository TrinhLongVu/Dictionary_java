/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.dictionary;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Admin
 */
public class Delete extends JPanel {

    private JTextPane textDel;
    private HashMap<String, ArrayList<String>> Dicts;
    private JButton buttonDelete;

    Delete(HashMap<String, ArrayList<String>> d) {
        Dicts = d;
        buttonDelete = new JButton("Delete");

        UI();
    }

    private class ButtonClickListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if ("Delete".equals(command)) {
                if (Dicts.containsKey(textDel.getText())) {
                    int result = JOptionPane.showConfirmDialog(null, "Do you confirm?", "Confirmation", JOptionPane.YES_NO_OPTION);
                    if (result == JOptionPane.YES_OPTION) {
                        Dicts.remove(textDel.getText());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Word is not exits", "Message", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }

    private void UI() {
        textDel = new JTextPane();
        textDel.setPreferredSize(new Dimension(300, 23));
        buttonDelete.setPreferredSize(new Dimension(100, 23));

        buttonDelete.setActionCommand("Delete");
        buttonDelete.addActionListener(new ButtonClickListener());

        add(textDel);
        add(buttonDelete);
    }
}
