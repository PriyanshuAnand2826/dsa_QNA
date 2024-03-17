package lovebabbar;

public class largestsubarray {
    public static void main(String[] args) {
        int[] nums={2,-3,1,4,5,7};
        int ans=largesubarray(nums);
        System.out.println(ans);
    }
    static int largesubarray(int[] nums){
        int check_sum=0;
        int best_sum=Integer.MIN_VALUE;
        for (int i=0;i< nums.length;i++){
            check_sum=Math.max(nums[i],check_sum+nums[i]);
            best_sum=Math.max(best_sum,check_sum);
        }
        return best_sum;

    }
}
