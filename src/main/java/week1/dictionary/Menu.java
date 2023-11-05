/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.dictionary;

import javax.swing.*;

/**
 *
 * @author Admin
 */
public class Menu {

    private JFrame mainFrame;
    private JPanel controlPanel;
    private JTabbedPane tabby;

    public Menu() {
        createAndShowGUI();
    }

    private void createAndShowGUI() {
        mainFrame = new JFrame("CardLayoutDemo");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(360, 400);

        controlPanel = new JPanel();

        tabby = new JTabbedPane();

        tabby.addTab("Main", controlPanel);
        tabby.addTab("Slang", new SearchSlang());
        tabby.addTab("definition", new DefineSearch());

        mainFrame.add(tabby);
        mainFrame.setVisible(true);
    }
}
