package lovebabbar;

import java.util.Arrays;

//to reverse an array using swapping!!
public class reversearray {
    public static void main(String[] args) {
        int[] arr={12,13,14,15,19};
       reverse(arr);

    }
    static void reverse(int[] arr){
        int n=arr.length;
        for (int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
