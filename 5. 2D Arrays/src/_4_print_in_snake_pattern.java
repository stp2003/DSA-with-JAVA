import java.util.Scanner;

public class _4_print_in_snake_pattern {

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

    public static void printSnake(int[][] arr2D) {
        int row = arr2D.length;
        int column = arr2D[0].length;
        for (int i = 0; i < row; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < column; j++) {
                    System.out.print(arr2D[i][j] + " ");
                }
            } else {
                for (int j = column - 1; j >= 0; j--) {
                    System.out.print(arr2D[i][j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {

        int[][] arr2D = TakeUserInput();
        printSnake(arr2D);

    }
}
