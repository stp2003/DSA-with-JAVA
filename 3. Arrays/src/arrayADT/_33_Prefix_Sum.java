package arrayADT;
import java.util.Scanner;

public class _33_Prefix_Sum {


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


    public static int getSum( int [] arr , int l , int r)  {
        int [] prefix_Sum = new int[arr.length];
        prefix_Sum[ 0 ] = arr[ 0 ];
        for (int i = 1; i < prefix_Sum.length; i++) {
            prefix_Sum[ i ] = prefix_Sum[ i - 1] + arr[ i ];
            System.out.println(prefix_Sum [ i ]);
        }
        if ( l != 0 )
            return prefix_Sum [ r ] - prefix_Sum[ l - 1 ];
        else
            return prefix_Sum[ r ];
    }


    public static boolean equilibrium_Point(int [] arr )  {
        for (int i = 0; i < arr.length; i++) {
            int left_Sum = 0 , right_Sum = 0;
            for (int j = 0; j < i; j++) {
                left_Sum += arr[ j ];
            }
            for (int k = i + 1; k < arr.length; k++) {
                right_Sum += arr[ k ];
            }
            if ( left_Sum == right_Sum )
                return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] arr = TakeUserInput();
//        int l = s.nextInt();
//        int r = s.nextInt();
//
//        int ans = getSum( arr , l , r);

        boolean ans2 = equilibrium_Point( arr );
        System.out.println( ans2 );

    }
}

