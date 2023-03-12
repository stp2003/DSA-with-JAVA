import java.util.Scanner;

public class _6_check_string_is_subsequence_of_other {

    public static boolean isSubSequence_iterative(String str1, String str2, int n, int m) {
        int j = 0, i = 0;
        while (i < n && j < m) {
            if (str1.charAt(i) == str2.charAt(j)) {
                i++;
                j++;
            }
        }
        return (j == m);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        int n = str1.length();
        String str2 = scanner.nextLine();
        int m = str2.length();

        System.out.println(isSubSequence_iterative(str1, str2, n, m));
    }
}
