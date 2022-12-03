import java.util.Scanner;

public class _3_largest_row_or_column_sum {

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

    public static void largestRow_or_ColumnSum(int[][] arr2D) {
        int row = arr2D.length;
        int column = arr2D[0].length;
        int largest = Integer.MIN_VALUE;
        int index = -1;
        boolean isRow = true;

        for (int i = 0; i < column; i++) {
            int rowSum = 0;
            for (int j = 0; j < row; j++) {
                rowSum = rowSum + arr2D[i][j];
            }
            if (rowSum > largest) {
                largest = rowSum;
                index = i;
            }
        }

        for (int j = 0; j < column; j++) {
            int columnSum = 0;
            for (int i = 0; i < row; i++) {
                columnSum = columnSum + arr2D[i][j];
            }
            if (columnSum > largest) {
                isRow = false;
                largest = columnSum;
                index = j;
            }
        }
        if (isRow)
            System.out.print("Row ");
        else
            System.out.print("Column ");
        System.out.println(index + " " + largest);

    }

    public static void main(String[] args) {
        int[][] arr2D = TakeUserInput();

        largestRow_or_ColumnSum(arr2D);
    }
}
