public class removingcharacter {
    public static void main(String[] args) {
        character("","mitali");

    }
    static void character(String ord,String input){
        if (input.isEmpty()){
            System.out.println(ord);
            return;
        }
        char ch=input.charAt(0);
        if (input.startsWith("mit")){
            character(ord,input.substring(3));
        }
        else {
            character(ord+ch,input.substring(1));
        }
    }
}
