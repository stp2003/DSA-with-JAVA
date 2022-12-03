import java.util.Scanner;

public class _7_search_in_row_column_wise_sorted_matrix {

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

    public static void search_Naive(int[][] arr2D, int x) {
        int row = arr2D.length;
        int column = arr2D[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (arr2D[i][j] == x) {
                    System.out.println("Found at (" + i + "," + j + ")");
                    return;
                }
            }
        }
        System.out.println("not found");
    }

    public static void search_Efficient(int[][] arr2D, int x) {
        int row = arr2D.length;
        int column = arr2D[0].length;
        int i = 0, j = column - 1;
        while (i < row && j >= 0) {
            if (arr2D[i][j] == x) {
                System.out.println("Found at (" + i + "," + j + ")");
                return;
            } else if (arr2D[i][j] > x)
                j--;
            else
                i++;
        }
        System.out.println("not found");
    }

    public static void main(String[] args) {
        int[][] arr2D = TakeUserInput();
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        search_Naive(arr2D, x);
        search_Efficient(arr2D, x);

    }
}
