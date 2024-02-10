import java.util.Locale;

public class roman {
    public static void main(String[] args) {
        System.out.println(convert("xii"));


    }
    static int convert(String input){
        int count=0;
        input=input.toUpperCase(Locale.ROOT);
        for (int i=0;i<input.length();i++){
            if (input.charAt(i)=='I'){
                count=count+1;
            }
            if (input.charAt(i)=='V'){
                count=count+5;
            }
            if (input.charAt(i)=='X'){
                count=count+10;
            }
            if (input.charAt(i)=='L'){
                count=count+50;
            }
            if (input.charAt(i)=='C'){
                count=count+100;
            }
            if (input.charAt(i)=='D'){
                count=count+500;
            }
            if (input.charAt(i)=='M'){
                count=count+1000;
            }
        }
        return count;
    }
}
