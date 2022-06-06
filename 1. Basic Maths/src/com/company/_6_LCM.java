package com.company;
import java.util.Scanner;

public class _6_LCM {

    // Naive Way:
    public static int LCM_Naive(int number1, int number2)
    {
        int res = Math.min(number1, number2);

        while (true)
        {
            if (res % number1 == 0 && res % number2 == 0) {
                return res;
            }
            res++;
        }
    }

    // Efficient Way: By using formula: [ a*b = gcd(a,b) * lcm(a,b) ]
    public static int GCD_Efficient_Euclidean(int number1, int number2) {
        if (number2 == 0)
            return number1;
        else
            return GCD_Efficient_Euclidean(number2, number1 % number2);
    }

    public static int LCM_Efficient(int number1, int number2) {
        return (number1 * number2) / (GCD_Efficient_Euclidean(number1, number2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        int naive = LCM_Naive(number1,number2);
        System.out.println(naive);

        int effective = LCM_Efficient(number1,number2);
        System.out.println(effective);
    }
}
