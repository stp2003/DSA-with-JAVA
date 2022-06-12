package shashwat;
import java.util.Scanner;

public class _11_Sequences_of_String {

    public static String [] findSubsequences(String str) {
        if (str.length() == 0){
            String [] ans = {""};
            return ans;
        }

        String [] smallAns = findSubsequences(str.substring(1));
        String [] ans = new String[2 * smallAns.length];

        // For coping
        for (int i = 0; i < smallAns.length; i++) {
            ans[i] = smallAns[i];

        }

        for (int i = 0; i < smallAns.length; i++) {
            ans[i + smallAns.length] = str.charAt(0) + smallAns[i];

        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String str = scanner.nextLine();

        String [] ans = findSubsequences(str);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
