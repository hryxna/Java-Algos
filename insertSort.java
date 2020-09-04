package com.company;

import java.util.Scanner;

public class insertSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int [] arr = new int[len];

        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }


        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j= i-1;

            while (j>=0 && key < arr[j]){
                // here the key place is null and putting val of elem into that place
                arr[j+1] = arr[j];
                j--;
            }
            // here putting the smallest value into its designate place
            arr[j+1] = key;
        }

        for(int a : arr){
            System.out.print(a+", ");
        }
    }
}
