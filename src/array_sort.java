public class array_sort {
    public static void main(String[] args) {
        int [] arr={1,4,8,9,10};
        System.out.println(arra(arr,0));


    }
    static boolean arra(int [] arr,int index){
        if (index==arr.length-1){
            return true;
        }
        if (arr[index]<arr[index+1]){
            return arra(arr,index+1);
        }
        else {
            return false;
        }

    }
}
