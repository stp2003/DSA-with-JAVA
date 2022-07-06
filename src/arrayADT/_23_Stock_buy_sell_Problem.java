package arrayADT;

import java.util.Scanner;

public class _23_Stock_buy_sell_Problem {


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


    public static int maxProfit_Naive( int [] price ) {

        int profit = 0;
        for (int i = 1; i < price.length; i++) {
            if ( price [ i ] > price [ i - 1 ])
                profit += ( price [ i ] - price[ i - 1] );
        }

        return profit;
    }


    public static int maxProfit_LEETCODE_1(int [] prices )
    {
        int minProfit = Integer.MAX_VALUE;
        int maxProfit = 0;

        for ( int i = 0; i < prices.length; i++ )
        {
            minProfit = Math.min( minProfit , prices[ i ] );

            maxProfit = Math.max( maxProfit , prices[ i ] - minProfit );

        }

        return maxProfit;

    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] price = TakeUserInput();

        int n = price.length;


        int profit = maxProfit_Naive(price);
        System.out.println( profit );

        int letecode = maxProfit_LEETCODE_1( price );
        System.out.println( letecode );

    }

}

