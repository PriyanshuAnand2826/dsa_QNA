package lovebabbar;

public class max_profit_stock {
    public static void main(String[] args) {
        int[] stockprices={1,5,6,8,2,9};
        int ans=maxprofit(stockprices);
        System.out.println(ans);

    }
    static int maxprofit(int[] stockprices){
        int min=stockprices[0];
        int max_profit=0;
        for (int i=0;i<stockprices.length;i++){
            min=Math.min(min,stockprices[i]);
            int current_profit=stockprices[i]-min;
            max_profit=Math.max(max_profit,current_profit);
        }
        return max_profit;
    }


}
