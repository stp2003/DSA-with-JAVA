import java.util.Scanner;

public class _10_pattern_searching {

    public static void patternSearch_Naive(String text, String pattern) {
        int m = pattern.length();
        int n = text.length();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (pattern.charAt(j) != text.charAt(i + j))
                    break;
            }
            if (j == m)
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String pattern = scanner.nextLine();

        patternSearch_Naive(text, pattern);

    }
}
