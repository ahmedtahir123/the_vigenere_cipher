/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the_vigenere_cipher;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import static javafx.scene.input.KeyCode.W;

/**
 *
 * @author dell
 */
public class The_vigenere_cipher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        ArrayList<String> A1 = new ArrayList<String>();
        ArrayList<String> A2 = new ArrayList<String>();

        FileReader fr;
        String s = "C:\\Users\\dell\\Documents\\NetBeansProjects\\the_vigenere_cipher\\src\\the_vigenere_cipher\\Plaintext.txt";
        BufferedReader br = new BufferedReader(new FileReader(s));
        String h = br.readLine();
        String w[] = h.split("");

        System.out.println("Input Key");
        Scanner input = new Scanner(System.in);
        h = input.nextLine();
        String w1[] = h.split("");
        System.out.println("select a option you want \n1-incrip \n2-decrip");
        h = input.nextLine();

        for (int i = 0; i < w.length; i++) {
            if (w[i] == null) {
            } else {
                A1.add((Character.toString(w[i].charAt(0))));
            }
        }
        for (int i = 0; i < w1.length; i++) {
            if (w1[i] == null) {

            } else {
                A2.add((Character.toString(w1[i].charAt(0))));
            }
        }
        INC_OR_DEC A = new INC_OR_DEC();
        if (h.equals("1")) {
            System.out.println(A.Incrip(A1, A2));
        } else if (h.equals("2")) {
            System.out.println(A.Decrip(A1, A2));

        } else {
            System.out.println("wrong choise");
        }

    }

}
