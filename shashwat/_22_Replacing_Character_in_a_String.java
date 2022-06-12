package shashwat;
/*Replace Character Recursively

Given an input string S and two characters c1 and c2, you need to replace every occurrence of character c1 with character c2 in the given string.
Do this recursively.

Input Format :
Line 1 : Input String S
Line 2 : Character c1 and c2 (separated by space)

Output Format :
Updated string

Constraints :
1 <= Length of String S <= 10^6

Sample Input :
abacd
a x

Sample Output :
xbxcd

*/

import java.util.Scanner;

public class _22_Replacing_Character_in_a_String {

    public static String replaceChar(String str, char c1, char c2) {
        if (str.length() == 0)
            return str;

        char c;
        if (str.charAt(0) == c1)
            c = c1;
        else
            c = str.charAt(0);

        String ans = replaceChar(str.substring(1), c1, c2);

        return c + ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(replaceChar(str, 'b', 'c'));
    }
}
