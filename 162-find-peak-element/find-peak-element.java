class Solution {
    public int findPeakElement(int[] nums) {

        int idx = 0; 
        for (int i = 1; i < nums.length; i++){
            if (nums[i] >nums[idx]) {
                idx= i; 
            }
        }
        return idx;
    }
}