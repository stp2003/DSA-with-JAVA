import java.util.Scanner

public class _1_Matrix_Basics {

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
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] arr2D = TakeUserInput();

        printArray(arr2D);

        System.out.println("This (arr2D.length) will give the number of rows in an 2D array -> " + arr2D.length);
        System.out.println("This (arr2D[0].length) will give you number of columns in a 2D array -> " + arr2D[0].length);

    }
}
