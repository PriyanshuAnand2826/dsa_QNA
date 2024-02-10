import java.util.Arrays;

public class fibonacci {
    public static void main(String[] args) {
        int[] arr = {0, 4,7,10, 5};
        int target = 12;
        String ans= Arrays.toString(twosum(arr,target));
        System.out.println(ans);
    }

    static int[] twosum( int arr[], int target ){
        int [] array={-1,-1};

        for(int i = 0; i<arr.length; i++){

            for (int j = i+1; j< arr.length; j++ ){
                if (arr[i] + arr[j] == target){
                    array[0]=i;
                    array[1]=j;
                    return array;




                }



            }
        }
        return array;

    }
}
