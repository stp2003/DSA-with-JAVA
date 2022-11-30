package Searching;

import java.util.Scanner;

public class _4_Index_of_First_Occurrence {


    public static int [] TakeUserInput() {

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter size of array: ");
        int size = sc.nextInt();

        int [] arr = new int[ size ];

        System.out.print("\nEnter array element: ");
        for ( int i = 0; i < size; i++ ) {

            arr[ i ] = sc.nextInt();
        }

        return arr;
    }


    public static int firstOccurrence( int [] arr , int key )  {
        int start = 0 , end = arr.length - 1;

        // Simple Binary Search:
        while ( start <= end ) {
            int mid = ( start + end ) / 2;

            if ( key > arr[ mid ] )
                start = mid + 1;

            else if ( key < arr[ mid ] )
                end = mid - 1;

            // For first occurrence:
            else {
                if ( mid == 0  ||  arr[ mid - 1 ] != arr[ mid ])
                    return mid;
                else
                    end = mid - 1;
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = TakeUserInput();

        System.out.print( "\nEnter key: " );
        int key = sc.nextInt();

        int index = firstOccurrence( arr , key );

        if ( index != -1 )
            System.out.print( "\nThe element found at: " + index );

        else
            System.out.print( "Element NOT Found!" );

    }

}

