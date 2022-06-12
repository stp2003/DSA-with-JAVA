package shashwat;

public class _5_Converting_to_Tail_Recursion {

    public static void Non_Tail_Recursive(int n) {
        if (n == 0) return;
        Non_Tail_Recursive(n - 1);
        System.out.print(n + " ");
    }

    public static void Equivalent_Tail_Recursive(int n, int k) {
        if (n == 0) return;
        System.out.print(k +" ");
        Equivalent_Tail_Recursive(n - 1, k + 1);
    }

    public static void main(String[] args) {
        Non_Tail_Recursive(5);
        System.out.println();
        Equivalent_Tail_Recursive(5,1);
    }
}
