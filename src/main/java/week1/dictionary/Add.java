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
public class Add extends JPanel {

    private HashMap<String, ArrayList<String>> Dicts;
    private JPanel p1;
    private JPanel p2;

    private JLabel LabelWord;
    private JLabel LabelDefine;

    private JTextField Word;
    private JTextField Define;
    private JButton buttonAdd;

    Add(HashMap<String, ArrayList<String>> d) {
        Dicts = d;
        p1 = new JPanel();
        p2 = new JPanel();

        LabelWord = new JLabel("New Word");
        LabelDefine = new JLabel("New Define");

        Word = new JTextField();
        Define = new JTextField();

        buttonAdd = new JButton("Add");
        ui();
    }

    private class ButtonClickListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if ("Add".equals(command)) {

                Object[] options = {"overwrite", "duplicate"};
                int result = -1;
                if (Dicts.containsKey(Word.getText())) {
                    result = JOptionPane.showOptionDialog(null, "Do you want to continue?",
                            "Custom Buttons",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            options,
                            options[0] 
                    );
                }
                if(result == 0){
                    Dicts.get(Word.getText()).clear();                    
                    Dicts.get(Word.getText()).add(Define.getText());
                }else if(result == 1){
                    Dicts.get(Word.getText()).add(Define.getText());
                }
            }
        }
    }

    private void ui() {

        Word.setPreferredSize(new Dimension(170, 23));
        Define.setPreferredSize(new Dimension(170, 23));
        buttonAdd.setPreferredSize(new Dimension(100, 23));

        p1.add(LabelWord);
        p1.add(Word);

        p2.add(LabelDefine);
        p2.add(Define);

        add(p1);
        add(p2);
        add(buttonAdd);

        buttonAdd.setActionCommand("Add");
        buttonAdd.addActionListener(new ButtonClickListener());

    }
}
