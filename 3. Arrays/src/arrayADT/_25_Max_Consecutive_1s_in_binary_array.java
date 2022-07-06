package arrayADT;

import java.util.Scanner;

public class _25_Max_Consecutive_1s_in_binary_array {


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


    public static int maxConsecutive_1s_Naive(int [] arr ) {
        int n = arr.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            int curr = 0;
            for (int j = i; j < n; j++) {
                if ( arr [ j ] == 1 )
                    curr++;
                else
                    break;
            }
            res = Math.max( curr , res );
        }
        return res;
    }


    public static int maxConsecutive_1s_Efficient( int [] arr )  {
        int n = arr.length;
        int res = 0 ,  curr = 0;

        for (int j : arr) {
            if (j == 0)
                curr = 0;
            else {
                curr++;
                res = Math.max( res , curr);
            }
        }
        return res;

    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] arr = TakeUserInput();

        int naive = maxConsecutive_1s_Naive( arr );
        System.out.println( naive );

        int effi = maxConsecutive_1s_Efficient( arr );
        System.out.println( effi );

    }

}

