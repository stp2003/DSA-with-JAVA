package com.company;

import java.util.Scanner;

public class _4_Trailing_zeros_in_Factorial {

    // Naive Method: does not work on bigger numbers.
    public static int Count_Zeroes_Naive(int number) {

        int factorial = 1;
        for (int i = 2; i <= number ; i++) {
            factorial = factorial * i;
        }

        int zeroes = 0;
        while (factorial % 10 ==0) {
            zeroes++;
            factorial = factorial / 10;
        }

        return zeroes;
    }

    // Efficient Way:
    public static int Count_Zeroes_Efficient(int number) {
        int zeroes = 0;
        for (int i = 5; i <= number ; i = i * 5) {
            zeroes = zeroes + number / i;
        }

        return zeroes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int naive = Count_Zeroes_Naive(number);
        System.out.println(naive);

        int efficient = Count_Zeroes_Efficient(number);
        System.out.println(efficient);

    }
}
