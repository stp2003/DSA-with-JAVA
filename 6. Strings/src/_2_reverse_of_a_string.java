import java.util.Scanner;

public class _2_reverse_of_a_string {

    public static String reverseString(String str) {
        String reverseString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseString += str.charAt(i);
        }
        return reverseString;
    }

    public static String reverseString_2(String str) {
        String reverseString = "";
        for (int i = 0; i < str.length(); i++) {
            reverseString = str.charAt(i) + reverseString;
        }
        return reverseString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(reverseString(str));
        System.out.println(reverseString_2(str));

    }
}
