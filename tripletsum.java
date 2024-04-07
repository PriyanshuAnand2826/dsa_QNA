package lovebabbar;

import java.util.HashMap;

public class tripletsum {
    public static void main(String[] args) {
        int[] nums={1,4,7,9,2};
        int k=9;
        boolean ans=triplet(nums,k);
        System.out.println(ans);

    }
    static boolean triplet(int[] nums,int k){
        int n=nums.length;
        for (int i=0;i<n-2;i++){
            int rem_sum=k-nums[i];
            boolean ans=twoSum(rem_sum,i+1,n-1,nums);
            if (ans){
                return true;
            }
        }
        return false;
    }
    static boolean twoSum(int rem_sum,int start,int end,int[] nums){
        HashMap<Integer ,Integer> map=new HashMap<>();
        for (int i=start;i<=end;i++){
                map.put(nums[i],i);
        }
        for (int i=start;i<end;i++) {
            int rem = rem_sum - nums[i]; //9-2 =7 // get means the value get
            if (map.containsKey(rem) && map.get(rem) != i) {
                return true;
            }
        }
        return false;
}
}
