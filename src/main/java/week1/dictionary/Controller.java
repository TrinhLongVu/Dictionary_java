/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.Dictionary;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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
        mainFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        mainFrame.setSize(360, 400);
        HashMap<String, ArrayList<String>> Dicts = new HashMap<>();
        
        Dict d = new Dict();
        
        Dicts = d.getDict("./slangData.txt");
        tabby = new JTabbedPane();
        tabby.addTab("Slang", new SearchSlang(Dicts));
        tabby.addTab("Define", new DefineSearch(Dicts, d.getDefine()));
        tabby.addTab("CRUD", new CRUD(Dicts));
        tabby.addTab("Slang Day", new SlangWordDays(Dicts));        
        tabby.addTab("Random Slang", new RandomSlang(Dicts));        
        tabby.addTab("Random Define", new RandomDefinition(Dicts));
        mainFrame.add(tabby);

        HashMap<String, ArrayList<String>> finalDicts = Dicts;
        mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int result = JOptionPane.showConfirmDialog(mainFrame,
                        "Are you sure you want to close this application?",
                        "Confirm Close", JOptionPane.YES_NO_OPTION);

                if (result == JOptionPane.YES_OPTION) {
                    try {
                        WriteToFile temp = new WriteToFile("./slangData.txt");
                        temp.writefile(finalDicts);
                        temp.close();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    System.exit(0);
                }
            }
        });
        mainFrame.setVisible(true);
    }
}
