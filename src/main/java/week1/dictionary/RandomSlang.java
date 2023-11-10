/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.Dictionary;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Admin
 */
public class RandomSlang extends JPanel {

    private HashMap<String, ArrayList<String>> Dicts;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JLabel slang;

    RandomSlang(HashMap<String, ArrayList<String>> d) {
        Dicts = d;

        UI();
    }

    private class ButtonClickListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if (b1.getText().equals(Dicts.get(slang.getText()).get(0)) && "1".equals(command)) {
                JOptionPane.showMessageDialog(null, "Correct Answer", "Message", JOptionPane.INFORMATION_MESSAGE);
            } else if (b2.getText().equals(Dicts.get(slang.getText()).get(0)) && "2".equals(command)) {
                JOptionPane.showMessageDialog(null, "Correct Answer", "Message", JOptionPane.INFORMATION_MESSAGE);
            } else if (b3.getText().equals(Dicts.get(slang.getText()).get(0)) && "3".equals(command)) {
                JOptionPane.showMessageDialog(null, "Correct Answer", "Message", JOptionPane.INFORMATION_MESSAGE);
            } else if (b4.getText().equals(Dicts.get(slang.getText()).get(0)) && "4".equals(command)) {
                JOptionPane.showMessageDialog(null, "Correct Answer", "Message", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error Answer", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private void UI() {
        int length = Dicts.size();
        Random rand = new Random();
        List<String> keys = new ArrayList<>(Dicts.keySet());
        List<String> result = new ArrayList<>();
        int Pos;
        String value;
        for (int i = 0; i < 4; i++) {
            Pos = rand.nextInt(length);
            value = keys.get(Pos);
            if (!result.contains(value)) {
                result.add(value);
            }
        }

        slang = new JLabel(result.get(0), SwingConstants.CENTER);
        int temp = rand.nextInt(result.size());
        b1 = new JButton(Dicts.get(result.get(temp)).get(0));
        result.remove(temp);

        temp = rand.nextInt(result.size());
        b2 = new JButton(Dicts.get(result.get(temp)).get(0));
        result.remove(temp);

        temp = rand.nextInt(result.size());
        b3 = new JButton(Dicts.get(result.get(temp)).get(0));
        result.remove(temp);

        temp = rand.nextInt(result.size());
        b4 = new JButton(Dicts.get(result.get(temp)).get(0));
        result.remove(temp);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());

        b1.setPreferredSize(new Dimension(160, 100));
        b2.setPreferredSize(new Dimension(160, 100));
        b3.setPreferredSize(new Dimension(160, 100));
        b4.setPreferredSize(new Dimension(160, 100));

        b1.setActionCommand("1");
        b2.setActionCommand("2");
        b3.setActionCommand("3");
        b4.setActionCommand("4");
        b1.addActionListener(new ButtonClickListener());
        b2.addActionListener(new ButtonClickListener());
        b3.addActionListener(new ButtonClickListener());
        b4.addActionListener(new ButtonClickListener());

        panel1.add(b1);
        panel1.add(b2);

        panel1.add(b3);
        panel1.add(b4);

        setLayout(new BorderLayout());

        add(slang, BorderLayout.NORTH);
        add(panel1, BorderLayout.CENTER);
    }

}
