/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.dictionary;

import java.awt.Dimension;
import javax.swing.*;

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
        
        add(lable);
        add(text);
    }
}
