package Searching;

import java.util.Scanner;

public class _10_Triplet_with_given_Sum {


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


    public static boolean isPair( int [] arr , int left , int right , int x ) {
        left = 0 ;
        right = arr.length - 1;

        while ( left < right ) {
            if ( arr[ left ] + arr[ right ] == x )      return true;
            else if ( arr[ left ] + arr[ right ] > x )  right--;
            else                                        left++;
        }

        return false;

    }


    public static boolean triplet( int [] arr , int x ) {
        for (int i = 0; i < arr.length; i++) {
            if ( isPair( arr , i + 1 , arr.length - 1 ,x - arr[ i ] ) )
                return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = TakeUserInput();
        int x = sc.nextInt();

        boolean ans = triplet( arr , x );
        System.out.println( ans );

    }

}

