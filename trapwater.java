package lovebabbar;

public class trapwater {
    public static void main(String[] args) {
        int [] heights = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int ans=trap(heights);
        System.out.println(ans);

    }
    static int trap( int[] height){
        int n=height.length;
        int totalwater=0;
        int max_height=0;
        int max_index=0;
        int trappp=0;
        int left_max=0;
        for (int i=0;i<n;i++){
            if (height[i]>max_height){
                max_height=height[i];
                max_index=i;
            }
        }
        // part 1
        for (int i=0;i<max_index;i++){
            left_max=Math.max(left_max,height[i]);
            trappp=Math.min(left_max,max_height)-height[i];
            totalwater=totalwater+trappp;

        }
        left_max=0;


        //part 2
        for (int i=n-1;i>max_index;i--){
            left_max=Math.max(left_max,height[i]);
            trappp=Math.min(left_max,max_height)-height[i];
            totalwater=totalwater+trappp;
        }

        return totalwater;
    }
}
