/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.dictionary;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Admin
 */
public class Edit extends JPanel {

    private JTextPane wordNeeedChange;
    private JTextPane wordChange;

    Edit() {
        UI();
    }

    private void UI() {
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JLabel l1 = new JLabel("Old Word");
        JLabel l2 = new JLabel("New Word");
        wordNeeedChange = new JTextPane();        
        wordChange = new JTextPane();

        wordNeeedChange.setPreferredSize(new Dimension(150, 200));
        wordChange.setPreferredSize(new Dimension(150, 200));
        setLayout(new FlowLayout());

        p1.setLayout(new BorderLayout());
        p2.setLayout(new BorderLayout());

        p1.add(l1, BorderLayout.NORTH);
        p1.add(wordNeeedChange, BorderLayout.CENTER);
        
        
        p2.add(l2, BorderLayout.NORTH);
        p2.add(wordChange, BorderLayout.CENTER);
        
        add(p1);
        add(p2);

    }
}
