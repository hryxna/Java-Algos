package com.company;

import java.util.*;

public class medianOf2SortedArrays {

    private static float findMedian(ArrayList<Integer> arrayList, int n, Scanner scan) {
        int len = arrayList.size() + n;

        System.out.println("Enter the values into array-2 :");

        for(int j=n; j<len;j++){
            arrayList.add(scan.nextInt());
        }
        Collections.sort(arrayList);
        float med = 0;
        if(len % 2 == 0){
            int size = arrayList.size() / 2;
            med = (float)( arrayList.get(size - 1) + arrayList.get(size) ) / 2;
            return med;
        }
        else{
            med = (int) arrayList.size() / 2;
            return arrayList.get((int) med - 1);
        }

    }

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the sizes of array-1 & array-2 :");
        int m = scan.nextInt();
        int n = scan.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Enter the values into array-1 :");
        for(int i=0;i<m;i++){
            arrayList.add(scan.nextInt());
        }

        float median = findMedian(arrayList,n,scan);

        System.out.println("Median of two arrays is : "+median);

    }

}
