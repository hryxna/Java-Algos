package com.company;

public class binarySearch {

    static int binary(int low , int high , int key){
        // recursion
        /*

        if(low > high){
            return -1;
        }
        int mid = (low + high) / 2;
        if(arr[mid] == key) return mid;

        if(key < arr[mid]) return binary(low,mid-1,key);
        else return binary(mid+1,high,key);

        */

        // iterative
        while(low<= high){
            int mid = (low + high) / 2;
            if(arr[mid] == key) return mid;

            if(key < arr[mid]) high = mid -1;
            else low = mid+1;
        }
        return -1;
    }

    static int [] arr = {5, 15, 20, 30, 40, 75, 100};
    public static void main(String[] args) {
        int key1 = 15;
        int key2 = 55;
        int key3 = 75;

        int result1 = binary(0,arr.length-1,key1);
        int result2 = binary(0,arr.length-1,key2);
        int result3 = binary(0,arr.length-1,key3);

        if(result1 == -1) System.out.println("key1 not found");
        else System.out.println("key1 value is at Index : "+result1);

        if(result2 == -1) System.out.println("key2 not found");
        else System.out.println("key2 value is at Index : "+result2);

        if(result3 == -1) System.out.println("key3 not found");
        else System.out.println("key3 value is at Index : "+result3);
    }
}
