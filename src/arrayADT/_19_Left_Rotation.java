package arrayADT;
import java.util.Arrays;
import java.util.Scanner;

public class _19_Left_Rotation {

    public static int [] TakeUserInput() {

        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter size of array: ");
        int size = s.nextInt();

        int [] arr = new int[ size ];

        System.out.print("\nEnter array element: ");
        for (int i = 0; i < size; i++) {

            arr[ i ] = s.nextInt();
        }

        return arr;
    }


    public static int [] Left_Rotation_by_ONE( int [] arr ) {
        int n = arr.length;
        int temp = arr[0];

        for (int i = 1; i < n; i++) {
            arr[ i - 1 ] = arr[ i ];    // shift karte jaenge
        }
        arr[ n - 1 ] = temp;         // last pe first dal denge
        return arr;
    }


    public static int[] Naive_Left_Rotation_by_N( int [] arr , int d ){
        for (int i = 0; i < d; i++) {

            Left_Rotation_by_ONE(arr);
        }
        return arr;
    }


    public static int [] left_Rotate_by_N_Better( int [] arr , int d ) {
        int n = arr.length;
        int [] temp = new int [ d ];

        for (int i = 0; i < d; i++)
            temp [ i ] = arr[ i ];    // Coping 1st d elements.  temp [] = {1,2}

        for (int i = d; i < n; i++)
            arr [ i - d ] = arr[ i ];  // Just like rotate by 1.  arr [] = {3,4,5,4,5}

        for (int i = 0; i < d; i++)
            arr [ n - d + i] = temp[ i ];  // Coping temp to arr.  arr []  = {3,4,5,1,2}


        return arr;

    }


    public static void reverse(int [] arr , int low , int high) {
        while (low < high ) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;

        }
    }

    public static int [] left_Rotate_by_N_Efficient( int [] arr , int d) {
        int n = arr.length;
        reverse ( arr , 0 , d - 1);
        reverse ( arr , d , n - 1);
        reverse ( arr , 0 , n - 1);

        return arr;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int [] arr = TakeUserInput();

//        System.out.println("\nAfter left rotation by 1:  " + Arrays.toString(Left_Rotation_by_ONE( arr )));

        System.out.print("\n\nEnter Number of times of rotation: ");
        int d = s.nextInt();

//        System.out.println("\nAfter left rotation by " + d + " ,Naive Way :  " + Arrays.toString(Naive_Left_Rotation_by_N(arr,d)));

//        System.out.println("\nAfter left rotation by " + d + " ,Better Way :  " + Arrays.toString(left_Rotate_by_N_Better(arr, d)));

        System.out.println("\nAfter left rotation by " + d + " ,Efficient Way :  " + Arrays.toString(left_Rotate_by_N_Efficient(arr, d)));

    }

}

