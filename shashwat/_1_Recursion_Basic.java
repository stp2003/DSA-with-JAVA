package shashwat;
import java.util.*;

public class _1_Recursion_Basic {

    public static void fun1(int n) {
        if (n>0) {
            System.out.print(" " + n);
            fun1(n-1);
//            System.out.print(" " + n);
        }
    }

    public static void main(String[] args) {
        fun1(3);

    }
}
