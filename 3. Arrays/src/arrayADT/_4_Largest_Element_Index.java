package arrayADT;

import java.util.Scanner;

public class _4_Largest_Element_Index {

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

    // Naive Way:
    public static int getLargestIndex_Naive(int [] arr) {
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            boolean flag = true;
            // We compare every element with every element.
            for (int j = 0; j < size; j++) {
                if (arr[j] > arr[i]) {
                    flag = false;
                    break;
                }
            }

            if (flag == true)
                return i;
        }

        return -1;
    }

    public static int getLargestIndex_Efficient(int [] arr) {
        int res = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[res])
                res = i;
        }
        return arr[ res ];
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int [] arr =TakeUserInput();

//        int index = getLargestIndex_Naive(arr);
//        System.out.println(index);

        int index_efficient = getLargestIndex_Efficient(arr);
        System.out.println(index_efficient);
    }
}

