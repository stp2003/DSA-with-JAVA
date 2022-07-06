package arrayADT;

import java.util.Scanner;

public class _31_Window_Sliding_Technique {


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


    public static int sum_Naive( int [] arr , int k )  {
        int max_Sum = Integer.MIN_VALUE;
        for (int i = 0; i + k - 1 < arr.length ; i++) {
            int sum = 0;
            for (int j = 0; j < k; j++)
                sum += arr [ i + j ];

            max_Sum = Math.max( sum , max_Sum);
        }
        return max_Sum;
    }


    public static int sum_Efficient( int [] arr , int k )  {
        int max_Sum = Integer.MIN_VALUE , curr_Sum = 0;
        for (int i = 0; i < k; i++)
            curr_Sum += arr[ i ];

        max_Sum = curr_Sum;

        for (int i = k; i < arr.length; i++) {
            curr_Sum += ( arr[ i ] - arr[ i - k ]);
            max_Sum = Math.max( max_Sum , curr_Sum );
        }
        return max_Sum;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] arr = TakeUserInput();
        int k = s.nextInt();

        int naive = sum_Naive( arr , k);
        System.out.println( naive );

        int effi = sum_Efficient( arr , k );
        System.out.println( effi );

    }

}

