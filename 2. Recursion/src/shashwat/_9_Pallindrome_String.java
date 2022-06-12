package shashwat;

import java.util.Scanner;

public class _9_Pallindrome_String {

    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end)
            return true;

        return (str.charAt(start) == str.charAt(end) && isPalindrome(str, start + 1, end - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int start = 0;
        int end = str.length() - 1;

        System.out.println(isPalindrome(str,start,end));
    }
}
