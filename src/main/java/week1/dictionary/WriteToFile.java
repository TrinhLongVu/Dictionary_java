package week1.Dictionary;

import java.io.*;
import java.util.*;

public class WriteToFile {
    private BufferedWriter buff;

    WriteToFile(String name) throws IOException {
        // Set the second parameter to 'false' to overwrite the file
        buff = new BufferedWriter(new FileWriter(name, false));
    }

    void writefile(HashMap<String, ArrayList<String>> Dicts) throws IOException {
        String contentToWrite;

        ArrayList<String> value;
        for (Map.Entry<String, ArrayList<String>> entry : Dicts.entrySet()) {
            String key = entry.getKey();
            value = entry.getValue();

            for (int i = 0; i < value.size(); i++) {
                contentToWrite = key + '`' + value.get(i);
                buff.write(contentToWrite);
                buff.newLine();
            }
        }
    }

    void close() throws IOException {
        if (buff != null) {
            buff.close();
        }
    }
}
