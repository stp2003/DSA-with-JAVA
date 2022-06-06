package com.company;

import java.util.Scanner;

public class _3_Factorial_of_a_number {

    public static int Factorial_Iterative(int number) {
        int factorial=1;

        for (int i = 2; i <= number ; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }

    public static int Factorial_Recursive(int number) {
        if (number == 0)
            return 1;
        return number * Factorial_Recursive(number - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int fact1 = Factorial_Iterative(number);
        System.out.println("Iterative: "+fact1);

        int fact2 = Factorial_Recursive(number);
        System.out.println("Recursive: "+ fact2);


    }
}
