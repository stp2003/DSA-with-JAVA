package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class _14_minimum_difference {

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

    public static int minDiff_Naive(int[] arr) {
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                res = Math.min(res, Math.abs((arr[i] - arr[j])));
            }
        }
        return res;
    }

    public static int minDiff_Efficient(int[] arr) {
        Arrays.sort(arr);
        int res = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            res = Math.min(res, (arr[i] - arr[i - 1]));
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = TakeUserInput();

        System.out.println(minDiff_Naive(arr));
        System.out.println(minDiff_Efficient(arr));
    }
}
