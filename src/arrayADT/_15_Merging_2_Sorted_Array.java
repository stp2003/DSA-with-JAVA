package arrayADT;

import java.util.Arrays;
import java.util.Scanner;

public class _15_Merging_2_Sorted_Array {


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


    public static int [] merge( int [] arr1 , int [] arr2 ) {
        int n1 = arr1.length;
        int n2 = arr2.length;

        int [] mergeArray = new int[ n1 + n2 ];
        int i = 0, j = 0, k = 0;

        while ( i < n1  &&  j < n2 )
        {
            if ( arr1 [ i ] < arr2[ j ] )
                mergeArray[ k++ ] = arr1[ i++ ];
            else
                mergeArray[ k++ ] = arr2[ j++ ];
        }

        for ( ; i < n1 ; i++ )
            mergeArray[ k++ ] = arr1[ i ];

        for ( ; j < n2 ; j++ )
            mergeArray[ k++ ] = arr2[ j ];


        return mergeArray;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr1 = TakeUserInput();
        int [] arr2 = TakeUserInput();

        System.out.println( Arrays.toString( merge( arr1, arr2 )));

    }
}


