import java.util.Scanner;

public class _6_transpose_of_matrix {

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

    public static void printArray(int[][] arr2D) {
        int row = arr2D.length;
        int column = arr2D[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void transpose_Naive(int[][] arr2D) {
        int row = arr2D.length;
        int[][] temp = new int[row][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                temp[i][j] = arr2D[j][i];
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                arr2D[i][j] = temp[i][j];
            }
        }
    }

    public static void transpose_Efficient(int[][] arr2D) {
        int row = arr2D.length;
        // as diagonal element are same we swap the upper triangular matrix with lower triangular matrix.
        for (int i = 0; i < row; i++) {
            for (int j = i + 1; j < row; j++) {
                int temp = arr2D[i][j];
                arr2D[i][j] = arr2D[j][i];
                arr2D[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr2D = TakeUserInput();

        transpose_Naive(arr2D);
        printArray(arr2D);

        transpose_Efficient(arr2D);
        printArray(arr2D);

    }
}
