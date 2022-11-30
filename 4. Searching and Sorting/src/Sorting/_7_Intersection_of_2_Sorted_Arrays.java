package Sorting;

import java.util.Scanner;

public class _7_Intersection_of_2_Sorted_Arrays {

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

    public static void intersection_Naive(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;

        for (int i = 0; i < m; i++) {
            if (i > 0 && arr1[i] == arr1[i - 1])  // for checking duplicates
                continue;

            for (int j = 0; j < n; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }

    }

    public static void intersection_Efficient(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int i = 0, j = 0;

        while (i < m && j < n) {
            if (i > 0 && arr1[i] == arr1[i - 1]) {// for checking duplicates
                i++;
                continue;
            }
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }

    }

    public static void main(String[] args) {

        int[] arr1 = TakeUserInput();
        int[] arr2 = TakeUserInput();

        intersection_Naive(arr1, arr2);     // works on any array

        intersection_Efficient(arr1, arr2);   // only works when both the arrays are sorted

    }

}
