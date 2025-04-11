class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        for(int i=0;i<n;i++){
            totalSum += nums[i];
        }
        int leftSum = 0;
        int rightSum = 0;
        for(int i=0;i<n;i++){
            rightSum = totalSum - leftSum - nums[i];
            if(rightSum== leftSum){
                return i;
            } 
            leftSum = leftSum + nums[i];
        }
        return -1;
    }
}