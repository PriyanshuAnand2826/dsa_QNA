import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class palindrome {
    public static void main(String[] args) {
        String palindrome = "122";

        System.out.println(validpd(palindrome));
    }

    static boolean validpd(String palindrome) {
        palindrome=palindrome.toLowerCase(Locale.ROOT);
        int i = 0;
        int j = palindrome.length()-1;
        boolean ans=true;
        while (i < j) {

            if (palindrome.charAt(i) == palindrome.charAt(j)) {
                i++;
                j--;
            }
            else {
                return false;
            }




        }
        return ans;

    }
}
