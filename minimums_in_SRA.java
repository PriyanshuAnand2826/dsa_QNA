package lovebabbar;

import java.util.Arrays;

public class minimums_in_SRA {
    // minimum in rotated sorted array
    public static void main(String[] args) {
        int[] rotatedArray = {4, 5, 6, 7, 0, 1, 2};
        int minElement = sorted(rotatedArray);
        System.out.println(minElement);

    }
    static int sorted(int[] arr){
        // sorted means binary seacrh
        int start=0;
        int end= arr.length-1;
        while (start<end){
            int mid=start + ((end-start)/2);
            if (arr[mid]>arr[end]){
                //left part is sorted
                //means search in right
                start=mid+1;
            }
            else{
                //right part is sorted
                //means search in left
                end=mid;
            }

        }
        return arr[start];
    }
}
