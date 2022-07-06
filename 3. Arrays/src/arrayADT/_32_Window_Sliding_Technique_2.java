package arrayADT;

import java.util.Scanner;

public class _32_Window_Sliding_Technique_2 {


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


    public static boolean isSubSum( int [] arr , int sum )  {
        int curr_Sum = arr[ 0 ] , start = 0;
        for (int end = 1; end < arr.length; end++) {
            while ( curr_Sum > sum  &&  start < end - 1 ) {
                curr_Sum -= arr[start];
                start++;
            }
            if ( curr_Sum == sum )
                return true;
            if ( end < arr.length)
                curr_Sum += arr[ end ];
        }
        return ( curr_Sum == sum);
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] arr = TakeUserInput();
        int sum = s.nextInt();

        boolean ans = isSubSum( arr , sum );
        System.out.println( ans );


    }

}
