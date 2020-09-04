package com.company;

import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int [] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }

        int totalPass =0;
        int currLength = arr.length - 1;

        while(true){
            int pass =0;
            for(int i=0; i<currLength; i++){
                if(arr[i] > arr[i+1]){
                    int temp =arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;

                    pass++;
                }
            }
            totalPass += pass;
            currLength--;

            if(pass ==0) break;
        }

        System.out.println(totalPass);
        for (int a: arr) {
            System.out.print(a+", ");
        }
    }
}
