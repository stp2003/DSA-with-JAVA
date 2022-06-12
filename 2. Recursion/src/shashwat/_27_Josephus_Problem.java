package shashwat;

import java.util.Scanner;

// GFG
public class _27_Josephus_Problem {

    public static int josephus_Problem(int n, int kill) {
        if (n == 0)
            return 0;

        else
            return (josephus_Problem( n - 1, kill) + kill ) % n;  // formula
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int kill = scanner.nextInt();

        int ans = josephus_Problem(n, kill);
        System.out.println(ans);

    }
}
