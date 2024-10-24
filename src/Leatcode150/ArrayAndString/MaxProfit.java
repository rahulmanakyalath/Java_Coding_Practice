package Leatcode150.ArrayAndString;

public class MaxProfit {

    public int maxProfit(int[] prices) {//O(n).
        int profit=0;
        int minPrice=prices[0];

        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<minPrice)
            {
                minPrice = prices[i];
            }
             profit = Math.max(profit,prices[i]-minPrice);
        }


        return profit;
    }
}
