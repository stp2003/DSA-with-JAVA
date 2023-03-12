import java.util.Arrays;
import java.util.Scanner;

public class _7_anagrams {

    public static boolean checkAnagram_Naive(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        char[] a1 = str1.toCharArray();
        Arrays.sort(a1);
        str1 = new String(a1);

        char[] a2 = str2.toCharArray();
        Arrays.sort(a2);
        str2 = new String(a2);

        return str1.equals(str2);

    }

    static final int CHAR = 256;

    public static boolean checkAnagram_Efficient(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        int[] count = new int[CHAR];
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for (int i = 0; i < CHAR; i++) {
            if (count[i] != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        System.out.println(checkAnagram_Naive(str1, str2));
        System.out.println(checkAnagram_Efficient(str1, str2));
    }
}
