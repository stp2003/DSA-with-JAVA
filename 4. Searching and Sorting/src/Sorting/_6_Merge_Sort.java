package Sorting;

import java.util.Scanner;

public class _6_Merge_Sort {

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

    public static void merge(int[] input1, int[] input2, int[] output) {
        int i = 0, j = 0, k = 0;

        while (i < input1.length && j < input2.length) {
            if (input1[i] < input2[j]) {
                output[k] = input1[i];
                k++;
                i++;
            } else {
                output[k] = input2[j];
                j++;
                k++;
            }
        }
        while (i < input1.length) {
            output[k] = input1[i];
            k++;
            i++;
        }
        while (j < input2.length) {
            output[k] = input2[j];
            j++;
            k++;

        }
    }

    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }

        int mid = arr.length / 2;
        int[] part1 = new int[mid];
        int[] part2 = new int[arr.length - mid];

        for (int i = 0; i < mid; i++) {
            part1[i] = arr[i];
        }

        int k = 0;
        for (int i = mid; i < arr.length; i++) {
            part2[k] = arr[i];
            k++;
        }

        mergeSort(part1);
        mergeSort(part2);
        merge(part1, part2, arr);
    }

    public static void main(String[] args) {
        int[] arr = TakeUserInput();

        mergeSort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }

    }

}
