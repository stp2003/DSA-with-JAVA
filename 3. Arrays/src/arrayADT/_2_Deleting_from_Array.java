package arrayADT;

import java.util.Scanner;

public class _2_Deleting_from_Array {

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


    public static int  Delete(int [] arr, int size, int element) {
        int index;
        for ( index = 0; index < size; index++) {
            if (arr[index] == element)
                break;
        }

        if (index == size)
            return size;

        for (int j = index; j < size - 1; j++) {
            arr[j] = arr[j + 1];
        }

        return (size - 1);   // Return the new size of array
    }



    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int [] arr = TakeUserInput();
        int size = arr.length;

        System.out.print("Enter element: ");
        int element = s.nextInt();

        size = Delete(arr, size, element);

        System.out.print("Modified array is: [ ");
        for (int i = 0; i < size; i++)
            System.out.print( arr[i] + " ");
        System.out.println("]");


    }
}

