package lovebabbar;

import java.util.ArrayList;
import java.util.List;

public class unionofarrays {
    public static void main(String[] args) {
        int [] arr1={1,1,2,3,3,4};
        int[] arr2={3,3,5,6,6};
        System.out.println(union(arr1,arr2));


    }
    static List<Integer> union(int[] arr1,int[]arr2){
        int i=0;
        int j=0;
        List<Integer> ans=new ArrayList<>();
        while (i<arr1.length || j< arr2.length){
            //skip duplicate
            if (i>0 && i< arr1.length && arr1[i]==arr1[i-1]){
                i++;
            }
            if (j>0 && j< arr2.length && arr2[j]==arr2[j-1]){
                j++;
            }
            //one arr got complete
            if (i>= arr1.length){
                ans.add(arr2[j]);
                j++;
                continue;
            }
            if (j>= arr2.length){
                ans.add(arr1[i]);
                i++;
                continue;
            }
            // comparison
            if (arr1[i]>arr2[j]){
                ans.add(arr2[j]);
                j++;
            }
            if (arr1[i]<arr2[j]){
                ans.add(arr1[i]);
                i++;
            }
            else {
                //equal values
                ans.add(arr1[i]);
                i++;
                j++;
            }

        }
        return ans;
    }
}
