package shashwat;

import java.util.Scanner;

public class _14_Number_of_Digits {

    public static int count (int n) {
        if (n == 0)
            return 0;

        int small = count(n / 10);
        return small + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int ans = count(n);
        System.out.println(ans);
    }
}
