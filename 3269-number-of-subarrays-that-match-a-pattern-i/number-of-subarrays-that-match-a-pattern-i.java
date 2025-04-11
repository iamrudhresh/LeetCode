class Solution {
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        int n = nums.length;
        int m = pattern.length;

        // Step 1: Convert nums to a pattern comparison array (diff array)
        int[] diff = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            if (nums[i + 1] > nums[i]) {
                diff[i] = 1;
            } else if (nums[i + 1] < nums[i]) {
                diff[i] = -1;
            } else {
                diff[i] = 0;
            }
        }

        // Step 2: Count matching subarrays using a sliding window
        int count = 0;
        for (int i = 0; i <= diff.length - m; i++) {
            boolean matched = true;
            for (int j = 0; j < m; j++) {
                if (diff[i + j] != pattern[j]) {
                    matched = false;
                    break;
                }
            }
            if (matched) {
                count++;
            }
        }

        return count;
    }
}
