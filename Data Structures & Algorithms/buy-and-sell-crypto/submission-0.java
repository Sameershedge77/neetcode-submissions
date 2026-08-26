class Solution {
    public int maxProfit(int[] prices) {
       int maxprofit=0;
       int minprice=prices[0];
       for(int i=0;i<prices.length;i++){
        if(prices[i]<minprice){
            minprice = prices[i];
        }
        int profit = prices[i]-minprice;
        if(profit>maxprofit){
            maxprofit=profit;
        }
       }
       return maxprofit;
    }
}
