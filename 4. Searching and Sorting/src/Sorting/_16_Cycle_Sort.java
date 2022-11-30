package Sorting;

import java.util.Scanner;

public class _16_Cycle_Sort {

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

    public static void cycleSort(int[] arr) {
        for (int cycleStart = 0; cycleStart < arr.length - 2; cycleStart++) {
            int item = arr[cycleStart];
            int pos = cycleStart;

            for (int i = cycleStart + 1; i < arr.length; i++) {
                if (arr[i] < item)
                    pos++;
            }
            int temp = item;
            item = arr[pos];
            arr[pos] = temp;

            while (pos != cycleStart) {
                pos = cycleStart;
                for (int i = cycleStart + 1; i < arr.length; i++) {
                    if (arr[i] < item)
                        pos++;
                }
                int temp1 = item;
                item = arr[pos];
                arr[pos] = temp1;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = TakeUserInput();

        cycleSort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }

    }
}
