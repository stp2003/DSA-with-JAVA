package com.company;
import java.util.Scanner;

public class _1_Number_Of_Digits {

    public static int countDigits(int number) {

        int count = 0;

        while (number > 0) {
            number = number/10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int x = countDigits(number);

        System.out.println("Number of Digits is = "+x);
    }
}
