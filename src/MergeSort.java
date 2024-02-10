import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr={2,8,4,9,15,12,19};
        System.out.println(Arrays.toString(merge(arr)));

    }
    static int[] merge(int[] arr){
        if (arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left= merge(Arrays.copyOfRange(arr,0,mid));
        int[] right=merge(Arrays.copyOfRange(arr,mid,arr.length));
        return merge_(left,right);

    }

    private static int[] merge_(int[] left, int[] right) {
        int[] ans=new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<left.length && j<right.length){
            if (left[i]<right[j]){
                ans[k]=left[i];
                i++;
            }
            else {
                ans[k]=right[j];
                j++;
            }
            k++;
        }
        while (i<left.length){
            ans[k]=left[i];
            i++;
            k++;
        }
        while (j<right.length){
            ans[k]=right[j];
            j++;
            k++;
        }
        return ans;


    }
}
