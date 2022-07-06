package arrayADT;

import java.util.Scanner;

public class _16_Find_1_Missing_Element_From_Sorted_Array {


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


    public static void missingElement( int [] arr ) {
        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < n - 1; i++)
            sum = sum + arr[ i ];

        int actualSum = n * ( n + 1 ) / 2;
        System.out.println("Missing element is: " + (actualSum - sum));
    }

    public static void missingElement2( int [] arr ) {
        int low = arr[0] , high = arr[arr.length - 1];

        for (int i = 0; i < arr.length; i++) {
            if ( arr[ i ] - i != low ) {
                System.out.println("Missing element is: " + ( i + low ) );
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = TakeUserInput();

        missingElement(arr);
        missingElement2(arr);
    }
}
