import java.util.Scanner;

public class _11_check_rotation {

    public static boolean areRotation(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        return ((str1 + str1).contains(str2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        System.out.println(areRotation(str1, str2));

    }
}
