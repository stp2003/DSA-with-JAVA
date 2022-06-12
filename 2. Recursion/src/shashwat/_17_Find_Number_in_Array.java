package shashwat;

import java.util.Scanner;

public class _17_Find_Number_in_Array {

    public static int[] TakeUserInput() {

        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter size of array: ");
        int size = s.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }


    public static int Search(int [] arr, int key, int startIndex) {
        if (startIndex == arr.length)
            return 0;

        if(arr[startIndex] == key)
            return startIndex;

        return Search(arr, key, startIndex + 1);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] input = TakeUserInput();
        int search = Search(input, 5, 0);
        System.out.println(search);
    }
}
