import java.util.Scanner;

public class _5_print_boundary_elements {

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

    public static void boundaryTraversals(int[][] arr2D) {
        int row = arr2D.length;
        int column = arr2D[0].length;
        if (row == 1) {
            for (int i = 0; i < column; i++) {
                System.out.print(arr2D[0][i] + " ");
            }
        } else if (column == 1) {
            for (int i = 0; i < row; i++) {
                System.out.print(arr2D[i][0] + " ");
            }
        } else {
            for (int i = 0; i < column; i++) {
                System.out.print(arr2D[0][i] + " ");
            }
            for (int i = 1; i < row; i++) {
                System.out.print(arr2D[i][column - 1] + " ");
            }
            for (int i = column - 2; i >= 0; i--) {
                System.out.print(arr2D[row - 1][i] + " ");
            }
            for (int i = row - 2; i >= 1; i--) {
                System.out.print(arr2D[i][0] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr2D = TakeUserInput();

        boundaryTraversals(arr2D);

    }
}
