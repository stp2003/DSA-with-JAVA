package arrayADT;

import java.util.Scanner;

public class _7_Reversing_an_Array {

    public static int[] TakeUserInput() {

        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter size of array: ");
        int size = s.nextInt();

        int[] arr = new int[size];

        System.out.print("\nEnter array element: ");
        for (int i = 0; i < size; i++) {

            arr[i] = s.nextInt();
        }

        return arr;
    }


    public static void reverse(int [] arr) {
        int low = 0, high = arr.length - 1;

        while (low < high) {
            // Swapping:
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int [] arr =TakeUserInput();

        reverse(arr);

        System.out.print("\nReverse Array is: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.print(" ]");

    }
}

