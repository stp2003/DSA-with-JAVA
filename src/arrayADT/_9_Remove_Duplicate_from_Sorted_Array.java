package arrayADT;

import java.util.Arrays;
import java.util.Scanner;

public class _9_Remove_Duplicate_from_Sorted_Array {


    public static int[] TakeUserInput() {

        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter size of array: ");
        int size = s.nextInt();

        int[] arr = new int[size];

        System.out.print("\nEnter array element: ");
        for (int i = 0; i < size; i++) {

            arr[i] = s.nextInt();
        }

        return arr;
    }

    // Naive way:
    public static int  removeDuplicates_Naive(int [] arr) {
        int size = arr.length;
        int [] temp = new int[size];
        temp[0] = arr[0];
        int res = 1;
        for (int i = 1; i < size; i++) {
            if (temp[res - 1] != arr[i]) {
                temp[res] = arr[i];
                res++;
            }
        }
        // coping back:
        for (int i = 0; i < res; i++) {
            arr[i] = temp[i];
        }
        return res;
    }

    public static int removeDuplicates(int [] arr) {
        int res = 1;
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[res - 1]) {
                arr[res] = arr[i];
                res++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int [] arr =TakeUserInput();

        int res = removeDuplicates(arr);

        System.out.print("Modified array is: [ ");
        for (int i = 0; i < res ; i++)
            System.out.print(arr[ i ] + " ");
        System.out.println("]");

    }
}
