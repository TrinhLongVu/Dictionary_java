/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.dictionary;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.*;

/**
 *
 * @author Admin
 */
public class Controller {

    private JFrame mainFrame;
    private JTabbedPane tabby;

    public Controller() throws IOException {
        createAndShowGUI();
    }

    private void createAndShowGUI() throws IOException {
        mainFrame = new JFrame("CardLayoutDemo");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(360, 400);
        HashMap<String, ArrayList<String>> Dicts = new HashMap<>();
        Dicts = new Dictionary().getDict();
        tabby = new JTabbedPane();

        tabby.addTab("Slang", new SearchSlang(Dicts));
        tabby.addTab("definition", new DefineSearch());
        tabby.addTab("CRUD", new CRUD(Dicts));

        mainFrame.add(tabby);
        mainFrame.setVisible(true);
    }
}
