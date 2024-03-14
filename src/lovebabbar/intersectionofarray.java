package lovebabbar;

import java.util.ArrayList;
import java.util.List;

public class intersectionofarray {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 3, 4};
        int[] arr2 = {3, 3, 4, 5, 6};
        // skip duplicate
        int i = 0;
        int j = 0;
        List<Integer> ans = new ArrayList<>();
        while (i < arr1.length && j < arr2.length) {
            //skip duplicate
            if (i > 0 && i < arr1.length && arr1[i] == arr1[i - 1]) {
                i++;
            }
            if (j > 0 && j < arr2.length && arr2[j] == arr2[j - 1]) {
                j++;
            }
            //comparison
            if (arr1[i]>arr2[j]){
                j++;
            }
            if (arr1[i]<arr2[j]){
                i++;
            }
            else {
                //equal values
                ans.add(arr1[i]);
                i++;
                j++;
            }

        }
        System.out.println(ans);
    }
}
