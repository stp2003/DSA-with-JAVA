package shashwat;
/*Pair star

Given a string S, compute recursively a new string where identical chars that are adjacent in the original
string are separated from each other by a "*".

Input format :
String S

Output format :
Modified string

Constraints :
0 <= |S| <= 1000
where |S| represents length of string S.

Sample Input 1 :
hello

Sample Output 1:
hel*lo

Sample Input 2 :
aaaa

Sample Output 2 :
a*a*a*a

*/

import java.util.Scanner;

public class _25_Pair_Star {

    public static String pairStar(String str) {
        if (str.length() <= 1)
            return str;

        String output = pairStar(str.substring(1));
        if (str.charAt(0) == str.charAt(1))
            output = str.charAt(0) + "*" + str.charAt(1) + output.substring(1);
        else
            output = str.charAt(0) + output;

        return output;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(pairStar(str));

    }
}
