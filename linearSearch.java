package com.company;

public class linearSearch {
    public static void main(String[] args) {
        int [] array = {100,20,15,30,5,75,40};
        int key1 = 5;
        int key2 = 9;
        for(int i=0;i<array.length;i++){
            if(array[i] == key1){
                System.out.println("index is : "+i+" value = "+array[i]);
            }else System.out.println("Key1 not found");

            if(array[i] == key2){
                System.out.println(i+"="+array[i]);
            }else System.out.println("Key2 not found");
        }
    }
}
