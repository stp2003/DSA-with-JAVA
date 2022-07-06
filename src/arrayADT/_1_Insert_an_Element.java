package arrayADT;
import java.util.Arrays;
import java.util.Scanner;

public class _1_Insert_an_Element {

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


    // Add/ Append: adds an element at last.
    public static int [] addX(int size, int [] arr, int element)
    {
        // create a new array of size n+1
        int [] newarr = new int[size + 1];

        for (int i = 0; i < size; i++)
            newarr[i] = arr[i];      // Coping

        newarr[size] = element;

        return newarr;
    }


    // Insert: insert an array at any given position.
   public static int [] Insert(int [] arr, int size, int element, int capacity, int position) {
        if (size == capacity)
            return arr;

        int index = position - 1;
        int [] newarray = new int[size + 1];

       //coping
       for (int i = 0; i <size ; i++) {
           newarray[i] = arr[i];
       }

       for (int i = size - 1; i >= index ; i--)
           newarray[i + 1] = newarray[i];

       newarray[index] = element;         // this is for position.

       return newarray;
   }



    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int [] arr =TakeUserInput();
        int size = arr.length;
        int capacity = size * 2;

        System.out.print("Enter element: ");
        int element = s.nextInt();

        System.out.println("Array After Adding an element: " + Arrays.toString(addX(size, arr, element)));  // Add


        System.out.print("Enter position: ");
        int position = s.nextInt();

        System.out.println("Array After Inserting an element: " + Arrays.toString(Insert(arr, size, element, capacity, position)));  // Insert
    }

}
