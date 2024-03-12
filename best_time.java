public class best_time {
    public int maxProfit(int[] prices) {
        int min=prices[0],p = 0,c;
        for(int a=0;a<prices.length;a++) {
        if(prices[a]<min) {
            min=prices[a];
        }
        c=prices[a]-min;
        if(c>p) {
            p=c;
        }
        }
        return p;
    }
}
