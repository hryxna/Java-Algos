package com.company;
import java.lang.*;
import java.util.*;

public class substitutionCipher {

    public static void main(String[]args){
        Scanner cyscan = new Scanner(System.in);
        String key = null;

        // Loop will run until and unless user provides valid key which has no repetitive words.
        // has exact 26 characters in it.
        do {

            System.out.println("Enter the key : ");
            key = cyscan.nextLine();

        } while (!key.matches("[a-zA-Z]{26}?"));

        // taking plain-text from user
        System.out.println("plain-text : ");
        String text = cyscan.nextLine().trim();

        // function will return the cipher-text
        String cipher = substn(text,key);
        System.out.println("cipher-text : "+cipher);

    }

    private static String substn(String text, String key) {
        StringBuilder cypher = new StringBuilder(26);
        int len = text.length();

        for(int i = 0; i < len; i++){
            char temp = text.charAt(i);

            // here only characters which are alphabets are allowed
            if(Character.isAlphabetic(temp)){

                // preserving the case of character for Upper-Case
                if(Character.isUpperCase(temp)){
                    char k = (char) ((temp - 'A') % 26);
                    cypher.append(Character.toUpperCase(key.charAt(k)));
                }
                // preserving the case of character for Lower-Case
                else{
                    char k = (char) ((temp - 'a') % 26);
                    cypher.append(Character.toLowerCase(key.charAt(k)));
                }
            }
            // remaining non-alphabetic characters are appended as it is
            else{
                cypher.append(temp);
            }

        }
        return cypher.toString();

    }
}
