import java.util.Scanner;

public class _8_repeating_character {

    public static int repeating_Naive(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    return i;
            }
        }
        return -1;
    }

    static final int CHAR = 256;

    public static int repeating_Efficient(String str) {
        boolean[] visited = new boolean[CHAR];
        int res = -1;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (visited[str.charAt(i)])
                res = i;
            else
                visited[str.charAt(i)] = true;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(repeating_Naive(str));
        System.out.println(repeating_Efficient(str));

    }
}
