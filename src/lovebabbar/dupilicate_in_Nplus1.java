package lovebabbar;

public class dupilicate_in_Nplus1 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,1};
        int ans=duplicate(nums);
        System.out.println(ans);

    }
    static int duplicate(int[] nums){
        for (int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i]);
            if (nums[index]<0){
                return index;
            }
            else {
                nums[index]=-nums[index];
            }

        }
        return -1;

    }
}
