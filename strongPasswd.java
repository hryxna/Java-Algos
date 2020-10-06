package com.company;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class strongPasswd {

    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong

        int len = 0;
        if(n<=3) len = 6-n;
        if(n>3){
            int temp = mat(password);
            if(temp==1 && n<6 || temp==0 && n<6) len = 6-n;
            else len = temp;
        }

        return len;
    }

    private static int mat(String password) {
        int temp=0;

        Pattern numbers = Pattern.compile("[0-9]+");
        Pattern lower_case = Pattern.compile("[a-z]+");
        Pattern upper_case = Pattern.compile("[A-Z]+");
        Pattern special_characters = Pattern.compile("[-!@#$%^&*()+]+");


        Matcher num = numbers.matcher(password);
        Matcher lc = lower_case.matcher(password);
        Matcher uc = upper_case.matcher(password);
        Matcher sc = special_characters.matcher(password);

        if(!lc.find()) temp++;
        if(!num.find()) temp++;
        if(!sc.find()) temp++;
        if(!uc.find()) temp++;

        return temp;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

        System.out.println(String.valueOf(answer));

        scanner.close();
    }
}
