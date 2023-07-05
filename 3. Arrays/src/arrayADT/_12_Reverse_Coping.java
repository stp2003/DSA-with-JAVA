package arrayADT

import java.util.Arrays;
import java.util.Scanner;

public class _12_Reverse_Coping {


    public static int[] TakeUserInput() {

        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter size of array: ");
        int size = s.nextInt();

        int[] arr = new int[size];

        System.out.print("\nEnter array element: ");
        for (int i = 0; i < size; i++) {

            arr[i] = s.nextInt();
        }

        return arr;
    }


    public static int[] copyAndReverse(int[] arr, int n) {

        int [] COPY_ARR  = new int[n];

        for( int i = 0; i < n; i++ )
            COPY_ARR[ i ] = arr[ n - 1 - i ];


        return COPY_ARR;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int [] arr =TakeUserInput();
        
        int size = arr.length;

        int [] ans = copyAndReverse( arr, size);

        System.out.println(Arrays.toString(ans));

    }

}

