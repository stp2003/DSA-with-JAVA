package arrayADT;
import java.util.Scanner;

public class _21_Maximum_Difference {


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


    public static int Maximum_Difference( int [] arr )  {
        int n = arr.length;
        int res = arr[ 1 ] - arr[ 0 ];

        for (int i = 0; i < n - 1 ; i++) {
            for (int j = i + 1; j < n; j++)
                res = Math.max( res , arr[ j ] - arr[ i ] );

        }
        return res;
    }


    public static int Maximum_Difference_Efficient( int [] arr )  {
        int n = arr.length;
        int res = arr[ 1 ] - arr[ 0 ];
        int minVal = arr[ 0 ];

        for (int j = 1; j < n; j++) {
            res = Math.max( res , arr[ j ] - minVal );
            minVal = Math.min( minVal , arr[ j ]);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] arr = TakeUserInput();

        int res1 = Maximum_Difference( arr );
        System.out.println( res1 );

        int res2 = Maximum_Difference_Efficient( arr );
        System.out.println( res2 );

    }

}


