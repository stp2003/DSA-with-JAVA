package shashwat;

import java.util.Scanner;

public class _10_Sum_of_Digits {

    public static int getSum(int n) {
        if (n == 0)
            return 0;
        else
            return getSum(n/10) + n % 10;
    }

    public static int Iterative_Sum(int n) {
        int res = 0;
        while (n >= 0) {
            res = res + n % 10;
            n = n/10;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = getSum(n);
        System.out.println(sum);
    }
}
