package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class _3_Insertion_Sort {

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


    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // insert i th element in sorted array:
            int j = i - 1;

            int temp = arr[i];
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            // Position will be j+1
            arr[j + 1] = temp;

        }

        return arr;
    }


    public static void main(String[] args) {
        int[] arr = TakeUserInput();

        int[] ans = insertionSort(arr);
        System.out.println(Arrays.toString(ans));

    }

}

