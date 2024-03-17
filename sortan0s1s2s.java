package lovebabbar;

import java.util.Arrays;

public class sortan0s1s2s {
    // sorting in 0's 1's and 2's
    public static void main(String[] args) {
        int nums[]={0,2,1,0,1,2,0,2,1,2,2,0,1};
        int ans[]=sort(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] sort(int nums[]){
        int zero=0;
        int one=0;
        int two=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==0){
                zero++;
            }
            if (nums[i]==1){
                one++;
            }
            if (nums[i]==2){
                two++;
            }
        }
        for (int i=0;i<zero;i++){
            nums[i]=0;
        }
        for (int i=zero;i<(one+zero);i++){
            nums[i]=1;
        }
        for (int i=(one+zero);i<nums.length;i++){
            nums[i]=2;
        }

        return nums;
    }


}