package shashwat;
import java.util.Scanner;

public class _3_Print_1_to_N {

    public static void print_1_to_N(int n) {
        if (n == 0)
            return;
        print_1_to_N(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        print_1_to_N(n);
    }
}
