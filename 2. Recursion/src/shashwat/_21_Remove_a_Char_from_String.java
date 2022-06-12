package shashwat;
import java.util.Scanner;

public class _21_Remove_a_Char_from_String {

    public static String remove_X(String str) {
        if (str.length() == 0)
            return str;

        String ans = "";

        if (str.charAt(0) != 'x')
            ans = ans + str.charAt(0);

        String smallAns = remove_X(str.substring(1));
        return ans + smallAns;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(remove_X(str));
    }
}
