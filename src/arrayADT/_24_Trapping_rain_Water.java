package arrayADT;

import java.util.Scanner;

public class _24_Trapping_rain_Water {


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


    public static int getWater_Naive( int [] arr )  {
        int n = arr.length;
        int res = 0;
        for (int i = 1; i < n - 1; i++) {   // Neglecting 1 and last element as they can't store any water
            int leftMax = arr [ i ];
            for (int j = 0; j < i; j++)
                leftMax = Math.max( leftMax , arr [ j ]);

            int rightMax = arr [ i ];
            for (int j = i + 1; j < n; j++)
                rightMax = Math.max( rightMax , arr [ j ]);

            res = res + ( Math.min( leftMax , rightMax) - arr [ i ] );
        }
        return res;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] arr = TakeUserInput();

        int naive = getWater_Naive( arr );
        System.out.println( naive );
    }
}
