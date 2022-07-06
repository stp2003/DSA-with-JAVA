package arrayADT;

import java.util.Scanner;

public class _11_Moving_zeroes_to_end {


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

    public static void moveTOEnd (int [] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                // Swapping:
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

                count++;
            }

        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int [] arr =TakeUserInput();

        moveTOEnd(arr);

        System.out.print("Modified array is: [ ");
        for (int i = 0; i < arr.length ; i++)
            System.out.print(arr[i]+" ");
        System.out.println("]");

    }
}
