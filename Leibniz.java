package com.company;

import java.lang.*;
import java.util.*;

public class Leibniz {

    public static void main(String[]args){

        /*
           - Leibniz formula calculates value of pi till approximate value
           - which depends upon the value "k" provided by user
           - formula : π / 4 = [ (- 1) pow k ] / (2k + 1)
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Value of "+"\""+"k"+"\""+" : ");
        int k = scan.nextInt();

        long pi = 0;

        for(int i = 0; i < k; i++){

            /*
               - As we know that square of -1 will be (1) and cube will be (-1)
               - So we would directly use this instead of calculating again & again
            */

            if(k % 2 == 1) {
                pi += ((-1) / (2 * i + 1));
            }
            else{
                pi += (1 / (2 * i + 1));
            }

        }

        System.out.println(pi * 4.0);

    }
}
