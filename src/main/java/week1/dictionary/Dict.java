/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.Dictionary;

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
public class Dict {

    private final HashMap<String, ArrayList<String>> _Dicts;
    private final HashMap<String, ArrayList<String>> _Define;

    Dict() {
        _Dicts = new HashMap<>();
        _Define = new HashMap<>();
    }

    public HashMap<String, ArrayList<String>> getDict(String NameFile) throws FileNotFoundException, IOException {
        try ( BufferedReader buff = new BufferedReader(new FileReader(NameFile))) {
            String line;
            while ((line = buff.readLine()) != null) {
                String[] Dict = line.split("`");
                if (Dict.length != 2) {
                    continue;
                }

                int length = Dict[1].length();
                String temp = "";
                String temp2 = "";
                for (int i = 0; i < length; i++) {
                    temp += Dict[1].charAt(i);
                    temp2 = Dict[0] + "`" + Dict[1];
                    if (!_Define.containsKey(temp)) {
                        ArrayList<String> values = new ArrayList<>();
                        values.add(temp2);
                        _Define.put(temp, values);
                    } else if (_Define.containsKey(temp)) {
                        _Define.get(temp).add(temp2);
                    }
                    if (Dict[1].charAt(i) == ' ') {
                        temp = "";
                    }
                }

                if (!_Dicts.containsKey(Dict[0])) {
                    ArrayList<String> values = new ArrayList<>();
                    values.add(Dict[1]);
                    _Dicts.put(Dict[0], values);
                } else {
                    _Dicts.get(Dict[0]).add(Dict[1]);
                }
            }
        }
        return _Dicts;
    }

    public HashMap<String, ArrayList<String>> getDefine() {
        return _Define;
    }

}
