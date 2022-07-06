package shashwat;
import java.util.Scanner;

public class _4_Sum_of_Array_Elements {

    public static int[] TakeUserInput() {

        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter size of array: ");
        int size = s.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter array element: ");
        for (int i = 0; i < size; i++) {

            arr[i] = s.nextInt();
        }

        return arr;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int sumRecursive(int [] arr, int n) {

        if (n < 0)
            return 0;
        else
            return sumRecursive(arr, n - 1) + arr[ n ];
    }

    public static void main(String[] args) {

        int [] arr = TakeUserInput();
        int n = arr.length;

        System.out.print("Sum is: " + sum(arr));
        System.out.print("\nAverage is: " + (sum(arr)) / arr.length);

        System.out.print("\nRecursive Sum is: " + sumRecursive(arr, n - 1));

    }
}
