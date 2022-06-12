package shashwat;
import java.util.Scanner;

public class _6_Factorial {

    public static int Factorial_Iterative(int number) {
        int factorial=1;

        for (int i = 2; i <= number ; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }

    public static int Factorial_Recursive_non_Tail(int number) {
        if (number == 0)
            return 1;
        return number * Factorial_Recursive_non_Tail(number - 1);
    }

    public static int Factorial_Recursive_Tail_Recursion(int number, int k) {
        if (number == 0  || number == 1)
            return k;
        return Factorial_Recursive_Tail_Recursion(number - 1, k * number);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int fact1 = Factorial_Iterative(number);
        System.out.println("Iterative: "+fact1);

        int fact2 = Factorial_Recursive_non_Tail(number);
        System.out.println("Recursive Non-Tail: "+ fact2);

        int fact3 = Factorial_Recursive_Tail_Recursion(number,1);
        System.out.println("Tail: " + fact3);

    }
}
