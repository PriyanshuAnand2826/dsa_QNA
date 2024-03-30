package lovebabbar;

import java.util.Locale;

public class palindrome {
    public static void main(String[] args) {
        String input="namiian";
        System.out.println(isplain(input));

    }
    static boolean isplain(String input){
        int start=0;
        int end=input.length()-1;
        while(start<end){
            if (input.charAt(start)!=input.charAt(end)) return false;
            start ++;
            end --;
        }
        return true;
    }
}
