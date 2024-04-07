package leetcode;

public class reverse_integer {
    public static void main(String[] args) {
        int num =-123;
        System.out.println(reverse(num));


    }


    static int reverse(int x) {
        int ans=reverse_(x,0);
        return ans;

    }
    static int reverse_(int num,int ans) {
        if (num == 0) {
            return ans;
        }
        int rem = num % 10;
        ans = (ans * 10) + rem;
        return reverse_(num / 10, ans);


    }
}

