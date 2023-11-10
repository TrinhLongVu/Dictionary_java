/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.Dictionary;

import java.awt.BorderLayout;
import javax.swing.*;

/**
 *
 * @author Admin
 */
import java.time.LocalDate;
import java.util.*;

public class SlangWordDays extends JPanel {

    private HashMap<String, ArrayList<String>> Dicts;

    SlangWordDays(HashMap<String, ArrayList<String>> d) {
        Dicts = d;
        UI();
    }

    private void UI() {
        LocalDate today = LocalDate.now();
        long seed = today.toEpochDay();
        Random random = new Random(seed);

        List<String> words = new ArrayList<>(Dicts.keySet());

        int randomIndex = random.nextInt(words.size());

        String wordOfTheDay = words.get(randomIndex);
        ArrayList<String> defineWordOfTheDay = Dicts.get(wordOfTheDay);

        setLayout(new BorderLayout());
        
        add(new JLabel(wordOfTheDay), BorderLayout.NORTH);
        
        JPanel center = new JPanel();
        
        for (int i = 0; i < defineWordOfTheDay.size(); i++) {
            center.add(new JLabel(defineWordOfTheDay.get(i)));
        }
        add(center, BorderLayout.CENTER);

    }
}
