package shashwat;

public class _2_Recursion_Examples {

    public static void fun1(int n) {
        if (n>0) {
            System.out.print(n + " ");
            fun1(n-1);
        }
    }

    public static void fun2(int n) {
        if (n > 0) {
            fun2(n-1);
            System.out.print(n + " ");
        }
    }

    public static void fun3(int n) {
        if (n == 0)
            return;

        System.out.print(n + " ");
        fun3(n-1);
        System.out.print(n + " ");
    }

    public static void fun4(int n) {
        if (n == 0)
            return;

        fun4(n-1);
        System.out.print(n + " ");

        fun4(n-1);
    }

    public static int fun5(int n) {
        if (n == 1)
            return 0;
        else
            return 1 + fun5(n/2);
    }

    // This behaves like binary equivalent of n.
    public static void fun6(int n) {
        if (n == 0) return;
        fun6(n/2);
        System.out.print(n%2 + " ");
    }

    public static void main(String[] args) {

        System.out.println("Fun1: ");
        fun1(3);

        System.out.println("\nFun2: ");
        fun2(3);

        System.out.println("\nFun3: ");
        fun3(3);

        System.out.println("\nFun4: ");
        fun4(3);

        System.out.println("\nFun5: ");
        int Fun5 = fun5(16);
        System.out.print(Fun5);

        System.out.println("\nFun6: ");
        fun6(7);
    }
}
