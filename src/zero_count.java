public class zero_count {
    public static void main(String[] args) {
        System.out.println(count_r(300002041));



    }
    static int count_r(int n){
        int count=0;
        while (n>0){
            if (n%10==0){
                count++;
            }
            n=n/10;
        }
        return count;

    }
    /*private static int count=0;
    static void count_recursion(int n){
        if (n==0){
            return;
        }
        if (n%10==0){
            count++;
        }
        count_recursion(n/10);
    }*/

}
