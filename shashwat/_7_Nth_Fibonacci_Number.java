package shashwat;
import java.util.Scanner;

public class _7_Nth_Fibonacci_Number {

    public static int Nth_Fibonacci_Number(int n) {
        if (n <= 1)
            return n;

        return Nth_Fibonacci_Number(n - 1) + Nth_Fibonacci_Number(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int fibo = Nth_Fibonacci_Number(n);
        System.out.println(fibo);
    }
}
