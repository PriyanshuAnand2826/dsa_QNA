public class sum_n {
    public static void main(String[] args) {
        int ans=sum(5421);
        System.out.println(ans);

    }
    static int sum(int n){
        if (n==0){
            return 0;
        }
        return n% 10 + sum(n/10);

    }
}
