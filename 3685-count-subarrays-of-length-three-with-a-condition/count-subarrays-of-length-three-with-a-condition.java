class Solution {
    public int countSubarrays(int[] nums) {
        int cnt = 0;
        for (int i = 0; i + 2 < nums.length; i++) {
            if (2 * (nums[i] + nums[i + 2]) == nums[i + 1]) {
                cnt++;
            }
        }
        return cnt;
    }
}