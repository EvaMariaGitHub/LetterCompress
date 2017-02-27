package com.simplon;

import java.util.*;

/**
 * Created by alonso on 27/02/17.
 */
public class LetterCompress {
    private String letterString;

    private TreeMap<Character, Integer> tm1 = new TreeMap<>();


    public LetterCompress(String letterString) {
             this.letterString = letterString;
     }

     public String compression() {
         if(letterString != null) {
             for (Character c : letterString.toCharArray()) {
                 int newOcc = 1;
                 if (tm1.containsKey(c)) {
                     newOcc = tm1.get(c) + 1;
                 }
                 this.tm1.put(c, newOcc);
             }
             return mapToString();
         } else {
             return "";
         }
    }

    private String mapToString(){
        String result = "";
        for (Character c : tm1.keySet()){
            result = result+c+tm1.get(c);
        }
        return result;
    }
}
