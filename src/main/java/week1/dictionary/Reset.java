/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.Dictionary;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Admin
 */
public class Reset extends JPanel {

    HashMap<String, ArrayList<String>> Dicts;

    private JButton buttonReset;

    private class ButtonClickListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                HashMap<String, ArrayList<String>> Origin = new Dict().getDict("./Slang.txt");
                Dicts.clear();
                for (String key : Origin.keySet()) {
                    ArrayList<String> originalList = Origin.get(key);
                    ArrayList<String> copyList = new ArrayList<>(originalList);
                    Dicts.put(key, copyList);
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

        }
    }

    Reset(HashMap<String, ArrayList<String>> d) {
        Dicts = d;
        buttonReset = new JButton("Reset");
        buttonReset.addActionListener(new ButtonClickListener());
        add(buttonReset);
    }
}
