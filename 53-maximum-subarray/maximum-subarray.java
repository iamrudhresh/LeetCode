class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += nums[i];
            maxi = Math.max(sum,maxi);
            
            if(sum<0) sum = 0;
        }
        
        return maxi;
    }
}