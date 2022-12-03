import java.util.Scanner;

public class _2_largest_column_sum {

    public static int[][] TakeUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows and columns: ");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] arr2D = new int[rows][columns];

        System.out.println("\nEnter the element: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
//                System.out.println("Enter the element at " + i + " row " + j + " column ");
                arr2D[i][j] = scanner.nextInt();
            }
        }
        return arr2D;
    }

    public static int largestColumnSum(int[][] arr2D) {
        int row = arr2D.length;
        int column = arr2D[0].length;
        int largest = Integer.MIN_VALUE;

        for (int j = 0; j < column; j++) {
            int sum = 0;
            for (int i = 0; i < row; i++) {
                sum = sum + arr2D[i][j];
            }
            if (sum > largest)
                largest = sum;
        }
        return largest;
    }

    public static void main(String[] args) {
        int[][] arr2D = TakeUserInput();

        System.out.println(largestColumnSum(arr2D));

    }
}
