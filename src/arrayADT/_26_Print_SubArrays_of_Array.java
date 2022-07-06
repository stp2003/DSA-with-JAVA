package arrayADT;

import java.util.Scanner;

public class _26_Print_SubArrays_of_Array {


    public static int [] TakeUserInput() {

        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter size of array: ");
        int size = s.nextInt();

        int [] arr = new int[ size ];

        System.out.print("\nEnter array element: ");
        for (int i = 0; i < size; i++) {

            arr[ i ] = s.nextInt();
        }

        return arr;
    }


    public static void subArray( int [] arr )
    {
        int n = arr.length;
        // Pick starting point
        for ( int i = 0; i < n; i++ )
        {
            // Pick ending point
            for ( int j = i; j < n; j++ )
            {
                // Print subarray between current starting
                // and ending points
                for ( int k = i; k <= j; k++ )
                    System.out.print( arr[ k ] + " " );
                System.out.println();
            }
        }
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] arr = TakeUserInput();

        subArray( arr );
    }

}
