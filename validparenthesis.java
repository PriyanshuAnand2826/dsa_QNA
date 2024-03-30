package lovebabbar;

import java.util.Stack;

public class validparenthesis {
    public static void main(String[] args) {
        String input="(((";
        System.out.println(valid(input));

    }
    static boolean valid(String input){
        Stack <Character> stack=new Stack<>();
        for (int i=0;i<input.length();i++){
            if ((input.charAt(i)=='(' ) || (input.charAt(i)=='{' ) || (input.charAt(i)=='[' )){
                stack.push(input.charAt(i));
            }
            else {
                if (stack.isEmpty())return false;
                if (input.charAt(i)==')' && stack.peek()!='(')return false;
                if (input.charAt(i)==']' && stack.peek()!='[')return false;
                if (input.charAt(i)=='}' && stack.peek()!='{')return false;
                stack.pop();
            }
        }
        if (!stack.isEmpty()) return false;
        return true;
    }
}
