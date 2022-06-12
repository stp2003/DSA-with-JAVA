package shashwat;
/*Remove Duplicates Recursively

Given a string S, remove consecutive duplicates from it recursively.

Input Format :
String S

Output Format :
Output string
Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string

Sample Input 1 :
aabccba

Sample Output 1 :
abcba

Sample Input 2 :
xxxyyyzwwzzz

Sample Output 2 :
xyzwz

*/

import java.util.Scanner;

public class _23_Remove_Duplicates {

    public static String removeDuplicates(String str) {
        if (str.length() <= 1)
            return str;

        String smallOutput=removeDuplicates(str.substring(1));

        if (str.charAt(0)==str.charAt(1))
            return smallOutput;
        else
            return str.charAt(0)+smallOutput;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(removeDuplicates(str));
    }
}
