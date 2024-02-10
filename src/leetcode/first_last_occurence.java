package leetcode;

import java.util.Arrays;

public class first_last_occurence {
    public static void main(String[] args) {
        int [] nums={5,7,7,8,8,10};
        int target=8;
        int[] ans=searchRange(nums,target);
        System.out.println(Arrays.toString(ans));


    }
    public static int[] searchRange(int[] nums, int target) {
        int [] ans={-1,-1};
        int first_occurence=result(nums,target,true);
        int last_occurence=result(nums,target,false);
        ans[0]=first_occurence;
        ans[1]=last_occurence;
        return ans;


    }
    private static int result(int[] arr,int target,boolean first_occurence) {
        int ans=-1;
        int LI = 0;
        int UI = arr.length - 1;
        if (arr.length==0){
            return -1;
        }
        while (LI <= UI) {
            int mid = (LI + UI) / 2;
            if (arr[mid] == target) {
                if (first_occurence) {
                    UI = mid - 1;
                    ans=mid;
                }
                else {
                    LI=mid+1;
                    ans=mid;
                }
            }
            else if (arr[mid]<target){
                LI=mid+1;
            }
            else if (arr[mid]>target){
                UI=mid-1;
            }
        }
        return ans;
    }
}
