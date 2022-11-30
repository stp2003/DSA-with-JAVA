package Searching;

import java.util.Scanner;

public class _6_Count_Occurrences_in_Sorted_Array {


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


    public static int lastOccurrence(int [] arr , int key )  {
        int start = 0 , end = arr.length - 1;

        // Simple Binary Search:
        while ( start <= end ) {
            int mid = ( start + end ) / 2;

            if ( key > arr[ mid ] )
                start = mid + 1;

            else if ( key < arr[ mid ] )
                end = mid - 1;

                // For last occurrence:
            else {
                if ( mid == arr.length - 1  ||  arr[ mid ] != arr[ mid + 1 ] )
                    return mid;
                else
                    start = mid + 1;
            }
        }

        return -1;
    }


    public static int countOccurrences( int [] arr , int element )
    {
        int first = firstOccurrence( arr , element );
        if ( first == -1 )
            return 0;

        else
            return ( lastOccurrence( arr , element ) - first + 1 );
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = TakeUserInput();

        System.out.print( "\nEnter element: " );
        int element = sc.nextInt();

        int occurrence = countOccurrences( arr , element );

        if ( occurrence != 0 )
            System.out.print( "\nThe element is found " + occurrence + " times." );

        else
            System.out.print( "\nElement NOT Found!" );

    }

}

