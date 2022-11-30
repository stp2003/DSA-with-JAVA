package Searching;

import java.util.Scanner;

public class _9_Peak_Element_in_Unsorted_Array {


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


    public static int searchPeak_NAIVE( int [] arr )  {
        int n = arr.length;

        // For only 1 element
        if ( n == 1)                         return arr[ 0 ];
        // For 1st element
        if ( arr[ 0 ] >= arr[ 1 ])           return arr[ 0 ];
        // For last element
        if ( arr[ n - 1 ] >= arr[ n - 2 ])   return arr[ n - 1 ];

        // For any middle element
        for (int i = 1; i < n - 1; i++ ) {
            if ( arr[ i ] >= arr[ i - 1 ]  &&  arr[ i ] >= arr[ i+ 1 ] )
                return arr[ i ];
        }

        return -1;
    }


    public static int searchPeak_Efficient( int [] arr )  {
        int start = 0, end = arr.length - 1;


        while (start <= end) {

            // Binary Search:
            int mid = (start + end) / 2;

            // Checking if mid is peak , if it doesn't have something on left or right.
            if (( mid == 0 || arr[ mid - 1 ] <= arr[ mid ] ) && ( mid == end || arr[ mid + 1 ] <= arr[ mid ] ) )
                return arr[ mid ];

            if ( mid > 0 && arr[ mid - 1 ] >= arr[ mid ] )
                end = mid - 1;
            else
                start = mid + 1;
        }

        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = TakeUserInput();

        int naive = searchPeak_NAIVE( arr );
        System.out.println( naive );

        int effi = searchPeak_Efficient( arr );
        System.out.println( effi );
    }
}

