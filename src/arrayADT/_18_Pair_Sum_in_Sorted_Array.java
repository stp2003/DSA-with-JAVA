package arrayADT;

import java.util.Scanner;

public class _18_Pair_Sum_in_Sorted_Array {

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

    public static void pairSum( int [] arr, int key ) {
        int i = 0, j = arr.length - 1;

        while ( i < j ) {
            if ( arr [ i ] + arr[ j ] == key ) {
                System.out.printf("\n%d + %d = %d", arr[ i ], arr[ j ], key);
                i++;
                j--;
            }
            else if (arr[ i ] + arr[ j ] < key )
                i++;
            else
                j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = TakeUserInput();
        System.out.print("Enter key: ");
        int key = sc.nextInt();

        pairSum( arr, key );
    }
}
