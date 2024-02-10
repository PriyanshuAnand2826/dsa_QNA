import java.util.List;
import java.util.Scanner;

public class sumofn {
    public static void main(String[] args) {
        //System.out.println(sum(5));
        //input(4);
        //System.out.println(fibo(7));
        System.out.println(remove("mitali"));

    }
    static  int sum(int n){
        int count=0;
        for (int i=1;i<=n;i++){
            if (i%2!=0){
                count=count+i;
            }
        }
        return count;
    }
    static void input(int n){
        int i=0;
        Scanner sc =new Scanner(System.in);
        while (i<n){
            System.out.println("enter the number = ");
            int num=sc.nextInt();
            i++;
        }
    }
    static int fibo(int n){
        if (n<=1){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
    static String remove(String input){
        String ans="";
        for (int i=0;i<input.length();i++){
            if (input.charAt(i)=='a'){
                continue;
            }
            ans=ans + input.charAt(i);

        }
        return ans;
    }

}
