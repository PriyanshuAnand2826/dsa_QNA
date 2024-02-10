public class reverse_string {
    public static void main(String[] args) {
        String name="Priyanshu";
        String reverse="";
        for (int i=0;i<name.length();i++){
            reverse=name.charAt(i) + reverse;
        }
        System.out.println(reverse);
    }
}
