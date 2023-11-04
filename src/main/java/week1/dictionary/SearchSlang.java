/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.dictionary;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Admin
 */
public class SearchSlang extends JPanel {
    private JPanel HeaderUI;
    private JPanel Content;
    private JTextPane text;
    private JButton buttonInput;
    private JTextField textInput;

    SearchSlang() {
        createAndShowGUI();
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if ("Input".equals(command)) {
                System.out.print(command);
                String textValue = textInput.getText();
                System.out.print("akaajajaja : " + textValue);
            }
        }
    }

    private void createAndShowGUI() {
        HeaderUI = new JPanel();
        Content = new JPanel();
        textInput = new JTextField();
        buttonInput = new JButton("input");
        text = new JTextPane();
        
        // set layout
        setLayout(new BorderLayout());
        HeaderUI.setLayout(new FlowLayout());

        // set Size component
        textInput.setPreferredSize(new Dimension(244, 23));
        buttonInput.setPreferredSize(new Dimension(75, 23));
        text.setPreferredSize(new Dimension(325, 200));

        // add event 
        buttonInput.setActionCommand("Input");
        buttonInput.addActionListener(new ButtonClickListener());

        HeaderUI.add(textInput);
        HeaderUI.add(buttonInput);
        Content.add(text);

        add(HeaderUI, BorderLayout.NORTH);
        add(Content, BorderLayout.CENTER);

    }
}
