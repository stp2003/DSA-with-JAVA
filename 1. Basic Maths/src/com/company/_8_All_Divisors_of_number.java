package com.company;
import java.util.Scanner;

public class _8_All_Divisors_of_number {

    // Naive way:
    public static void printDivisors_Naive(int number) {
        for (int i = 1; i <= number ; i++) {
            if (number % i == 0)
                System.out.print(" " + i);
        }
    }

    // Efficient Way:
    public static void printDivisors_Efficient(int number) {
        for (int i = 1; i * i <= number ; i++) {
            if (number % i == 0) {
                System.out.print(" " + i);

                if (i != number / i)
                    System.out.print(" " + number / i);
            }

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        printDivisors_Naive(number);
        System.out.println();

        printDivisors_Efficient(number); // this method does not print factors in sorted order.
    }
}
