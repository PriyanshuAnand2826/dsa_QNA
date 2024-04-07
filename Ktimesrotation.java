package lovebabbar;

import java.util.Arrays;

public class Ktimesrotation {
    public static void main(String[] args) {
        int[] expectedOutput = {1, 2, 3, 4, 5};
        int k=2;
        System.out.println(Arrays.toString(rotate(expectedOutput,k)));

    }
    static int[] rotate(int[] nums ,int k){
        int n= nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k);
        reverse(nums,k+1,n-1);
        return  nums;



    }

    static int[] reverse(int[] nums,int start,int end){

        while (start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        return nums;
    }
}
