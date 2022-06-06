package com.company;

import java.util.Scanner;

public class _5_GCD {

    // Naive Method:
    public static int GCD_Naive(int number1, int number2) {

        int res = Math.min(number1,number2);

        while (res > 0) {
            if (number1 % res == 0 && number2 % res == 0) {
                break;
            }
            res--;
        }

        return res;
    }

    // Euclidean Way:
    public static int GCD_Euclidean(int number1, int number2) {

        while (number1 != number2) {
            if (number1 > number2)
                number1 = number1 - number2;
            else
                number2 = number2 - number1;
        }
        return number1;
    }

    // Efficient Euclidean Way:
    public static int GCD_Efficient_Euclidean(int number1, int number2) {
        if (number2 == 0)
            return number1;
        else
            return GCD_Efficient_Euclidean(number2, number1 % number2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        int naive = GCD_Naive(number1,number2);
        System.out.println(naive);

        int euclidean = GCD_Euclidean(number1, number2);
        System.out.println(euclidean);

        int efficient_euclidean = GCD_Efficient_Euclidean(number1,number2);
        System.out.println(efficient_euclidean);

    }
}
