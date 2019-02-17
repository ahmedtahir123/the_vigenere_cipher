/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the_vigenere_cipher;

import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class INC_OR_DEC {

    String str = "";

    public INC_OR_DEC() {
    }

    String Incrip(ArrayList<String> w, ArrayList<String> h) {
        int k = 0;
        int a = 97;

        while (w.size() != h.size()) {
            h.add(h.get(k));
            k++;
        }

        for (int i = 0; i < w.size(); i++) {

            a = w.get(i).hashCode() + h.get(i).hashCode();
            a -= (2 * 97);
            if (a > 26) {
                a -= 26;
                char q = (char) (a + 97);
                str += Character.toString(q);

            } else {
                char q = (char) (a + 97);
                str += Character.toString(q);
            }

        }

        return str;

    }

    String Decrip(ArrayList<String> w, ArrayList<String> h) {
        int k = 0;
        int a = 97;

        while (w.size() != h.size()) {
            h.add(h.get(k));
            k++;
        }

        for (int i = 0; i < w.size(); i++) {

            a = w.get(i).hashCode() - h.get(i).hashCode();
            if (a < 0) {
                a += 26;
                char q = (char) (a + 97);
                str += Character.toString(q);

            } else {
                char q = (char) (a + 97);
                str += Character.toString(q);
            }

        }

        return str;

    }

}
