class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int n=prices.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(prices[i]+prices[j]<=money){
                    int ans=prices[i]+prices[j];
                    return money-ans;
                }
            }
        }
        return money;
    }
}