package leetcode;

public class equivalent_strings {
    public static void main(String[] args) {
        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};
        Boolean ans=equivalent(word1,word2);
        System.out.println(ans);

    }
    static boolean equivalent(String[] word1,String[] word2){
        String ans1="";
        String ans2="";
        for (int i=0;i<word1.length;i++){
            ans1=ans1+word1[i];
        }
        for (int i=0;i<word2.length;i++){
            ans2=ans2+word2[i];
        }
        if (ans1.equals(ans2)){
            return true;
        }
        else {
            return false;
        }


    }
}
