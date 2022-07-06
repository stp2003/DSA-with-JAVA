package arrayADT;

import java.util.Scanner;

public class _29_Majority_Element {


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


    public static int majorityElement_Naive( int [] arr )  {
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if ( arr[ i ] == arr[ j ])
                    count++;
            }
            if ( count > arr.length / 2 )
                return arr [ i ];
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] arr = TakeUserInput();

        int naive = majorityElement_Naive( arr );
        System.out.println( naive );

    }
}


