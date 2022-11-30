package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class _9_Partition_an_Array {

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

    public static void partition_Naive(int[] arr, int p) {
        int low = 0;
        int high = arr.length;
        int index = 0;
        int[] temp = new int[high - low + 1];

        for (int i = low; i < high; i++) {
            if (arr[i] <= arr[p]) {
                temp[index] = arr[i];
                index++;
            }
        }
        for (int i = low; i < high; i++) {
            if (arr[i] > arr[p]) {
                temp[index] = arr[i];
                index++;
            }
        }

        for (int i = low; i < high; i++) {
            arr[i] = temp[i - low];
            System.out.print(arr[i] + " ");
        }

    }


    public static int lomuto_partition(int[] arr) {
        int low = 0;
        int high = arr.length;
        int pivot = arr[high - 1];
        int i = low - 1;

        for (int j = low; j < high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        } // Swapping
        int temp = arr[i + 1];
        arr[i + 1] = arr[high - 1];
        arr[high - 1] = temp;

        return (i + 1);

    }

    public static int haore_partition(int[] arr) {

        int low = 0;
        int high = arr.length;
        int pivot = arr[low];
        int i = low - 1, j = high;

        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);

            do {
                j--;
            } while (arr[j] > pivot);

            if (i >= j)
                return j + 1;

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = TakeUserInput();
//        int p = scanner.nextInt();
//
//        partition_Naive(arr, p);

        System.out.println((lomuto_partition(arr)));

//        System.out.println(haore_partition(arr));

    }

}
