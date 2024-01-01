class Solution {
    public int missingNumber(int[] nums) {
        int ans=0;
        int n=nums.length;
        int summ=(n*(n+1))/2;
        for(int i=0;i<n;i++){
            ans=ans+nums[i];
        }
        return summ-ans;
    }
}