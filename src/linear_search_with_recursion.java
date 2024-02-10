public class linear_search_with_recursion {
    public static void main(String[] args) {
        int [] arr={2,4,15,18,19,45,54};
        int ans=linearsearch(arr,4,0);
        System.out.println(ans);

    }
    static int linearsearch(int[] arr,int target,int index){
        if (index==arr.length){
            return -1;
        }
        if (target==arr[index]){
            return index;
        }
        else {
            return linearsearch(arr,target,index+1);
        }
    }
}
