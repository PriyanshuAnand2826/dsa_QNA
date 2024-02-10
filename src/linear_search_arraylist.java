import java.util.ArrayList;
import java.util.List;

public class linear_search_arraylist {
    public static void main(String[] args) {
        int [] arr={2,4,3,4,5,6,6,8,5,6,10,12};
        ArrayList<Integer> list= new ArrayList<>();
        ArrayList<Integer> ans= linearsearch_ar(arr,4,0,list);
        System.out.println(ans);

    }
    static ArrayList<Integer> linearsearch_ar(int [] arr,int target,int index,ArrayList<Integer> list){
        if (index==arr.length){
            return list;
        }
        if (target==arr[index]){
            list.add(index);
        }
        return linearsearch_ar(arr,target,index+1,list);

    }
}
