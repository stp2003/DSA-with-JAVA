package arrayADT;

import java.util.Arrays;
import java.util.Scanner;

public class _14_Inserting_in_Sorted_Array {


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


    public static int [] insert( int[] arr, int element, int size ) {
        int[] newarray = new int[size + 1];

        int i = arr.length - 1;

        for (int j = 0; j < size; j++) {
            newarray[ j ] = arr[ j ];

            while (newarray[ i ] > element) {
                newarray[ i + 1 ] = newarray[i];
                i--;
            }
            newarray[ i + 1 ] = element;
        }

        return newarray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr =TakeUserInput();
        int element = sc.nextInt();

        int size = arr.length;

        System.out.println(Arrays.toString(insert(arr, element, size)));
    }
}

