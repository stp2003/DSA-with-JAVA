package Searching;

import java.util.Scanner;

public class _2_Binary_Search_Iterative_Way {


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


    public static int Binary_Search_Iterative(int [] arr , int key ) {
        int start = 0;
        int end = arr.length - 1;

        while ( start <= end )  {
            int mid = ( start + end ) / 2;

            if ( key == arr[ mid ] )
                return mid;

            else if ( key > arr[ mid ] )
                start = mid + 1;

            else
                end = mid - 1;
        }

        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = TakeUserInput();

        System.out.print( "\nEnter key: " );
        int key = sc.nextInt();

        int index = Binary_Search_Iterative( arr , key );

        if ( index != -1 )
            System.out.print( "\nThe element found at: " + index );

        else
            System.out.print( "Element NOT Found!" );
    }


}

