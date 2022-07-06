package arrayADT;

import java.util.Scanner;

public class _3_Search_in_Unsorted_Array {

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

    public static int Search(int [] arr, int size, int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int [] arr =TakeUserInput();
        int size = arr.length;

        System.out.print("Enter key: ");
        int key = s.nextInt();

        int ans = Search(arr,size, key);
        System.out.println("Index is: " + ans);
        System.out.println("Position is: " + (ans + 1 ));

    }
}

