package com.company;
import java.lang.*;
import java.util.*;

public class LuhnsAlgo {
    public static void main(String[]args){

        //Step 1: Take user-input and it should only be positive no's without any "-" or any other special character
        Scanner nsc = new Scanner(System.in);
        String creditCardNo;
        do {

            System.out.println("Please Enter the Credit-Card No : ");
            creditCardNo = nsc.next().replaceAll("[ -]","");

        }while( creditCardNo.matches("[a-zA-Z]+")|| Long.parseLong(creditCardNo) <= 0 );

        Long cc_no = Long.parseLong(creditCardNo);

        //Step 2: check whether the length of the credit no. are valid or not

        //we can directly find the length using built-in string function to make the process easy
        int c_Length = creditCardNo.length();

        // this is a custom length valid function
        if(lengthIsValid(cc_no) || c_Length == 13 || c_Length == 15 || c_Length == 16){

            
        }

        System.out.println(cc_no);




    }

    private static boolean lengthIsValid(Long cc_no) {

        int length = 0;
        while(cc_no != 0){
            cc_no /= 10;
            length++;
        }

        return length == 13 || length == 15 || length == 16;
    }
}
