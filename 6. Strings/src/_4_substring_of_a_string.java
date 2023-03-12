import java.util.Scanner;

public class _4_substring_of_a_string {

    public static void printSubstring(String str) {
        for (int start = 0; start < str.length(); start++) {
            // we will be printing all substring starting with char at index start
            for (int end = start; end < str.length(); end++) {
                System.out.println(str.substring(start, end + 1));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        printSubstring(str);
    }
}
