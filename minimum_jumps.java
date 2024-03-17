package lovebabbar;

public class minimum_jumps {
    public static void main(String[] args) {
        int[] nums={1,2,3,1,1,4};
        int ans=jumps(nums);
        System.out.println(ans); // 3 jumps is the answer !!

    }
    static int jumps(int [] nums){
        int jump=0;
        int pos=0;
        int des=0;
        for (int i=0;i< nums.length-1;i++){
            des=Math.max(des,nums[i]+i);
            if (pos==i){
                pos=des;
                jump++;
            }
        }
        return jump;
    }
}
