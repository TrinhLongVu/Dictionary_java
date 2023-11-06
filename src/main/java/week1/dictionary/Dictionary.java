/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.dictionary;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Admin
 */
public class Dictionary {

    private final HashMap<String, ArrayList<String>> _Dicts;
    Dictionary() {
        _Dicts = new HashMap<>();
    }

    public HashMap<String, ArrayList<String>> getDict() throws FileNotFoundException, IOException {
        try ( BufferedReader buff = new BufferedReader(new FileReader("./Slang.txt"))) {
            String line;
            while ((line = buff.readLine()) != null) {
                String[] Dict = line.split("`");
                if (Dict.length != 2) {
                    continue;
                }
                ArrayList<String> values = new ArrayList<>();
                if (_Dicts.containsKey(Dict[0]) || values.isEmpty()) {
                    values.add(Dict[1]);
                }
                _Dicts.put(Dict[0], values);
            }
        }
        return _Dicts;
    }
}
