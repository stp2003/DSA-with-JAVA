package shashwat;

import java.util.Scanner;

public class _16_Sum_of_Array {

    public static int[] TakeUserInput() {

        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter size of array: ");
        int size = s.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < size; i++) { // i<arr.length bhi use kar sakte
            arr[i] = s.nextInt();
        }
        return arr;
    }


    public static int arraySum(int [] arr, int startIndex) {
        if (startIndex == arr.length)
            return 0;

        return arr[startIndex] + arraySum(arr, startIndex + 1);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] input = TakeUserInput();
        int sum = arraySum(input, 0);
        System.out.println(sum);
    }
}
