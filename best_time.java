
public class Solution{
    public int maxProfit(int[] prices) {
        int min=prices[0],profit= 0,currect;
        for(int a=0;a<prices.length;a++) {
        if(prices[a]<min) {
            min=prices[a];
        }
        currect=prices[a]-min;
        if(currect>profit) {
            profit=currect;
        }
        }
        return profit;
    }
}
