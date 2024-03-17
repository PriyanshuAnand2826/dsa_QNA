package lovebabbar;

import java.util.ArrayList;
import java.util.Arrays;

public class merge2sortedarrays {
    public static void main(String[] args) {
        int[] arr1={1,3,5,7};
        int[] arr2={0,2,6,8,9};
        int i=0;
        int j=0;
        while (i< arr1.length){
            if (arr1[i]>arr2[j]){
                int temp=arr1[i];
                arr1[i]=arr2[j];
                arr2[j]=temp;
                fixarray(arr2);

            }
            i++;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }

     static void fixarray(int[] arr2) {
        for (int i=1;i< arr2.length;i++){
            if (arr2[i-1]>=arr2[i]){
                int temp=arr2[i-1];
                arr2[i-1]=arr2[i];
                arr2[i]=temp;
            }
        }

    }

}
