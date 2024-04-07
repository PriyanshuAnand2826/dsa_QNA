package lovebabbar;

import java.util.Arrays;

public class nextpermutation {
    public static void main(String[] args) {
        int[] nums={3,1,4,2};
        int[] ans=next(nums);
        System.out.println(Arrays.toString(ans));

    }
    static int[] next(int[] nums){
        int n=nums.length;
        int k=n-2;
        for (int i=n-1;i>0;i--){
            if (nums[i-1]>=nums[i]){ // 2,4
                k--;
            }
            else {
                break;
            }
        }
        if (k==-1){
            reverse(nums,0,n-1);
        }
        else {
            for (int i=n-1;i>0;i--){
                if (nums[i]>nums[k]){
                    int temp=nums[k];
                    nums[k]=nums[i];
                    nums[i]=temp;
                    break;
                }
            }
            reverse(nums,k+1,n-1);
        }
        return nums;
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
