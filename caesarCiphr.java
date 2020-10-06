package com.company;

import java.io.IOException;
import java.util.Scanner;

public class caesarCiphr {

    // Complete the caesarCipher function below.
    static String caesarCipher(String s, int k) {

        StringBuilder sb = new StringBuilder(s.length());

        for(int i=0;i<s.length();i++){
            char sc = s.charAt(i);
            int c = s.charAt(i);
            if(Character.isAlphabetic(sc)){
                if(c>=65 && c<=90){
                    int ct = (c + k - 65) % 26 + 65;
                    char t = (char) ct;
                    sb.append(t);
                }
                if(c>=97 && c<=122){
                    int ct = (c + k - 97) % 26 + 97;
                    char t = (char) ct;
                    sb.append(t);
                }
            }
            else{
                char t = (char) c;
                sb.append(t);
            }
        }
        return sb.toString();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = caesarCipher(s, k);

        System.out.println(result);

        scanner.close();
    }
}
