package shashwat;

import java.util.Scanner;

public class _4_Print_N_to_1 {

    public static void print_N_to_1(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        print_N_to_1(n-1);  // Tail-Recursion
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        print_N_to_1(n);

    }
}
