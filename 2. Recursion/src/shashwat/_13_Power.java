package shashwat;
import java.util.Scanner;

// X ke power n
public class _13_Power {

    // Naive way:
    public static int Naive_Power(int X, int n) {
        if (n == 0)
            return 1;
        return Naive_Power(X,n - 1) * X;
    }

    // Improved way:
    public static int Improved_Power(int X, int n) {
        if(n==0)
            return 1;

        if(n%2==0)
            return Improved_Power(X * X, n/2);
        else
            return X * Improved_Power(X * X, (n-1)/2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int n = scanner.nextInt();

        int naive = Naive_Power(X,n);
        System.out.println("Naive: " + naive);

        int improved = Improved_Power(X,n);
        System.out.println("Improved: " + improved);
    }
}
