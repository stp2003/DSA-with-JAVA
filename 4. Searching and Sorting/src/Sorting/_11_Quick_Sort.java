package Sorting;

import java.util.Scanner;

public class _11_Quick_Sort {

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

    public static int lomuto_partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] <= pivot) {
                i++;
                Swap(arr, i, j);
            }
        }
        Swap(arr, i + 1, high);
        return (i + 1);
    }

    public static int haore_partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low - 1, j = high + 1;

        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);
            do {
                j--;
            } while (arr[j] > pivot);

            if (i >= j)
                return j;

            Swap(arr, i, j);

        }
    }


    public static void quickSort_lomuto(int[] arr, int low, int high) {
        if (low < high) {
            int p = lomuto_partition(arr, low, high);
            quickSort_lomuto(arr, low, p - 1);
            quickSort_lomuto(arr, p + 1, high);
        }
    }

    public static void quickSort_haore(int[] arr, int low, int high) {
        if (low < high) {
            int p = haore_partition(arr, low, high);
            quickSort_haore(arr, low, p);
            quickSort_haore(arr, p + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = TakeUserInput();
        int si = 0, ei = arr.length - 1;

        quickSort_lomuto(arr, si, ei);
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();

        quickSort_haore(arr, si, ei);
        for (int k : arr) {
            System.out.print(k + " ");

        }

    }
}
