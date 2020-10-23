package com.company;

import java.util.*;

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

    private static String longSubString(String s, String result) {

        int counter =0;
        int max =0;

        for(int i=0;i<result.length();i++){

            for(int j=1;j<result.length();j++){

                if(s.contains(result.substring(i,j))){
                    max++;
                    if(max > counter)
                    {
                        counter = max;
                    }
                }
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) throws NullPointerException {

        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        String result = superReducedString(s);

        String longestSubString = longSubString(s,result);

        System.out.println(result);

        System.out.println(longestSubString);

        scan.close();
    }


}
