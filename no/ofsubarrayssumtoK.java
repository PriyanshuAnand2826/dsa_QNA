package lovebabbar.no;

import java.util.HashMap;

public class ofsubarrayssumtoK {
    public static void main(String[] args) {
        int [] num={1,2,4,2,-6,4,3};
        int ans=num_subarray(num,3);
        System.out.println(ans);
        //optimise soultion
        //3 things
        //1-->Prefix sum
        //2-->Frequency map
        //3.check for sum-k value !!


    }
    static int num_subarray(int[] nums,int k){
        int count=0;
        int sum=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if (map.containsKey(sum-k)){
                count=count+map.get((sum-k));
            }
            if (sum==k){
                count++;
            }
            else {
                if (!map.containsKey(sum)){
                    map.put(sum,0);
                }
                map.put(sum,map.get(sum) +1);
            }
        }
        return count;
    }
}
