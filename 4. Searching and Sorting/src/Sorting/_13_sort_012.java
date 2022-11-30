package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class _13_sort_012 {

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

    public static void Swap(int[] array, int position1, int position2) {
        int temp = array[position1];
        array[position1] = array[position2];
        array[position2] = temp;
    }

    public static void sort012(int[] arr) {
        int l = 0, h = arr.length - 1, mid = 0;
        while (mid <= h) {
            if (arr[mid] == 0) {
                Swap(arr, arr[l], arr[h]);
                l++;
                mid++;
            } else if (arr[mid] == 1)
                mid++;
            else {
                Swap(arr, arr[mid], arr[h]);
                h--;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = TakeUserInput();

        sort012(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
