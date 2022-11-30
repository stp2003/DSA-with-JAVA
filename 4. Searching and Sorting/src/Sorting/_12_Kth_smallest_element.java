package Sorting;
import java.util.Arrays;
import java.util.Scanner;

public class _12_Kth_smallest_element {

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

    public static int kth_smallest_Naive(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }

    public static void Swap(int[] array, int position1, int position2) {
        int temp = array[position1];
        array[position1] = array[position2];
        array[position2] = temp;
    }

    public static int lomuto_partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] <= pivot) {
                i++;
                Swap(arr, i, j);
            }
        }
        Swap(arr, i + 1, high);
        return (i + 1);
    }

    public static int kth_smallest_efficient(int[] arr, int k) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int p = lomuto_partition(arr, l, r);
            if (p == k - 1)
                return p;
            else if (p > k - 1)
                r = p - 1;
            else
                r = p + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = TakeUserInput();
        int k = scanner.nextInt();

        System.out.println(kth_smallest_Naive(arr, k));
        System.out.println(kth_smallest_efficient(arr, k));

    }
}
