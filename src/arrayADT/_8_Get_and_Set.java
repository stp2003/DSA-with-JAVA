package arrayADT;

import java.util.Scanner;

public class _8_Get_and_Set {


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

    // Gets a value at a particular index:
    public static int get (int [] arr, int index) {
        if (index >= 0 && index < arr.length)
            return arr[index];
        else
            return -1;
    }

    // Replace a value at a given index:
    public static void set (int [] arr, int index, int value) {
        if (index >= 0 && index < arr.length)
            arr[index] = value;
    }


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int [] arr =TakeUserInput();

        System.out.print("\nEnter Index: ");
        int index = s.nextInt();

        int ansGet = get(arr , index);
        System.out.println("Get: " + ansGet);

        System.out.print("Enter value: ");
        int value = s.nextInt();

        set(arr, index, value);
        System.out.print("\nNew Array is: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.print(" ]");

    }
}


