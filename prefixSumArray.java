package com.company;

import java.lang.*;
import java.util.*;

// input : 6 3 -2 4 -1 0 -5

// output : 6 9 7 11 10 10 5


// Time complexity is O(n)

// formula for finding sum for a given range : A[i,j] = A[j] - A[i-1]
// i.e if range is (2,6) -> A[0,6] = A[0,1] + A[2,6] -> A[2,6] = A[0,6] - A[0,1]

public class prefixSumArray {
    public static int [] prearray;
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        prearray = new int [n];

        for(int i = 0; i < n; i++){
            prearray[i] = in.nextInt();
        }

        prefixSum(n, prearray);

    }

    private static void prefixSum(int n, int[] prearray) {
        //int sum = 0;
        for(int j = 1; j < n; j++){
            prearray[j] = prearray[j - 1] + prearray[j];
        }

        for(int k : prearray){
            System.out.print(k+" ");
        }
    }
}
