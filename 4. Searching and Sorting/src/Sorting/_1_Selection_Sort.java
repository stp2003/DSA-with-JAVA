package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class _1_Selection_Sort {


    public static int[] TakeUserInput() {

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("\nEnter array element: ");
        for (int i = 0; i < size; i++) {

            arr[i] = sc.nextInt();
        }

        return arr;
    }


    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {  // insert element at i th position

            int min = Integer.MAX_VALUE;
            int minIndex = -1;

            for (int j = i; j < arr.length; j++) {  // finding the minimum element among j th position
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            // Swap element at minIndex with i th element ->
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }
        return arr;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = TakeUserInput();

        int[] ans = selectionSort(arr);
        System.out.println(Arrays.toString(ans));

    }
}

