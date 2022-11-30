package Searching;

import java.util.Scanner;

public class _11_Median_of_2_Sorted_Arrays {


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


    public static double getMedian( int [] arr1 , int [] arr2 ) {
        int n1 = arr1.length;  int n2 = arr2.length;
        int begin1 = 0 , end1 = n1;

        while( begin1 <= end1 ) {
            int i1 = ( begin1 + end1 ) / 2;
            int i2 = ( n1 + n2 + 1 ) - i1;

            int min1 = ( i1 == n1 ) ? Integer.MAX_VALUE : arr1[ i1 ];
            int max1 = ( i1 == 0 )  ? Integer.MIN_VALUE : arr1[ i1 - 1 ];
            int min2 = ( i2 == n2 ) ? Integer.MAX_VALUE : arr2[ i2 ];
            int max2 = ( i2 == 0 )  ? Integer.MIN_VALUE : arr2[ i2 - 1 ];

            if ( max1 <= min2  &&  max2 <= min1 )  {
                if ( ( n1 + n2 ) % 2 == 0 )
                    return ( (double) Math.max( max1 , max2 ) + Math.min( min1 , min2 )) /  2;
                else
                    return (double) Math.max( max1 , max2 );
            }

            else if ( max1 > max2 )  end1 = i1 - 1;

            else begin1 = i1 + 1;
        }

        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr1 = TakeUserInput();
        int [] arr2 = TakeUserInput();

        double ans = getMedian( arr1 , arr2 );
        System.out.println( ans );

    }

}
