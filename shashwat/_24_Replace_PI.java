package shashwat;

import java.util.Scanner;

public class _24_Replace_PI {

    public static String replace_Pi (String str) {
        String output;

        if (str.length() <= 1)
            return str;

        String smallAns = replace_Pi(str.substring(1));

        if (str.charAt(0) == 'p' && smallAns.charAt(0) == 'i')
            output = "3.14" + smallAns.substring(1);
        else
            output = str.charAt(0) + smallAns;

        return output;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(replace_Pi(str));
    }
}
