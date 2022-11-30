package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class _2_Bubble_Sort {


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

    public static int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    // Swap:
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = TakeUserInput();

        int[] ans = bubbleSort(arr);
        System.out.println(Arrays.toString(ans));

    }

}
