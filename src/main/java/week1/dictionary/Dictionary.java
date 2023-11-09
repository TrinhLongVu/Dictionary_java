/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package week1.dictionary;

import java.io.IOException;

/**
 *
 * @author Admin
 */
public class Dictionary {
    public static void main(String[] args){
        try {
            Controller menu = new Controller();
        } catch (IOException e) {
            // Handle the IOException here (e.g., print an error message)
            e.printStackTrace();
        }
    }
}

