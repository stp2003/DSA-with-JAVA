import java.util.Scanner;

public class _9_reverse_words {

    public static void reverse(char[] str, int start, int end) {
        char temp;
        while (start <= end) {
            // Swapping the first
            // and last character
            temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }

    // Function to reverse words
    public static char[] reverseWords(char[] s) {
        int start = 0;
        for (int end = 0; end < s.length; end++) {
            if (s[end] == ' ') {
                reverse(s, start, end - 1);
                start = end + 1;
            }
        }
        // Reverse the last word
        reverse(s, start, s.length - 1);
        // Reverse the entire String
        reverse(s, 0, s.length - 1);
        return s;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        char[] p = reverseWords(str.toCharArray());
        System.out.print(p);

    }
}
