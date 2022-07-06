package arrayADT;

import java.util.Scanner;

public class _30_Min_Group_Flips_to_Make_Same {


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


    public static void printGroups( int [] arr )  {
        for (int i = 1; i < arr.length; i++) {
            if ( arr [ i ] != arr[ i - 1 ]) {
                if (arr[ i ] != arr[ 0 ])
                    System.out.print("\nFrom " + i + " to " );
                else
                    System.out.print( i - 1);
            }
        }
        if ( arr[arr.length - 1 ] != arr[ 0 ])
            System.out.println( arr.length - 1 );
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] arr = TakeUserInput();

        printGroups( arr );

    }

}


