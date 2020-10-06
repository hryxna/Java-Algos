package com.company;

import java.io.*;
import java.util.Stack;

//aaabccddd

public class reducedStr {

    // Complete the superReducedString function below.
    static String superReducedString(String s) {

        Stack<Character> stringStack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(!stringStack.isEmpty() && stringStack.peek().equals(c)){
                stringStack.pop();
            }
            else{
                stringStack.push(c);
            }

        }

        if(stringStack.isEmpty()){
            return "Empty String";
        }else{
            stringStack.forEach(sb::append);
        }

        return sb.toString();

    }

    public static void main(String[] args) throws IOException , NullPointerException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = superReducedString(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
