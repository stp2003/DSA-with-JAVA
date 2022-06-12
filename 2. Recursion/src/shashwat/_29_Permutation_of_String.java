package shashwat;

import java.util.Scanner;

public class _29_Permutation_of_String {

    public static void print_Permutation(String str, String ans)
    {

        // If string is empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) + str.substring(i + 1);

            // Recursive call
            print_Permutation(ros, ans + ch);


        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        print_Permutation(str, "");


    }
}
