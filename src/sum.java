public class sum {
    public static void main(String[] args) {
        int ans=s(5);
        System.out.println(ans);

    }
    static int s(int n){
        if (n==1){
            return 1;
        }
        return n + s(n-1);
    }

}
