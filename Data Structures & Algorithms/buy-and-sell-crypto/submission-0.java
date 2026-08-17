class Solution {
    public int maxProfit(int[] prices) {
        int l=0,r=1;
        int profit=0,maxProfit=0;
        while(r<prices.length){
            if(prices[l]<prices[r]){
                profit=(prices[r]-prices[l]);
                maxProfit=Math.max(maxProfit,profit);
            }else{
                l=r;
            }
            r++;
        }
        return maxProfit;
    }
}

