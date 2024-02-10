public class validity {
    public static void main(String[] args) {
        String input_="({[}])";
        System.out.println(valid_string(input_));



    }
    static boolean valid_string(String input) {
        int i = 0;
        int length = input.length();
        int j = input.length() - 1;
        boolean ans = true;
        if (length % 2 != 0) {
            return false;
        } else {
            while (i < j) {
                if ((input.charAt(i) == '(' && input.charAt(j) == ')') ||
                        (input.charAt(i) == '{' && input.charAt(j) == '}') ||
                        (input.charAt(i) == '[' && input.charAt(j) == ']')) {
                    i++;
                    j--;
                } else {
                    return false;
                }
            }
            return ans;
        }
    }
}
