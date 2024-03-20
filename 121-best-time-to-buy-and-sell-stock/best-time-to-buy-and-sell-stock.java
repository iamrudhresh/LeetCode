class Solution {
    public int maxProfit(int[] prices) {
        int mini = prices[0];
        int maxi = 0;
        int n = prices.length;
        for(int i=0;i<n;i++){
            int prof = prices[i] - mini;
            maxi = Math.max(prof,maxi);
            mini = Math.min(mini,prices[i]);
        }
        return maxi;
    }
}