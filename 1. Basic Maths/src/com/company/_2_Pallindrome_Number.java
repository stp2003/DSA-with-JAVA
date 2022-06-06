package com.company;
import java.util.Scanner;

public class _2_Pallindrome_Number {

     public static boolean isPallindrome(int number) {

        int reverse = 0;
        int temp = number;

        while (temp != 0) {

            int lastDigit = temp % 10;
            reverse=reverse * 10 + lastDigit;
            temp = temp / 10;
        }

        return (reverse == number);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        boolean bool = isPallindrome(number);

        System.out.println(bool);

    }
}
