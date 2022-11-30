package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class _15_MEETING_MAX_GUESTS {

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

    public static int maxGuest(int[] arrival, int[] departure) {
        Arrays.sort(arrival);
        Arrays.sort(departure);
        int i = 1, j = 0, res = 1, curr = 1;
        while (i < arrival.length && j < departure.length) {   //arrival.length = departure.length always
            if (arrival[i] <= departure[j]) {
                curr++;
                i++;
            } else {
                curr--;
                j++;
            }
            res = Math.max(res, curr);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = TakeUserInput();
        int[] dep = TakeUserInput();

        System.out.println(maxGuest(arr, dep));
    }
}
