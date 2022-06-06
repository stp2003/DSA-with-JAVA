package com.company;
import java.util.Scanner;

public class _7_Prime_Number {

    // Naive
    public static boolean Check_Prime_Naive(int number) {
        if (number == 1)
            return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    // Efficient:
    public static boolean isPrime_Efficient(int number) {
        if (number == 1)
            return false;
        for (int i = 2; i *i <= number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    // More efficient:
    public static boolean is_Prime_MoreEfficient(int number) {
        if (number == 1)  return false;
        if (number == 2 || number == 3)  return true;
        if (number % 2 == 0 || number % 3 == 0)  return false;

        for (int i = 5; i *i <= number ; i=i+6) {
            if (number % i == 0 || number % (i+2) == 0)  return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        boolean naive = Check_Prime_Naive(number);
        System.out.println(naive);

        boolean efficient = isPrime_Efficient(number);
        System.out.println(efficient);

        boolean moreEfficient = is_Prime_MoreEfficient(number);
        System.out.println(moreEfficient);

    }
}
