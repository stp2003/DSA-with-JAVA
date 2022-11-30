package Searching;

import java.util.Scanner;

public class _12_Majority_Element {


    public static int[] TakeUserInput() {

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("\nEnter array element: ");
        for (int i = 0; i < size; i++) {

            arr[i] = sc.nextInt();
        }

        return arr;
    }


    public static int findMajority(int[] arr) {
        int res = 0, count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[res] == arr[i])
                count++;
            else
                count--;

            if (count == 0) {
                res = i;
                count = 1;
            }
        }

        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[res] == arr[i])
                count++;
        }
        if (count <= arr.length / 2)
            res = -1;

        return arr[res];
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = TakeUserInput();

        int ans = findMajority(arr);
        System.out.println(ans);

    }

}

