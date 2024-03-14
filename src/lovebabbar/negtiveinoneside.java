package lovebabbar;

import java.util.Arrays;

public class negtiveinoneside {
    public static void main(String[] args) {
        int nums[]={-2,-4,7,9,3,2,1,-6,-7,9,8};
        int ans[]=negative_in_one_side(nums);
        System.out.println(Arrays.toString(ans));

    }
    static int[] negative_in_one_side(int[] nums){
        int left=0;
        int right=nums.length-1;
        while (left<right){
            if (nums[left]<0){
                left++;
            }
            if (nums[right]>0){
                right--;
            }
            else {
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
            }
        }
        return nums;
    }
}
