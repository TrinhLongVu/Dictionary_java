/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.Dictionary;

import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.text.StyledDocument;

/**
 *
 * @author Admin
 */
public class History extends JPanel {

    private JTextPane text;
    private JLabel lable;

    History() {
        UI();
    }

    public void UI() {
        lable = new JLabel("History");
        text = new JTextPane();
        text.setPreferredSize(new Dimension(325, 100));
        

        JScrollPane scrollPane = new JScrollPane(text);
        add(lable);
        add(scrollPane);
    }

    private static void AddNewText(JTextPane textPane, String text) {
        StyledDocument doc = textPane.getStyledDocument();
        try {
            doc.insertString(doc.getLength(), text, null);
        } catch (Exception e) {
        }
    }
    
    public void SetText(String slang) {
        AddNewText(text, slang + "\n");
    }
}
