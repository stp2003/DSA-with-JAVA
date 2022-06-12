package shashwat;
/*
Last Index of Number

Given an array of length N and an integer x, you need to find and return the last index of integer x present in the array.
Return -1 if it is not present in the array.
Last index means - if x is present multiple times in the array, return the index at which x comes last in the array.
You should start traversing your array from 0, not from (N - 1).
Do this recursively. Indexing in the array starts from 0.

Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x

Output Format :
last index or -1
Constraints :
1 <= N <= 10^3

Sample Input :
4
9 8 10 8
8

Sample Output :
3
*/

import java.util.Scanner;

public class _19_Last_Index {

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


    public static int lastIndex(int [] input, int key, int startIndex) {
        if (startIndex == input.length)
            return -1;
        int smallAns = lastIndex(input, key, startIndex + 1);

        if (smallAns != -1)
            return smallAns;

        if (input[startIndex] == key)
            return smallAns;
        else
            return -1;
    }

    public static int lastIndex(int [] input, int key) {
        return lastIndex(input, key , 0);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] input = TakeUserInput();
        int last = lastIndex(input, 6);
        System.out.println(last);
    }
}

