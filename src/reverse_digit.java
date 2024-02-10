public class reverse_digit {
    private static int sum=0;

    public static void main(String[] args) {
        reverse(5214);
        System.out.println(sum);

    }
    static void reverse(int num){
        if (num==0){
            return;
        }
        int rem=num%10;
        sum= sum *10 +rem;
        reverse(num/10);
    }
}
