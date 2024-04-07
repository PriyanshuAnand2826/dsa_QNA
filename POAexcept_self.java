package lovebabbar;

import java.util.Arrays;

public class POAexcept_self {
    public static void main(String[] args) {
       int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(product(nums)));

    }
    static int[] product(int[] nums){
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        int[] ans=new int[nums.length];
        for (int i=1;i< nums.length;i++){
            left[0]=1;
            left[i]= left[i-1]*nums[i-1];
        }
        for (int i= nums.length-2 ;i>=0;i--){
            right[nums.length-1]=1;
            right[i]= right[i+1]*nums[i+1];
        }
        for (int i=0;i< nums.length;i++){
            ans[i]= left[i]*right[i];
        }
        return ans;
    }
}
