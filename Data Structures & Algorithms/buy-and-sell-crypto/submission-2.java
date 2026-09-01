class Solution {
    public int maxProfit(int[] prices) {
        int l=0,profit=0,r=l;
        while(r<prices.length){
            if(prices[l]>prices[r]){
                l=r;
            }else{
                profit = Math.max(profit,prices[r]-prices[l]);
            }
            r++;
        }
        return profit;
    }
}
