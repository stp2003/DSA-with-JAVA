package Searching;

import java.util.Scanner;

public class _3_Binary_Search_Recursive_Way {


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


    public static int Binary_Search_Recursive( int [] arr , int start , int end , int key )  {
        if ( start > end)
            return -1;

        int mid = ( start + end ) / 2;

        if ( arr[ mid ] == key )
            return mid;

        else if ( arr[ mid ] < key )
            return Binary_Search_Recursive( arr , mid + 1 , end, key );

        else
            return Binary_Search_Recursive( arr , start , mid - 1 , key );
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = TakeUserInput();

        System.out.print( "\nEnter key: " );
        int key = sc.nextInt();

        int start = 0 , end = arr.length - 1;

        int index = Binary_Search_Recursive( arr , start , end , key );

        if ( index != -1 )
            System.out.print( "\nThe element found at: " + index );

        else
            System.out.print( "Element NOT Found!" );
    }
}


