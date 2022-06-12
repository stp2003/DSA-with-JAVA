package shashwat;

import java.util.Scanner;

public class _28_Subset_Sum_Array {

    public static int subsetSum(int [] arr, int n, int sum) {
        if (n == 0)
            return (sum == 0) ? 1 : 0;

        return subsetSum(arr, n - 1, sum) + subsetSum(arr, n - 1, sum - arr[n - 1]);

    }

    public static void main(String[] args) {

        int [] arr = {10, 20, 30, 40};
        int n = arr.length;
        int sum = 0;

        int ans = subsetSum(arr, n, sum);
        System.out.println(ans);

    }
}
