package Searching;

import java.util.Scanner;

public class _8_Search_in_Sorted_Rotated_Array {


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


    public static int search_in_Sorted_Array( int [] arr , int x ) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {

            // Binary Search:
            int mid = (start + end) / 2;
            if (arr[mid] == x)
                return mid;

            // Left-half Sorted:
            if ( arr[ start] < arr[ mid ] )  {
                if ( x >= arr[ start ]  &&  x < arr[ mid ] )
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            // Right-half Sorted:
            else {
                if ( x > arr[ mid ]  &&  x <= arr[ end ] )
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = TakeUserInput();

        System.out.print( "\nEnter element: " );
        int element = sc.nextInt();

        int ans = search_in_Sorted_Array( arr , element );
        System.out.println( "\nIndex is: " +  ans );

    }

}

