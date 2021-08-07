package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class vowelsAndConsonants {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int wordLength = scanner.nextInt();
        int maxVowels = scanner.nextInt();

        BigInteger ways = calculateWays(wordLength, maxVowels);

        System.out.println(ways);
    }

    private static BigInteger calculateWays(int wordLength, int maxVowels) {

        if(maxVowels == 0){

            long ways = 1;

//            for(int i = 0; i < wordLength; i++){
//
//                ways = 21 * ways;
//
//            }
            ways = (long) Math.pow(21,wordLength);
            return BigInteger.valueOf(ways);

        }
        else{

            if(wordLength == 1){

                int c = 1, v = 1;

                return BigInteger.valueOf((c * 21) + (v * 5));

            }
            else{

                long ways = 0, c, v;
                c = (long) Math.pow(21,wordLength-maxVowels);
                v = (long) Math.pow(5,maxVowels);
                ways = wordLength * (c * v);

//                for(int i = 0; i < wordLength; i++){
//
//                    long c = 1;
//                    long v = 1;
//
//
//                    for(int j = 0; j < wordLength - maxVowels; j++){
//
//                        c = c * 21;
//
//                    }
//
//                    for(int k = 0; k < maxVowels; k++){
//
//                        v = v * 5;
//
//                    }
//
//                    ways = ways + (v * c);
//
//                }

                long ways1 = 1;

//                for(int m = 0; m < wordLength; m++){
//
//                    ways1 = ways1 * 21;
//                }
                ways1 = (long) Math.pow(21,wordLength);

                return BigInteger.valueOf(ways + ways1);
            }

        }
    }
}
