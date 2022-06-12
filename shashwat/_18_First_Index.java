package shashwat;
/*
First Index of Number

Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array.
Return -1 if it is not present in the array.
First index means, the index of first occurrence of x in the input array.
Do this recursively. Indexing in the array starts from 0.

Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x

Output Format :
first index or -1
Constraints :
1 <= N <= 10^3

Sample Input :
4
9 8 10 8
8

Sample Output :
1
*/

import java.util.Scanner;

public class _18_First_Index {

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


    public static int firstIndex(int [] input, int key, int startIndex) {
        if (startIndex == input.length)
            return -1;

        if (input[startIndex] == key)
            return startIndex;


        return firstIndex(input, key, startIndex + 1);
    }

    public static int firstIndex(int [] input, int key) {
        return firstIndex(input, key, 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] input = TakeUserInput();
        int first = firstIndex(input, 6);
        System.out.println(first);
    }

}
