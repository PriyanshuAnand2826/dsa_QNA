package lovebabbar;

import java.util.HashSet;

public class repeating_charaacters {
    public static void main(String[] args) {
        String input="mitalqsweopkhj";
        System.out.println(isrepeat(input));
    }
    static boolean isrepeat(String input){
        HashSet seen=new HashSet();
        for (int i=0;i<input.length();i++){
            if (!seen.add(input.charAt(i))) return false;
        }
        return true;
    }
}
