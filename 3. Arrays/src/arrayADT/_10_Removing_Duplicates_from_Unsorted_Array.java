package arrayADT;

import java.util.Scanner;

public class _10_Removing_Duplicates_from_Unsorted_Array {


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

    public static void removeDuplicates(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (arr[i] != -1) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        arr[j] = -1;
                    }
                }

                if (count > 1)
                    System.out.printf("%d is occurring %d times\n" , arr[i], count);
            }

        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int [] arr =TakeUserInput();

        removeDuplicates(arr);
    }
}
