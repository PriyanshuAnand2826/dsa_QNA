public class recursion {
    public static void main(String[] args) {
        number(1);
    }

    // 1 2 3 4 5
    static  void number(int n){
        if (n==5){ //base condition
            System.out.println(n);
            return;
        }


        System.out.println(n);
        number(n+1);


}
}
