package shashwat;

import java.util.Scanner;

public class _8_Sum_of_N_Natural_Number {

    public static int Direct(int n) {
        return n * (n + 1) / 2;
    }

    public static int Iterative (int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static int Recursive (int n) {
        if (n == 0)
            return 0;
        return n + Recursive(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();

        int direct = Direct(n);
        System.out.println(direct);

        int iterative = Iterative(n);
        System.out.println(iterative);

        int recursive = Recursive(n);
        System.out.println(recursive);
    }
}
