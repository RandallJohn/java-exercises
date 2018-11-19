package org.launchcode.java.studios;

import java.util.HashMap;

public class counting_Char {

   HashMap<Character, Integer> map = new HashMap<Character, Integer>();
   String a = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";

    for (int i = 0; i < a.length(); i++) {
        char c = a.charAt(i);
        Integer val = map.get(c);
        if (val != null) {
            map.put(c, new Integer(val + 1));
        }
        else {
            map.put(c, 1);
        }
    }


}
