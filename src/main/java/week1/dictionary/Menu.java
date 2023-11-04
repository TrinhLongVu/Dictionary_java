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
        mainFrame.setSize(400, 400);

        controlPanel = new JPanel();

        tabby = new JTabbedPane();
        
        SearchSlang slang = new SearchSlang();

        tabby.addTab("Main", controlPanel);
        tabby.addTab("Search", slang);

        mainFrame.add(tabby);
        mainFrame.setVisible(true);
    }
}
