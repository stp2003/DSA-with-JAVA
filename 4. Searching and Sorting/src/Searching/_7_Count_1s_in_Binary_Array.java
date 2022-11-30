package Searching;

import java.util.Scanner;

public class _7_Count_1s_in_Binary_Array {


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


    public static int countOnes(int[] arr) {
        int start = 0, end = arr.length - 1;

        // Simple Binary Search:
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == 0)
                start = mid + 1;

            // Main Logic:
            else {
                if ( mid == 0  ||  arr[ mid - 1 ] == 0)
                    return (arr.length - mid);
                else
                    end = mid - 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = TakeUserInput();

        int occurrence = countOnes( arr );

        if ( occurrence != 0 )
            System.out.print( "\n1 is found -> " + occurrence + " times." );

        else
            System.out.print( "\n1 NOT Found!" );

    }
}


