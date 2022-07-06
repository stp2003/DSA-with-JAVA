package shashwat;
import java.util.Scanner;

public class _3_Moving_Array_to_Functions {

    public static int[] TakeUserInput() {

        Scanner s = new Scanner(System.in);

        System.out.print("\nEnter size of array: ");
        int size = s.nextInt();

        int [] arr = new int[size];

        System.out.print("\nEnter Array element:  ");
        for (int i = 0; i < size; i++) {

            arr[i] = s.nextInt();
        }

        return arr;
    }

    public static void PrintArray(int[] arr) {

        System.out.print("\nThe array is: [");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.print("]\n\n");

    }

    public static void main(String[] args) {
        int[] arr = TakeUserInput();

        PrintArray(arr);

    }

}
