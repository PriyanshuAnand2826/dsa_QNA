package lovebabbar;

public class seacrh_in_rotatedA {
    public static void main(String[] args) {
        int [] nums = {4, 5, 6, 7, 0, 1, 2};
        int target=0;
        System.out.println(search(nums,0, nums.length-1,target));

    }
    static int search(int[] arr,int left,int right,int target){
        if (left>right){
            return -1;
        }
        int mid=left + ((right-left) / 2) ;
        if (arr[mid]== target){
            return mid;
        }
        // if left part is sorted !!
        if (arr[left]<=arr[mid]){
            if (arr[left]<= target && target <= arr[mid]){
                return search(arr,left,mid-1,target);
            }
            else {
                return search(arr,mid+1,right,target);
            }
        }
        // if right part is sorted !!
        else {
            if (target <=arr[right] && target >= arr[mid]){
                return search(arr,mid+1,right,target);
            }
            else {
                return search(arr,left,mid-1,target);
            }
        }
    }
}
