public class reduce_step {
    public static void main(String[] args) {
        System.out.println(countofsteps(7));


    }
    static int countofsteps(int num){
        return helper(num,0);
    }

    private static int helper(int num, int steps) {
        if (num==0){
            return steps;
        }
        if (num%2==0){
            return  helper(num/2,steps+1);
        }
        else {
            return helper(num-1,steps+1);
        }
    }

    /*private static int step=0;
    static void count (int n){
        if (n==0){
            return;
        }
        if (n%2==0){
            step++;
            count(n/2);
        }
        else {
            step++;
            count(n-1);
        }
    }*/
}
