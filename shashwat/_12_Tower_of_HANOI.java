package shashwat;

import java.util.Scanner;

public class _12_Tower_of_HANOI {

    public static void TOWER_OF_HANOI (int n, char A, char B, char C)
    //n->no.of discs, A-> source, B-> auxiliary, C-> destination
    {
        if (n == 1) {
            System.out.println("Move 1 from " + A + " to " + C);
            return;
        }

        TOWER_OF_HANOI(n-1,A,C,B);
        System.out.println("Move " + n + " from " + A + " to " + C);
        TOWER_OF_HANOI(n-1,B,A,C);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        TOWER_OF_HANOI(n,'A','B','C');
    }
}
