public class long_sub {
    public static void main(String[] args) {
        //we have to find longest palindrome from the given string !!
        System.out.println(run("anacnaucxanamanjcsncjsnc"));


    }
    static String run(String input){
        String hold="";
        String ans="";
        int len=0;
        for (int i=0;i<input.length();i++){
            for (int j=i+1;j<input.length();j++){
                hold=input.substring(i,j); // to find all the substring
                Boolean ispalin=ispalin(hold); //either true or false
                if (ispalin && (hold.length()>len)){
                    ans=hold;
                    len=hold.length();

                }
            }
        }
        return ans;


    }
    static boolean ispalin(String input){
        int i=0;
        int j=input.length()-1;
        while (i<=j){
            if (input.charAt(i)==input.charAt(j)){   // N  A  M   A  N
                i++;
                j--;
            }
            else {
                return false;
            }
        }
        return true;
    }

}
