package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class _8_Union_of_2_Sorted_Arrays {

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

    public static void union_Naive(int[] a, int[] b) {
        int m = a.length;
        int n = b.length;
        int[] c = new int[m + n];

        for (int i = 0; i < m; i++) {   // coping first array into c
            c[i] = a[i];
        }
        for (int i = 0; i < n; i++) {  // coping second array to c
            c[m + i] = b[i];
        }

        Arrays.sort(c);  // sorting c

        for (int i = 0; i < m + n; i++) {
            if (i == 0 || c[i] != c[i - 1])  // checking for duplicates
                System.out.print(c[i] + " ");
        }

    }

    public static void union_Efficient(int[] a, int[] b) {
        int m = a.length;
        int n = b.length;

        int i = 0, j = 0;

        while (i < m && j < n) {
            if (i > 0 && a[i] == a[i - 1]) {       // for checking duplicates
                i++;
                continue;
            }
            if (j > 0 && b[j] == b[j - 1]) {      // for checking duplicates
                j++;
                continue;
            }

            if (a[i] < b[j]) {
                System.out.print(a[i] + " ");
                i++;
            } else if (a[i] > b[j]) {
                System.out.print(b[j] + " ");
                j++;
            } else {
                System.out.print(a[i] + " ");
                i++;
                j++;
            }

            while (i < m) {
                if (i > 0 && a[i] != a[i - 1]) {       // for checking duplicates
                    System.out.print(a[i] + " ");
                    i++;
                }
            }
            while (j < n) {
                if (j > 0 && b[j] != b[j - 1]) {      // for checking duplicates
                    System.out.print(b[j] + " ");
                    j++;
                }
            }

        }

    }

    public static void main(String[] args) {
        int[] arr1 = TakeUserInput();
        int[] arr2 = TakeUserInput();

        union_Naive(arr1, arr2);

        union_Efficient(arr1, arr2);

    }

}
