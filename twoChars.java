package com.company;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

//10
//beabeefeab
//5

public class twoChars {

    // Complete the alternate function below.
    static int alternate(String s) {

        int len =0;

        HashMap<Integer,Character> charMap = new HashMap<>(s.length());

        System.out.println(charMap);


        return len;
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int l = Integer.parseInt(sc.nextLine().trim());

        String s = sc.next();

        int result = alternate(s);

        System.out.println(String.valueOf(result));

        sc.close();

    }
}
