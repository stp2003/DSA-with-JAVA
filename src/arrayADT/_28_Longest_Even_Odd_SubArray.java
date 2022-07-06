package arrayADT;

import java.util.Scanner;

// Continuous even odd number.
public class _28_Longest_Even_Odd_SubArray {


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

    public static int continuousEvenOdd_Naive ( int [] arr )  {

        int res = 1;
        for (int i = 0; i < arr.length; i++) {
            int curr = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if ( arr[ j ] % 2 == 0  &&  arr[ j - 1 ] % 2 != 0  ||   arr[ j ] % 2 != 0  &&  arr[ j - 1 ] % 2 == 0 )
                    curr++;
                else
                    break;
            }
            res = Math.max( res , curr );
        }
        return res;
    }


    public static int continuousEvenOdd_Efficient ( int [] arr ) {
        int res = 1 , curr = 1;
        for (int i = 1; i < arr.length; i++) {

            if (( arr[ i ] % 2 == 0  &&  arr[ i - 1 ] % 2 != 0 )  ||  ( arr[ i ] % 2 != 0 && arr[ i - 1 ] % 2 == 0 )) {
                curr++;
                res = Math.max( res, curr );
            }
            else
                curr = 1;
        }

        return res;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] arr = TakeUserInput();

        int naive = continuousEvenOdd_Naive( arr );
        System.out.println( naive );

        int effi = continuousEvenOdd_Efficient( arr );
        System.out.println( effi );

    }

}


