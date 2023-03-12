import java.util.Scanner;

public class _5_reverse_each_word {

    public static String reverseEachWord(String str) {
        int end = str.length();
        int i = str.length() - 1;
        String ans = "";
        while (i >= 0) {
            if (str.charAt(i) == ' ') {
                ans = ans + str.substring(i + 1, end) + " ";
                end = i;
            }
            i--;
        }
        ans += str.substring(i + 1, end);
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(reverseEachWord(str));
    }
}
