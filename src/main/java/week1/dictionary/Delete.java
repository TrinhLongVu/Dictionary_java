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
public class Delete extends JPanel {

    private JTextPane textDel;

    Delete() {
        UI();
    }

    private void UI() {
        textDel = new JTextPane();        
        textDel.setPreferredSize(new Dimension(300, 200));

        add(textDel);
    }
}
