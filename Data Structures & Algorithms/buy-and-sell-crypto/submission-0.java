class Solution {
    public int maxProfit(int[] prices) {
        int currMin=prices[0],profit=0,maxProfit=0;
        for(int i=1;i<prices.length;i++){
            profit=prices[i]-currMin;
            maxProfit=Math.max(maxProfit,profit);
            currMin=Math.min(currMin,prices[i]);
        }
        return maxProfit;
    }
}
