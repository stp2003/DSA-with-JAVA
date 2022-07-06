package arrayADT;

import java.util.Scanner;

public class _22_Frequencies_in_Sorted_Array {


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


    public static void printFrequency( int [] arr )  {
        int n = arr.length;
        int freq = 1 , i = 1;
        while ( i < n) {
            while ( i < n  &&  arr [ i ] == arr[ i - 1] ) {
                freq++;
                i++;
            }
            System.out.println( arr[ i - 1] + "  " + freq );
            i++;
            freq = 1;  // Resetting the freq to 1
        }

        if ( n == 1  ||  arr[  n - 1] != arr[ n -2 ] )
            System.out.println( arr[ n - 1 ] + "   " + 1);
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] arr = TakeUserInput();

        printFrequency( arr );

    }

}

