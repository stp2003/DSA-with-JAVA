package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class _5_Merge_by_low_mid_high {

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

    public static int[] merge(int[] arr, int low, int mid, int high) {

        int n1 = mid - low + 1, n2 = high - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[low + i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = arr[n1 + i];
        }

        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                k++;
                i++;
            } else {
                arr[k] = right[j];
                j++;
                k++;
            }
        }

        while (i < n1) {
            arr[k] = left[i];
            k++;
            i++;
        }

        while (j < n2) {
            arr[k] = right[i];
            k++;
            j++;
        }

        return arr;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = TakeUserInput();

        int low = scanner.nextInt();
        int mid = scanner.nextInt();
        int high = scanner.nextInt();

        int[] ans = merge(arr, low, mid, high);
        System.out.println(Arrays.toString(ans));

    }

}
