package arrayADT;
import java.util.Scanner;

public class _5_Second_Largest_Element_Index {

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

    public static int second_Largest(int [] arr) {
        int secondlargest = -1, largest = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[largest]) {
                secondlargest = largest;
                largest = i;
            }
            else if (arr[i] != arr[largest]) {
                if (secondlargest == -1 || arr[i] > arr[secondlargest])
                    secondlargest = i;
            }
        }

        return arr[ secondlargest ];
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int [] arr =TakeUserInput();

        int ans = second_Largest(arr);
        System.out.println(ans);

    }
}
