package shashwat;
import java.util.Scanner;

public class _15_Check_Sorted {

    public static int[] TakeUserInput() {

        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter size of array: ");
        int size = s.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter array elements:  ");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }


    public static boolean checkSorted(int [] input) {
        if (input.length <= 1)
            return true;

        if (input[0] > input[1])
            return false;

        int [] smallInput = new int[input.length - 1];

        // For coping element of input into smallInput for length - 1;
        for (int i = 1; i < input.length; i++) {
            smallInput[i-1] = input[i];
        }

        boolean smallAns = checkSorted(smallInput);
        return smallAns;
    }

    // Without making second array.
    public static boolean checkSorted_Better(int [] input, int startIndex) {
        if (startIndex == input.length - 1)
            return true;

        if (input[startIndex] > input[startIndex + 1])
            return false;

        boolean smallAns = checkSorted_Better(input,startIndex + 1);
        return smallAns;
    }

    public static void main(String[] args) {

        int [] input = TakeUserInput();
        System.out.println(checkSorted(input));

        System.out.println(checkSorted_Better(input, 0));
    }
}

