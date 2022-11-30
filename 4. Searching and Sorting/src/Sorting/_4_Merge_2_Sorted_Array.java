package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class _4_Merge_2_Sorted_Array {

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

    public static int[] merge_2_Sorted_Array_one(int[] arr1, int[] arr2) {

        int i = 0, j = 0, k = 0;
        int[] ans = new int[arr1.length + arr2.length];

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                ans[k] = arr1[i];
                k++;
                i++;
            } else {
                ans[k] = arr2[j];
                j++;
                k++;
            }
        }

        while (i < arr1.length) {
            ans[k] = arr1[i];
            k++;
            i++;
        }

        while (j < arr2.length) {
            ans[k] = arr2[i];
            k++;
            j++;
        }
        return ans;
    }


    public static void merge_2_Sorted_Array_two(int[] arr1, int[] arr2) {

        int i = 0, j = 0;
        int m = arr1.length;
        int n = arr2.length;

        while (i < m && j < n) {
            if (arr1[i] <= arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
            } else {
                System.out.print(arr2[j] + " ");
                j++;
            }
        }

        while (i < m) {
            System.out.print(arr1[i] + " ");
            i++;
        }
        while (j < n) {
            System.out.print(arr2[j] + " ");
            j++;
        }

    }


    public static void main(String[] args) {
        int[] arr1 = TakeUserInput();
        int[] arr2 = TakeUserInput();

        int[] ans = merge_2_Sorted_Array_one(arr1, arr2);
        System.out.println(Arrays.toString(ans));

        merge_2_Sorted_Array_two(arr1, arr2);

    }

}
