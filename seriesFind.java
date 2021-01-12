package com.company;
import java.lang.*;
import java.util.*;

public class seriesFind {
    public static void main(String[]args){

        Scanner sscan = new Scanner(System.in);
        
        System.out.println("Enter the value of f : ");
        int f = sscan.nextInt();
        System.out.println("Enter the value of s : ");
        int s = sscan.nextInt();
        
        System.out.println("Enter the value of n to find Nth Term: ");
        int nt = sscan.nextInt();
        int term = 0;
        
        // Addition type of series and Nth term calculation
        for(int i = 1; i < (nt / 2) + 2; i++){
            
            term = f * s;
            System.out.print(term+" "+(term-s)+" ");
            s++;
        }
        System.out.println("Nth term is: "+term);
    }
}
