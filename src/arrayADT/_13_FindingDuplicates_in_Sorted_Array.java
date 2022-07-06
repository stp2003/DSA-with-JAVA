package arrayADT;

import java.util.Scanner;

public class _13_FindingDuplicates_in_Sorted_Array {

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

    public static void duplicates(int [] arr) {
        int n = arr.length;
        int lastduplicate = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr [i] == arr[i + 1]  &&  arr[i] != lastduplicate) {
                System.out.println("The Duplicates are: " + arr[i] + " ");
                lastduplicate++;
            }
        }
    }

    public static void Count_Duplicate(int[] arr)
    {
        int n = arr.length;
        int j = 0;
        for (int i = 0; i < n - 1; i++)
        {
            if (arr[i] == arr[i + 1])
            {
                j = j + 1;
                while (arr[j] == arr[j])
                    j++;
                System.out.printf("\n%d is appearing %d times: ", arr[i], j);
                i = j - 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int [] arr =TakeUserInput();

        duplicates(arr);

//        Count_Duplicate(arr);
    }

}
