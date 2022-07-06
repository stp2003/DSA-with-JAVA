package arrayADT;
import java.util.Scanner;

public class _27_Max_Sum_in_SubArray {


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


    public static int maxSum_Naive( int [] arr )  {
        int res = arr[ 0 ];
        for (int i = 0; i < arr.length; i++) {
            int curr = 0;
            for (int j = i; j < arr.length; j++) {
                curr = curr + arr[ j ];
                res = Math.max( res , curr );
            }
        }
        return res;
    }


    public static int maxSum_Efficient( int [] arr)  {
        int res = arr[ 0 ];
        int maxEnding = arr[ 0 ];
        for (int i = 1; i < arr.length; i++) {
            maxEnding = Math.max( maxEnding + arr[ i ] , arr [ i ]);
            res = Math.max( res , maxEnding);
        }
        return res;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] arr = TakeUserInput();

        int naive = maxSum_Naive( arr );
        System.out.println( naive );

        int effi = maxSum_Efficient( arr );
        System.out.println( effi );

    }


}

