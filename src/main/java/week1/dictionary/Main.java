/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package week1.Dictionary;

import java.io.IOException;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args){
        try {
            new Controller();
        } catch (IOException e) {
            // Handle the IOException here (e.g., print an error message)
            e.printStackTrace();
        }
    }
}

