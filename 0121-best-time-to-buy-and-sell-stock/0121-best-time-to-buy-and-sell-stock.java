class Solution {
    public int maxProfit(int[] prices) {
        int buyDay=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buyDay){
                buyDay=prices[i];
            }
            else{
                profit=Math.max(profit,prices[i]-buyDay);
            }
        }
        return profit;
    }
}