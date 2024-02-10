public class stock {
    public static void main(String[] args) {
        int [] array={1000,2000,3000,40000,50000};
        int min_stock=price(array,true);
        int max_stock=price(array,false);
        System.out.println(answer(min_stock,max_stock));


    }
    static int answer(int min,int max){
        int ans=max-min;
        return ans;
    }
    static int price (int [] array,Boolean min ){
        int ans=array[0];
        if(min){
            for (int i=1;i<array.length;i++){
                if (ans>array[i]){
                    ans=array[i];
                }
            }


        }
        else {
            for (int i=1;i<array.length;i++){
                if (ans<array[i]){
                    ans=array[i];
                }
            }

        }
        return ans;
    }
}
