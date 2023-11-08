/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.dictionary;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Admin
 */
public class Reset extends JPanel {

    HashMap<String, ArrayList<String>> Dicts;
    HashMap<String, ArrayList<String>> Origin;

    private JButton buttonReset;

    private class ButtonClickListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Dicts.clear();
            for (String key : Origin.keySet()) {
                ArrayList<String> originalList = Origin.get(key);
                ArrayList<String> copyList = new ArrayList<>(originalList);
                Dicts.put(key, copyList);
            }
            System.out.print("jo");
        }
    }

    Reset(HashMap<String, ArrayList<String>> d, HashMap<String, ArrayList<String>> o) {
        Dicts = d;
        Origin = o;
        buttonReset = new JButton("Reset");
        buttonReset.addActionListener(new ButtonClickListener());
        add(buttonReset);
    }
}
