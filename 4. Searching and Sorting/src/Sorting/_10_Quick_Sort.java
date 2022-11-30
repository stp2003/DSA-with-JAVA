package Sorting;

import java.util.Scanner;

public class _10_Quick_Sort {

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

    public static int partition(int[] arr, int startIndex, int endIndex) {
        int pivot = arr[startIndex];
        int countSmaller = 0;
        for (int i = startIndex + 1; i <= endIndex; i++) {
            if (arr[i] <= pivot)
                countSmaller++;
        }
        int pivotIndex = countSmaller + startIndex;
        arr[startIndex] = arr[pivotIndex];
        arr[pivotIndex] = pivot;

        int i = startIndex, j = endIndex;
        while (i < pivotIndex && j > pivotIndex) {
            if (arr[i] <= pivot)
                i++;
            else if (arr[j] > pivot)
                j--;
            else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        return pivotIndex;
    }

    public static void quickSort(int[] arr, int startIndex, int endIndex) {
        if (startIndex >= endIndex)
            return;
        int partition = partition(arr, startIndex, endIndex);
        quickSort(arr, startIndex, partition - 1);
        quickSort(arr, partition + 1, endIndex);
    }

    public static void main(String[] args) {

        int[] arr = TakeUserInput();
        int si = 0, ei = arr.length - 1;
        quickSort(arr, si, ei);

        for (int j : arr) {
            System.out.print(j + " ");
        }

    }
}
