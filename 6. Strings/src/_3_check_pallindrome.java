import java.util.Scanner;

public class _3_check_pallindrome {

    public static boolean checkPallindrome(String str) {
        String reverseString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseString += str.charAt(i);
        }
        return str.equals(reverseString);
    }

    public static boolean checkPallindrome_2(String str) {
        int begin = 0, end = str.length() - 1;
        while (begin < end) {
            if (str.charAt(begin) != str.charAt(end))
                return false;
            begin++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(checkPallindrome(str));
        System.out.println(checkPallindrome_2(str));

    }
}
