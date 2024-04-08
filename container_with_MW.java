package lovebabbar;

public class container_with_MW {
    //container with maximum water
    public static void main(String[] args) {
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(max_water(heights));

    }

    static int max_water(int[] nums) {
        int max_area = 0;
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int height = Math.min(nums[left], nums[right]);
            int width = right - left;
            int curr_area = height * width;
            max_area = Math.max(max_area, curr_area);
            if (nums[left] < nums[right]) {
                left++;
            } else {
                right--;
            }

        }
        return max_area;
    }
}
