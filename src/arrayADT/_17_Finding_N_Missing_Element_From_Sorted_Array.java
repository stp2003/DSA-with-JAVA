package arrayADT;

import java.util.Scanner;

public class _17_Finding_N_Missing_Element_From_Sorted_Array {


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

    public static void missing( int [] arr) {
        int low = arr[0] , high = arr[arr.length - 1];

        for (int i = 0; i < arr.length; i++) {
            if ( arr[ i ] - i != low ) {

                while ( low < arr[ i ] - i ) {
                    System.out.println("Missing element is: " + (i + low));
                    low++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = TakeUserInput();

        missing(arr);
    }
}
