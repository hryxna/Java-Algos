package com.company;

import java.lang.*;
import java.util.*;
// Coleman-Liau index

public class readability {
    public static void main(String[]args)
    {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the String :");
            String input = scanner.nextLine();
            int strlen, letters, words, sent;

            strlen = input.length();

            letters = words = sent = 0;

            for (int i = 0; i < strlen; i++)
            {
                if(Character.isAlphabetic(input.charAt(i)))
                {
                    letters++;
                }

                if(input.charAt(i) == ' ')
                {
                   words++;
                }

                if(input.charAt(i) == '?' || input.charAt(i) == '.' || input.charAt(i) == '!')
                {
                    sent++;
                }
            }

            // L is the average number of letters per 100 words in the text
            float L = (letters / (float) words) * 100;

            // S is the average number of sentences per 100 words in the text
            float S = (sent / (float) words) * 100;

            int index = (int) Math.round(0.0588 * L - 0.296 * S - 15.8);

            if(index < 1)
                System.out.println("Before Grade 1");
            else if(index >= 16)
                System.out.println("Grade 16+");
            else
                System.out.println("Grade "+index);

    }
}
